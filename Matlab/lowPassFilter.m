function filteredArr = lowPassFilter(dataArr, inertia)
lastValue = -1;
[numRows numCols] = size(dataArr);
filteredArr = zeros(numRows, numCols);

if((inertia < 0) || (inertia > 1))
    inertia = 0.5;
end

for i = 1:numRows
    if(lastValue == -1)
        lastValue = dataArr(i,1);
    end
    filteredArr(i,1) = lastValue*inertia + dataArr(i,1)*(1-inertia);
    filteredArr(i,2) = dataArr(i,2);
    lastValue = filteredArr(i,1);
end

end