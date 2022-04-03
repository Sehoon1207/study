#include <stdio.h>

int main() {
  
  char targetChar;
  int sourceInt = 99;
  double sourceDouble = 55.67;

  // Cast here
  targetChar = sourceDouble; //암시적방법

  // No need to change below here
  printf("source int %d, source double, %.2f, target %c\n", sourceInt, sourceDouble, targetChar);

/*
A more interesting casting option is converting a char to a number type, or the other way around. Just like before, you have to be careful how you set this up. In the back-end, a char doesn’t store 'a', it stores the value representing that: 97 for lowercase and 65 for uppercase.
백 엔드에서 char는 'a'를 저장하지 않고, a(소문자)의 경우 97, A(대문자)의 경우 65를 나타내는 값을 저장

예)
int targetInt;
char sourceChar = 'a';
targetInt = (int)sourceChar;
Now targetInt equals 97.

int sourceInt = 65;
char targetChar;
targetChar = (char)sourceInt;
targetChar now equals 'A'.
*/

}