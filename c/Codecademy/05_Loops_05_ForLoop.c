#include <stdio.h>

int main() {

  int i = 99;

  // Write your loop here
  while(i >= 0 ){
    printf("%d bottles of pop on the wall.\n",i);
    printf("Take one down and pass it around.\n");
 //   printf("%d bottles of pop on the wall.",i);
    i--;
  }

  for(int i = 99 ; i >= 0 ; i--){
    printf("%d bottles of pop on the wall.\n",i);
    printf("Take one down and pass it around.\n");
  }

/*
for (int i = 0; i < 10; i++)
There are three parts to this separated by two ;:

The initialization of a counter: int i = 0
The condition: i < 10
The change in the counter (in this case an increment): i++

*/

}