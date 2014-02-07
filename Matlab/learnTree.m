clear all;

%load jamesbond.txt_labelled.dat;
load starwar.txt_labelled.dat;
load browsing.txt_labelled.dat;
%load lightson.txt_labelled.dat;

labelIndex = 2;
other = 0;
movie = 1;

% Use 50 samples to compute the features
numSamples = 50;

% featureJames = createFeatureArr(jamesbond_txt_labelled, numSamples, movie);
% featureStarwar = createFeatureArr(starwar_txt_labelled, numSamples, movie);
% featureBrowsing = createFeatureArr(browsing_txt_labelled, numSamples, other);
% featureLight = createFeatureArr(lightson_txt_labelled, numSamples, other);

splitRate = 0.8;

[numRows1 numCols1] = size(featureJames);
trainSetSize1 = ceil(splitRate*numRows1);

[numRows2 numCols2] = size(featureStarwar);
trainSetSize2 = ceil(splitRate*numRows2);

[numRows3 numCols3] = size(featureBrowsing);
trainSetSize3 = ceil(splitRate*numRows3);

[numRows4 numCols4] = size(featureLight);
trainSetSize4 = ceil(splitRate*numRows4);

xTrain = [featureJames(1:trainSetSize1,1:numCols1-1); ...
    featureStarwar(1:trainSetSize2,1:numCols2-1); ...
    featureBrowsing(1:trainSetSize3,1:numCols3-1); ...
    featureLight(1:trainSetSize4,1:numCols4-1)];

yTrain = [featureJames(1:trainSetSize1,numCols1); ...
    featureStarwar(1:trainSetSize2,numCols2); ...
    featureBrowsing(1:trainSetSize3,numCols3); ...
    featureLight(1:trainSetSize4,numCols4)];

[numTrain numColTrain] = size(xTrain);


t = classregtree(xTrain, yTrain, 'method','classification','prune','off', ...
    'Cost', [0 100; 1 0]);
%view(t);

%# test
t = prune(t, 'Level',30);
view(t);

xTest = [featureJames(trainSetSize1+1:numRows1,1:numCols1-1); ...
    featureStarwar(trainSetSize2+1:numRows2,1:numCols2-1); ...
    featureBrowsing(trainSetSize3+1:numRows3,1:numCols3-1); ...
    featureLight(trainSetSize4+1:numRows4,1:numCols4-1)];

yTest = [featureJames(trainSetSize1+1:numRows1,numCols1); ...
    featureStarwar(trainSetSize2+1:numRows2,numCols2); ...
    featureBrowsing(trainSetSize3+1:numRows3,numCols3); ...
    featureLight(trainSetSize4+1:numRows4,numCols4)];

yPredicted = eval(t, xTest);

cm = confusionmat(yTest, str2num(cell2mat(yPredicted)));   %# confusion matrix
N = sum(cm(:));
err = ( N-sum(diag(cm)) ) / N;          %# testing error


