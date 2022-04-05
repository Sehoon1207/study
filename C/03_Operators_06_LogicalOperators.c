#include <stdio.h>

int main() {
  
  int x = 1;
  int y = 27;

  if (x != y) {
    printf("Congratulations on setting up a comparison correctly!");
  } else {
    printf("Please try again!");
  }

/*
&& : and 역할, || : or 역할, ! : 앞에 붙으면 부정비교
if (a == b && a == 2) {
  printf("both are true\n");
}
if (a == b || a == 2) {
  printf("one or both are true\n");
}
if (!(a == b)) {
  printf("they are not equal\n");
}
*/

}