#include<stdio.h>

int main() {
  double* ptr1;
  printf("%p\n", ptr1);

  // Code for Checkpoint 1 goes here:
  //1.Increment the double pointer ptr1 by five.
  ptr1 += 5;
  printf("%p\n", ptr1);

  // Code for Checkpoint 2 goes here:  
  //2.Decrement the pointer ptr1 by four.
  ptr1 -= 4;
  printf("%p\n", ptr1);


/*
The only arithmetic operations allowed for pointers are addition and subtraction. 덧뺄셈 가능, 곱셈나눗셈 불가
ex)
pointer = pointer + n;
pointer += n; // Same outcome with different syntax
*/

}