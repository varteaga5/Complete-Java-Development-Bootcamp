#! /bin/bash

# ECHO COMMAND
echo Hello Vincent!

# VARIABLES
# Upper case by convention
# letter, numbers, underscores

# NAME="Vincent"
# echo "my name is $NAME"
# # or you can do: 
# echo "my name is ${NAME}"

# # user input:
# read -p "enter your name: " NAME

# echo "hello $NAME, nice to meet you"

# conditionals
# if [ "$NAME" == "VINCENT" ]
# then
#     echo "hello vINCENT"
# fi

# IF ELSE

# if [ "$NAME" == "VINCENT" ]
# then
#     echo "hello vINCENT"
# else 
#     echo "Your name is NOT Vincent"
# fi

# else if elif
# if [ "$NAME" == "VINCENT" ]
# then
#     echo "hello vINCENT"
# elif [ "$NAME" == "Jack" ]
# then    
#     echo "hello jack"
# else 
#     echo "your name is not brad"
# fi

# comparison operators
# val1 -eq val2     returns true if the values are equal
# val1 -ne val2     returns true if the values are NOT equal
# val1 -gt val2     returns true if the val1 greater than val2
# val1 -ge val2     returns true if the val1 greater than or equal to val2
# val1 -lt val2     returns true if the val1 less than val2
# val1 -le val2     returns true if the val1 less than or equal to  val2

# NUM1=3
# NUM2=5

# if [ "$NUM1" -gt "$NUM2" ]
# then 
#     echo "$NUM1 is greater than $NUM2"
# else
#     echo "$NUM1 is less than $NUM2"
# fi

# file conditions

# FILE="test.txt"

# -d file       true if the file is in the directory
# -e file       true if the file exists note that this is not portable thus -f is generally used
# -f file       true if the provided string is a file
# -g file       true if the group id is set on a file
# -r file       true if the file is readable
# -s file       true if the file has a non zero size
# -u            true if the user id is set on a file
# -w            true if the file is writable

# if [ -f "$FILE" ]
# then 
#     echo "$FILE is a file"
# else 
#     echo "$FILE is NOT a file"
# fi

# if [ -e "$FILE" ]
# then 
#     echo "$FILE exists"
# else 
#     echo "$FILE does not exist"
# fi

# case statements

# read -p "are you 21 or over? Y/N " ANSWER

# case "$ANSWER" in
#     [yY] | [yY][eE][sS])
#         echo "you can have a beer :)"
#         ;;
#     [nN] | [nN][oO])
#         echo "Sorry no drinking"
#         ;;
#     *)
#         echo "please enter y/yes or n/no"
#         ;;
# esac

# simple for loop
NAMES="V A B M"
for NAME in $NAMES  
    do  
        echo "hello $NAME"
    done
    
    # for loop to rename files
    # FILES=$(ls *.txt)
    # NEW="new"
    # for FILE in $FILES
    #     do 
    #         echo "renaming $FILE to new-$FILE"
    #         mv $FILE $NEW-$FILE
    #     done

# while loop - read through a file line by line and print each line with number inront
# LINE=1
# while read -r CURRENT_LINE
# do 
#     echo "$LINE: $CURRENT_LINE"
#     ((LINE++))
#     done < "./bashtestfile.txt"

# functions
# function sayHello() {
#     echo "Hello Vincent"
# }
# sayHello

# functions with params
# function greet() {
#     echo "hello, i am $1 and i am $2"
# }

# greet "Vincent" "32"

# create folder and write to a file
mkdir hello
touch "hello/world.java"
echo "hello Vincent, this is how you write to a file" >> "hello/world.java"
echo "Created hello/world.java"