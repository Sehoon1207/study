#include <stdio.h>

int main() {
  
  double testScore = 95.7;
  int displayScore = 0;

  displayScore = (int)testScore;

  // No need to change below here
  printf("Great work, you got a %d%% on your test\n", displayScore);

/*
때로는 변수의 값 유형을 변경하고 다른 용도로 사용하는 것이 유용하거나 심지어 필요한 경우도 있다.
암시적 변환과 명시적 변환의 두 가지 방법이 있다.
(암시적 변환)
위의 예제에서 displayScore = testScore 라고 하면 컴파일러에서 추측하여 변경한다. but 이것은 어떤게 들어갈지 모르므로 위험하다.
(명시적 변환)
displayScore = testScore 를 displayScore = (int)testScore
int로 바꿀 것을 명확히 알려주는 방법임.
*/

}