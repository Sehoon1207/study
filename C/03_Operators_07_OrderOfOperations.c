#include <stdio.h>

int main() {
  
  int x;
  int y;

  x = (2 + 3) * 5;
  y = 2 / (4 + 6);            // = 0.2 ** int는 소수점을 짤라버림


  printf("x is: %d\n", x);
  printf("y is: %d\n", y);

/*
priority 
Priority	Symbol
1	        ++
1	        --
1	        ()
2	        !
2	        (typecast)
3	        *
3	        /
3	        %
4	        +
4	        -
5	        <, <=
5	        >, >=
6	        ==, !=
7	        &&
8	        ||
9	        all assignment operators
*/


}