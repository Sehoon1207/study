#include <stdio.h>

int main() {
  
// Modify this variable value, start low and increase until something odd appears in the results
  int numOfLoops = 10000;

  // Please do not modify anything below this point
  float a = 0.1f;
  float b = 0;
  double x = 0.1;
  double y = 0;

  printf("At the start, our target float b is:%f\n", b);
  printf("At the start, our target double y is:%f\n", y);

// If you were curious about what this code is doing, it is looping through and adding to our variables b and y a set amount of 0.1 on each loop
  for(int i = 0; i < numOfLoops; i++)
  {
    b += a;
    y += x;
  }

  printf("At the end, our target float b is:%f\n", b);
  printf("At the end, our target double y is:%f\n", y);

/*
A float has less precision than a double, 6 vs 15 possible decimal places respectively,
 and therefore takes up less memory (4 vs 8 bytes). However, a double run faster, 
 so you gain speed at the cost of more memory usage.
float는 double보다 정밀도가 낮고, 소수점 이하 자릿수는 각각 6 대 15이므로
 메모리를 덜 차지합니다(4 대 8 바이트). 그러나 double 실행이 더 빠르다.


The other thing to be aware of is that the system is rounding the values you store
 in either. This can cause unexpected results, especially with a float as they have
 less precision. This is why you will see double being used any time accuracy is
 important, such as in scientific, medical or financial applications.
특히 float의 정밀도가 낮기 때문에 예기치 않은 결과가 발생할 수 있다. 
(정확성이 중요할 때마다 double이 사용)

위에 예제는 정밀도의 차이를 보여준다.

*/

}