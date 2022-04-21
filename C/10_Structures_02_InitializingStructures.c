#include <stdio.h>

int main(void) {
  struct Person {
    char firstName[25];
    // Write your code below
    char lastName[40];
    int age;
  };
  
  // Write your code below
  struct Person person1 = {"Ada", "Lovelace", 28};
  struct Person person2 = {"Marie", "Curie", 44};
}

/*
1. Add a lastName string member variable with a length of 40
2. Initialize the Person structure, person1 with the data below
3. Be sure to place the data in the same order as the member variable definitions
4. Initialize the Person structure, person2 with the data below
5. Be sure to place the data in the same order as the member variable definitions
*/

/*
struct Bottle {
  char* name;
  int maxCapacity;
  int currentCapacity;
};

struct Bottle bottle1 = {
  .maxCapacity = 24,
  .name = "superBottle",
  .currentCapacity = 0
};

struct Bottle bottle1 = {"superBottle", 24, 0};
*/
