#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// Modify the code below
int getRandomNumber(int maxNumber) {
  int randomNumber = rand() % maxNumber + 1;
  return randomNumber;
}


int main(void) {
  //if a function does not have any parameters you should put void in between the parentheses. 
  srand(time(NULL));
  // Modify the code below
  int randomNumber = getRandomNumber(100);
  printf("My random number is: %d", randomNumber);
}


/*
1. Add an integer parameter maxNumber
2. Replace the upper range number in the random equation with, maxNumber
3. Assign randomNumber to getRandomNumber() with the argument 100

*/