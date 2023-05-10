#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void repeatDigit(int);
int getRandomNumber(int);

// Define prototypes above
// the function definitions
void repeatDigit(int repetitions) {
  int digit = getRandomNumber(9);
  for(int i = 0; i < repetitions; i++) {
    printf("%d ", digit);
  }
  printf("\n");
}

int getRandomNumber(int maxNumber) {
  int randomNumber = rand() % maxNumber + 1;
  return randomNumber;
}

int main(void) {
  srand(time(NULL));
  int repetitions = getRandomNumber(10);
  repeatDigit(repetitions);
}

/* do it
1. Create a function prototype for repeatDigit()
2. Just under the first prototype, create a function prototype for getRandomNumber()
*/

/*
Instead of making sure our functions are always declared above where they are called, a good practice is to define function prototypes at the top of our code:

The compiler is concerned with 3 things when it comes to function prototypes:

1. The function name
2. The return type
3. The parameter type(s)
*/
