#include <stdio.h>

int main() {

  int i = 11;

/* 
  while (i < 10) {
    printf("%d\n", i);
    i++;
  }
*/

  do {
    printf("%d\n", i);
    i++;
  } while (i < 10);

/*
do {
  // Statement(s)
} while (condition);

Simply put, it does something first, and then checks the condition afterward and loops in this manner until the condition is no longer true.
The do-while loop is most often used when a program wants to do something at least once before checking the condition.

간단히 말해서, 먼저 무언가를 수행한 다음 나중에 조건을 확인하고 조건이 더 이상 참이 아닐 때까지 이러한 방식으로 반복합니다.

do-while 루프는 프로그램이 조건을 확인하기 전에 적어도 한 번은 무언가를 하려고 할 때 가장 자주 사용됩니다.
*/

}