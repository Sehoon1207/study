#include <stdio.h>      // needed for printf()
#include <stdlib.h>     // needed for 2 random number generator functions, srand() and rand().
#include <time.h>       // needed to use the time() function.

int main(void) {
  srand(time(NULL));    // Without this line of code, every random number generated in this exercise will be the same number each time you run the code.

  // Write your code below
/*
  1. Declare an integer variable randomNumber and set it equal to rand()
  2. Output the value of randomNumber using printf()
  3. Using %, change the line of code, int randomNumber = rand() so that randomNumber will be between 0 and 19
  4. Add a + 1 to the end of the code so randomNumber becomes a number between 1 and 20.
*/


  int randomNumber = rand()%20+1;
  printf("%i", randomNumber);

  /*
  printf(): to output text to the console
  printf(): 콘솔에 텍스트 출력

  abs(): to find the absolute value of an integer
  abs(): 정수의 절대값 찾기

  ceil(): takes any number as an argument, rounds it up to the nearest integer, and returns the integer.
  ceil(): 임의의 숫자를 인수로 사용하여 가장 가까운 정수로 반올림한 다음 정수를 반환합니다.

  log(): takes an integer as an argument and returns the natural logarithm of the given number.
  log(): 정수를 인수로 취하고 주어진 숫자의 자연 로그를 반환합니다.

  toupper(): takes a char as an argument and returns the uppercase of any alphabetic character.
  toupper(): char를 인수로 취하고 모든 알파벳 문자의 대문자를 반환합니다.

  isupper(): takes a char as an argument and returns 1 if the character is an uppercase letter, 0 otherwise.
  isupper(): char을 인수로 취하고 문자가 대문자이면 1을 반환하고 그렇지 않으면 0을 반환합니다.

ex)
#include <stdio.h>
#include <math.h>
#include <ctype.h>
int main() {
  float number = 4.5;
  char letter = 'a';
  printf("%f\n", ceil(number)); // 5.000000
  printf("%f\n", log(number)); // 1.504077
  printf("%d\n", isupper(letter)); // 0
  letter = toupper(letter);
  printf("%d\n", isupper(letter)); // 1
}


  */
}