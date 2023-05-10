#include<stdio.h>

int main() {
  
  double g = 9.81;
  double pi = 3.14;
  
  // Checkpoint 1 code goes here.
  // 1.Declare a pointer to a double called dblPtr and assign to it the address of variable g.
  double *dblPtr = &g;

  // Checkpoint 2 code goes here.
  // 2.Print the address of variable g.
  printf("%p\n", dblPtr);

  // Checkpoint 3 code goes here.
  // 3.Reassign dblPtr to the address of the variable pi.
  dblPtr = &pi;
  
}
