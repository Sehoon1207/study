/*
입력

C는 사용자 입력을 받는 여러 가지 방법을 지원합니다.
getchar() 다음 단일 문자 입력의 값을 반환합니다.
*/

#include <stdio.h>

int main() {
  char a = getchar();

  printf("You entered: %c", a);

  return 0;
}


/*
입력은 변수 a에 저장됩니다.
gets() 함수는 문자열이라고도 하는 정렬된 문자 시퀀스로 입력을 읽는 데 사용됩니다.
문자열은 char 배열에 저장됩니다.


#include <stdio.h>

int main() {
  char a[100];

  gets(a); 

  printf("You entered: %s", a);

  return 0;
}


여기에서 입력을 100자 배열에 저장했습니다.
scanf()는 형식 지정자와 일치하는 입력을 검색합니다.


#include <stdio.h>

int main() {
  int a;
  scanf("%d", &a);

  printf("You entered: %d", a);

  return 0;
}

변수 이름 앞의 & 기호는 주소 연산자입니다. 
변수의 주소 또는 메모리 위치를 제공합니다. 
이것은 scanf가 변수 주소에 입력 값을 배치하기 때문에 필요합니다.
또 다른 예로, 두 개의 정수 입력을 요청하고 그 합을 출력해 보겠습니다.

#include <stdio.h>

int main() {
  int a, b;
  printf("Enter two numbers:");
  scanf("%d %d", &a, &b);

  printf("\nSum: %d", a+b);

  return 0;
}


*/