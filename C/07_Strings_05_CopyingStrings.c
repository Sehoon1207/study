#include<stdio.h>
#include<string.h>

int main() {
  
  char src[] = "banana";
  char dst[7];
  
  char pan[] = "How vexingly quick daft zebras jump!";
  int len = strlen(pan)+1; // Checkpoint 2
  char dst2[len];
  
  // Code for checkpoint 1 goes here
  strcpy(dst, src);  
  printf("%s\n", dst);  
  
  // Code for checkpoint 3 goes here

  strcpy(dst2, pan);  
  printf("%s", dst2);


/*
strcpy(dst, src);

문자열 src와 빈 문자열(빈 문자 배열) dst가 주어지면 
strcpy() 함수는 src 문자열의 내용을 dst 문자열로 복사합니다. 
빈 문자 배열 dst의 크기는 다음보다 크거나 같아야 합니다. 
들어오는 모든 문자를 수용하기 위해 문자열 src의 길이에 널 문자('\0')만큼의 1을 더한 것과 같습니다. 
dst char 배열이 너무 짧으면 프로그램이 정의되지 않은 동작을 나타냅니다. 
strcat() 함수와 유사하게 새 문자열이 생성되지 않습니다.

*/



}