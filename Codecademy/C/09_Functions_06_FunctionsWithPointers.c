#include <stdio.h>

// Write your code below
void incrementAge(int* agePointer){
  *agePointer = *agePointer+1;
}

int main(void) {
  int age = 33;
  incrementAge(&age);
  printf("%d\n",age);
}

/* Order

1. Define a function named incrementAge() that returns no value
2. The function should have one parameter, an integer pointer agePointer
3. The body of the function should increment the value that agePointer points to

4. Define an integer age, and set it to your age
5. Call incrementAge() and pass the address of the variable age as the argument
6. Output the value of age after the function call

*/


/*
With a pointer as a parameter, the body of the function can directly alter the original value of the pointer that was passed:
포인터를 매개변수로 사용하면 함수 본문에서 전달된 포인터의 원래 값을 직접 변경할 수 있습니다.

A benefit of using a pointer to a variable as opposed to the variable itself is that it saves memory as the function does not need to allocate more memory for complex data types like arrays.
변수 자체가 아닌 변수에 대한 포인터를 사용하는 이점은 함수가 배열과 같은 복잡한 데이터 유형에 대해 더 많은 메모리를 할당할 필요가 없기 때문에 메모리를 절약한다는 것입니다.

ex)

#include <stdio.h>
 
void myFunc(int a){
  a = a + 2;
  printf("a inside myFunc(): %d\n", a);
}
 
int main(){
  int a = 10;
  myFunc(a);
  printf("a in main(): %d\n", a);
}
 
//OUTPUT:
// a inside myFunc(): 12;
// a in main(): 10;

!!!!!change to pointer

void myFunc(int* a){
  *a = *a+2;
  printf("a inside myFunc(): %d\n", *a);
}
 
int main(){
  a = 10;
  int* aPointer = &a;
  myFunc(aPointer);
  printf(“a in main(): %d\n”, a);
}
 
//OUTPUT:
// a inside myFunc(): 12;
// a in main(): 12;




*/