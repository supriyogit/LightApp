#!/bin/bash

filename='tree.txt'
echo $filename

while read line
do
        #remove leading and trailing white spaces
        line="${line#"${line%%[![:space:]]*}"}"
        line="${line%"${line##*[![:space:]]}"}"
        sed -E -i 's/^( *)([0-9]+)/void f$2\(\) \{\r/' $line
        echo $line
done <$filename
