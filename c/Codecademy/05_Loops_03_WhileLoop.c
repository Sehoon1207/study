#include <stdio.h>

int main() {

  int i = 9;
  int square = 0;

  // Write a while loop here:
  while ( i < 10 && i >= 0 ) {
    printf("%d\t%d\n", i, i * i);
    i -= 1;
  }

}