#!/bin/bash
#
# Look for \t in the template folders and report errors if found
# as these tabs should be replaced with 4-space instead

## declare an array of folders
declare -a samples=("src/main/resources/kotlin-server"
                    "src/main/resources/kotlin-spring"
                    "src/main/resources/dart-dio"
                    "src/main/resources/dart"
                    "src/main/resources/dart2"
                    "src/main/resources/aspnetcore"
                    "src/main/resources/powershell"
                    )

## now loop through the above array
for i in "${samples[@]}"
do
   # grep for \t in the folder
   RESULT=`grep -R -P "\t" $i`
   echo -e "$RESULT"
   
   if [ "$RESULT" != "" ]; then
       echo "Template files contain tab '\\t'. Please remove it or replace it with 4-space."
       exit 1;
   fi
done

