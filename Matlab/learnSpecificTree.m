clear all;

load DataSet5/Movies.dat;
load DataSet5/Other.dat;

%%%%%%%%%%%%%%%%%%%%%%%%%%%%
numSamples = 50;
pruneToLevel = 10;
costMatrix = [0 30; 1 0];
%%%%% Utility Labels %%%%%%
veryDark = 0;
dark = 1;
bright = 2;
%%%%%% Privacy Labels %%%%%
labelIndex = 2;
other = 0;
movie = 1;
%%%%%%%%%%%%%%%%%%%%%%%%%%%%

dataArr = [Movies;Other];
[featureMovies xlabelMovie] = createFeatureArr(Movies, numSamples, movie);
[featureOther xlabelOther] = createFeatureArr(Other, numSamples, other);
[numRows numCols] = size(featureMovies);

featureArr = [featureMovies(:,1:numCols-1); featureOther(:,1:numCols-1)];
yLabelArr = [featureMovies(:, numCols); featureOther(:, numCols)];

decisionTree = classregtree(featureArr, yLabelArr, 'method','classification',...
'prune','off','Cost', costMatrix);
decisionTree = prune(decisionTree, 'Level',pruneToLevel);
view(decisionTree);
[numDataPoints numFeatures] = size(featureArr);

inertia = 0.9:0.01:0.99;
outputArr = zeros(numDataPoints, length(inertia) + 1);
[yPredicted nodeVec] = eval(decisionTree, featureArr);

outputArr(:,1) = nodeVec;

for i = 1:length(inertia)
    filteredMovies = lowPassFilter(Movies, inertia(i));
    filteredOther = lowPassFilter(Other, inertia(i));
    [featureMovies xlabelMovie] = createFeatureArr(filteredMovies, numSamples, movie);
    [featureOther xlabelOther] = createFeatureArr(filteredOther, numSamples, other);
    [numRows numCols] = size(featureMovies);
    featureArr = [featureMovies(:,1:numCols-1); featureOther(:,1:numCols-1)];
    [yPredicted nodeVec] = eval(decisionTree, featureArr);
    outputArr(:,i+1) = nodeVec;
end
csvwrite('output.dat',outputArr);