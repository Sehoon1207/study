#include <stdio.h>

int main() {
    printf("int: %ld \n", sizeof(int));
    printf("float: %ld \n", sizeof(float));
    printf("double: %ld \n", sizeof(double));
    printf("char: %ld \n", sizeof(char));

    return 0;
}

/*

int: 4 
float: 4 
double: 8 
char: 1 

-------------------------------------------------------------

C supports the following basic data types: 

int: integer, a whole number.
float: floating point, a number with a fractional part.
double: double-precision floating point value.
char: single character.

C has a built-in sizeof operator that gives the memory requirements for a particular data type.

The program output displays the corresponding size in bytes for each data type.

The printf statements in this program have two arguments. 
The first is the output string with a format specifier (%ld), 
while the next argument returns the sizeof value. In the final output, 
the %ld (for long decimal) is replaced by the value in the second argument.

*/