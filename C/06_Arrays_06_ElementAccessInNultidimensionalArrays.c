#include<stdio.h>

int main() {
  int matrix[][4] = {{14, 10, 6, 4}, {3, 7, 18, 11}, {13, 9, 5, 17}, {19, 12, 2, 1}}; 
  int sum = 0;

  // Checkpoint 1 code goes here.
  int num = matrix[3][1];
  printf("%i\n", num);
  // Checkpoint 2 code goes here.
  for(int i = 0; i < sizeof(matrix)/sizeof(matrix[0]); i++ ){

    for(int j = 0; j < sizeof(matrix[0])/sizeof(int); j++ ){
      sum += matrix[i][j];
  
    }

  }
/*
Elements in a multidimensional array are accessed in like so:

array[rowNumber - 1][columnNumber - 1];

To prevent the hardcoding of dimensions in a loop, the sizeof() function is used as follows:

rowDimension = sizeof(matrix)/sizeof(matrix[0]);
columnDimension = sizeof(matrix[0])/sizeof(dataType);


*/

}