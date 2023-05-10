#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// Modiy the code below
int getRandom1000() {
  int random1000 = rand() % 1000 + 1;
  return random1000;
}

int main(void) {
  srand(time(NULL));
  // Modify the code below
  int randomNumber = getRandom1000();
  printf("My random number is: %d", randomNumber);
}


/*
1. Change the return type so the function can return an integer.
2. Return the variable random1000
3. Replace the 0 with a call getRandom1000() and store the return value in the variable randomNumber.
*/