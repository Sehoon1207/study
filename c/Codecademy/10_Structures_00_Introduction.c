#include <stdio.h>

int main(void) {
  char firstName[] = "Ada";
  char lastName[] = "Lovelace";
  int age = 28;
  char profession[] = "Mathematician";

  printf("My name is %s %s, I am %d years old and I am a %s.", firstName, lastName, age, profession);
}


/*
{
    char c = 'x';
    int a = 5;
    double b = 2.3;
    char* name = "Ada";
}
The above image represents a structure and the different types of variables contained within it. 
This type of “packaging” is beneficial because it helps build and pass around logically related data 
in a single user-defined data type.

*/