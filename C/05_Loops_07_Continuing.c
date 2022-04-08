#include <stdio.h>

int main() {

  int i = 0;

  while (i < 10) {
    // Figure out how to skip the print of 5 here
    if (i == 5) {
    continue;
    }
    printf("%d\n", i);
    i++;
  }


  for(i = 0; i <10 ; i ++){
    if (i == 5) {
    continue;
    }
    printf("%d\n", i);
  }

/*
continue;
In a loop, if a continue is ever reached, it will immediately skip the rest of the statements inside the loop body and “continue” into the next iteration.
루프에서 계속에 도달하면 루프 본문 내부의 나머지 명령문을 즉시 건너뛰고 다음 반복으로 "계속"합니다.
*/


}