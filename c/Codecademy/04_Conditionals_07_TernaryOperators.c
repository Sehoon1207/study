#include <stdio.h>

int main() {

  int a = 10;
  int b = 5;
  int min;

  // Print out the smaller number with return
  min = a < b ? a : b;
  printf("%d\n", min);

  // Print out the smaller number without return
  a < b ? printf("%d\n", a) : printf("%d\n", b);

/*
A ternary operator looks like this:

condition ? do something : do something else;

The above example is exactly the same as:

if (condition) {
  // Do something
} else {
  // Do something else
}

-----------------------------------------------
ex)

if (a < b) {
  min = a;
} else {
  min = b;
}

min = a < b ? a : b;

*/

}