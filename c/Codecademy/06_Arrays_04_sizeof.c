#include<stdio.h>

int main() {
  double arr[] = {1.0, 8, 2.27, 16.2, 2, 3.14, 12.6, 1.62, 6.54, 9, 11};
  int len = sizeof(arr)/sizeof(double);
  
  // Checkpoint 1 code goes here.
  
  printf("%i\n", len);

  // Checkpoint 2 code goes here.
  for(int i = 0; i < len; i++){
    printf("%f\n", arr[i]);
  }

/*
sizeof() is a special function that returns an integer that is the size of the array in bytes. The syntax for this function is as follows:

 sizeof(arr);

The array has five elements in it, however, this code will output the number 20 as opposed to five because sizeof() returns the total number of bytes occupied by the array regardless of the type of elements.

  int len = sizeof(arr)/sizeof(int);

** sizeof는 바이트 크기를 출력하기 때문에 개수를 알고 싶으면 데이터 유형의 크기로 나누어야 함  

*/

}