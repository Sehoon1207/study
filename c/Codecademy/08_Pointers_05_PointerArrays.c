#include<stdio.h>
#include<string.h>

int main() {
  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  char s[] = "Farmer Jack realized that big yellow quilts were expensive!!";

  // Code for Checkpoint 1 goes here.
  // 1.Create a pointer to an int called ptr and have it point to the last element in array arr.

  int* ptr = &arr[9];


  // Code for Checkpoint 2 goes here.
  //2.Using pointer arithmetic, loop through arr and print the contents in reverse.
  for(int i = 1; i < 11; i++){
    printf("%i\n",*ptr);
    ptr --;
  }


  // Code for Checkpoint 3 goes here.
  // 3. Create a pointer to a char called ptr2 and set it to point to the first character in string s.
  char *ptr2= &s[0];


  // Code for Checkpoint 4 goes here.
  //4. Using pointer arithmetic on ptr2, loop through the string s and replace all the characters with the character ‘#‘.

  for(int i = 0; i < strlen(s); i++){
    *ptr2 = '#';
    ptr2 ++;
  }
  
  printf("%s\n", s);  



/*
Pointers & Arrays
In the lesson on arrays, you learned that an array is a contiguous block of memory reserved for many variables of the same type. Because of this structured organization, a pointer is well suited to work with this data type. If we have an integer array, we can use pointers and pointer arithmetic to iterate through the array to access or manipulate its values. This might seem like an overcomplicated way to work with arrays, but there are some advanced applications in which working with an array through a pointer is necessary.

Consider an array of integers arr. Since arrays are contiguous blocks of memory, if we have a pointer to the first element, we can use pointer arithmetic to access the rest of the array. Keep in mind that while this is a valid way to work with arrays, it is unsafe. Accessing memory outside of the bounds of the array will not cause a program crash, but will silently corrupt data stored in those addresses. In the case of a read operation, it will return a random value.

*/

  
}