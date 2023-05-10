#include <stdio.h>
struct Person {
  char name[40];
  int age;
};

// Write your function below
struct Person ageOne(struct Person friend1, struct Person* friend2Pointer) {
  friend1.age += 1;
  friend2Pointer->age +=1;
  return friend1;
}

int main(void) {
  struct Person myFriend = {"Martin", 57};
  struct Person myOtherFriend = {"Michelle", 27};
  // Call your function below
  myFriend = ageOne(myFriend, &myOtherFriend);

  printf("Hello my name is %s and I am %d years old.\n", myFriend.name, myFriend.age);
  printf("Hello my name is %s and I am %d years old.\n", myOtherFriend.name, myOtherFriend.age);
}

/*
1. Define the function ageOne()
2. Give the function a return type of Person
3. The body can be empty.

4. The first function parameter should be called friend1 and be of type Person
5. The second parameter should be called friend2Pointer and be a pointer to type Person

6. Add 1 to the age variable in friend1
7. Using the arrow format to dereference, add 1 to the age variable in the structure pointed to by friend2Pointer
8. Return the structure friend1

9. Call ageOne() and assign the return value to myFriend
10. Set the first argument of ageOne() to myFriend
11. Set the 2nd argument of ageOne() to the address of myOtherFriend
*/

/*

*/