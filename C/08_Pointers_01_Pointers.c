#include<stdio.h>

int main() {
  // Checkpoint 1 code goes here.
  //1.Create a double variable named dblVar.
  double dblVar;

  // Checkpoint 2 code goes here.
  //2.Create a pointer variable called dblPtr that points to dblVar.
  double* dblPtr = &dblVar;

  // Checkpoint 3 code goes here.
  //3.Print the address stored in dblPtr to the screen.
  printf("%p", dblPtr);


/*
The syntax of a pointer is the following:

dataType* nameOfPointer;
dataType *nameOfPointer;

ex
nt* ptr; // Pointer to an int
int *ptr; // Same as above but different style.


*/  
}