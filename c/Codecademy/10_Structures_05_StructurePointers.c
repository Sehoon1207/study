#include <stdio.h>

struct Person {
  char name[40];
  int age;
};

int main(void) {
  struct Person person1 = {"Martin", 57};
  struct Person person2 = {"Michelle", 27};
  // Write your code below
  struct Person* person1Pointer = &person1;
  struct Person* person2Pointer = &person2;
  
  (*person1Pointer).age ++;
  person2Pointer -> age = person2Pointer -> age + 10;
  

  printf("Hello my name is %s and I am %d years old.\n", person1.name, person1.age);
  printf("Hello my name is %s and I am %d years old.\n", person2.name, person2.age);
}


/*
1. Create a pointer to person1 called person1Pointer
2. Create another pointer that points to person2 called person2Pointer
3. Add 1 to the member variable age of person1
*/

/*
To access member variables with bottlePointer and the dot operator we can use the following syntax:

(*bottlePointer).name;
(*bottlePointer).maxCapacity;
(*bottlePointer).currentCapacity;

Arrow notation can also be used with pointers to structures, as it implicitly does the dereferencing for you.

aPointer->name;
aPointer->maxCapacity;
aPointer->currentCapacity;

*/