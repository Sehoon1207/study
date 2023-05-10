#include <stdio.h>

int main() {
  char p[] = "procezzor";
  // Checkpoint 1 code goes here
  //Print the third character of the string p
  printf("%c\n", p[2]);


  // Checkpoint 2 code goes here
  //The string p incorrectly attempts to spell the word “processor”. Correct this mistake.
  p[5] = 's';
  p[6] = 's';

  printf("%s", p);


  
}