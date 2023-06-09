#include <stdio.h>

int main() {
  const double PI = 3.14;
  printf("%f", PI);
    
  return 0;
}




/*

상수

상수는 초기 할당에서 변경할 수 없는 값을 저장합니다.
의미 있는 이름을 가진 상수를 사용하면 코드를 읽고 이해하기가 더 쉽습니다.
상수와 변수를 구별하기 위해 일반적으로 대문자 식별자를 사용합니다.
상수를 정의하는 한 가지 방법은 변수 선언에서 const 키워드를 사용하는 것입니다.

프로그램 실행 중에는 PI 값을 변경할 수 없습니다.
예를 들어, PI = 3.141과 같은 다른 할당 문은 오류를 생성합니다.

상수를 정의하는 또 다른 방법은 #define 전처리기 지시문을 사용하는 것입니다.
#define 지시문은 상수 값을 정의하기 위해 매크로를 사용합니다.


#include <stdio.h>

#define PI 3.14

int main() {
  printf("%f", PI);
  return 0;
}


컴파일하기 전에 전처리기는 코드의 모든 매크로 식별자를 지시문의 해당 값으로 바꿉니다. 
이 경우 PI가 나타날 때마다 3.14로 대체됩니다.
컴파일러로 전송되는 최종 코드에는 이미 상수 값이 있습니다.
const와 #define의 차이점은 전자는 저장을 위해 메모리를 사용하고 후자는 사용하지 않는다는 것입니다.

*/