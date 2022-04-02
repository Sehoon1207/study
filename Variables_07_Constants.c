#include <stdio.h>

int main() {
  
// Speed of light is 1.86e5 mi/s or 186000 mi/s we will store 1.86 and do the multiplicaiton later.
  const double SPEEDOFLIGHT = 1.86;
  int timeTraveledInSeconds = 30;

  //SPEEDOFLIGHT = 1.86;
  //상수값은 변경이 불가하니 처음에 정의를 내려야함.


  // No need to change below here
  printf("Light would travel %.2f miles in %d seconds\n", SPEEDOFLIGHT * 100000 * timeTraveledInSeconds, timeTraveledInSeconds);

/*
In most cases, variable values can be changed in the program, however, there are cases where you do not want to allow for your variables to change value. This is where constants come into play. These special types prevent any changes during execution once the value is set at declaration.
변수가 값을 변경하는 것을 허용하고 싶지 않은 경우 상수를 사용!! 이러한 특수 유형은 선언 시 값이 설정되면 실행 중 변경을 방지함.


Any basic data type in C, like those we have gone over, can be declared as a constant using the keyword const before the type. So instead of our template of type variable_name, it would be const type variable_name.
C의 모든 기본 데이터 유형은 유형 앞에 const 키워드를 사용하여 상수로 선언
예)const type variable_name

It is also a best practice to use all upper case letters when declaring a constant:
상수를 선언할 때 모두 대문자를 사용할 것

*/


}