#include<stdio.h>

int main() {
  
  int k = 2000;
  int* ptr = &k;
  
  // Checkpoint 1 code goes here.
  // 1. Print the data stored in the memory address that ptr is pointing to.
  printf("%i\n", *ptr);

  // Checkpoint 2 code goes here.
  //2.Change the value contained in the memory address pointed to by ptr from 2000 to 961.
  *ptr = 961;


  printf("%i\n", k); // Notice how this variable changed value after Checkpoint 2!


/*
Once a pointer is dereferenced, we can use its contents as we would a regular variable. It is important not to confuse this operator with the multiplication operator as they are represented by the same symbol!
x 주소값을 ptr에 저장하고 ptr을 다시 y에 저장후 y를 출력하면 x값이 나온다.. 역참조


*/


}
