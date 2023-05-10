#include <stdio.h>

// Write your code below
struct Table {
  int length;
  int width;
  int height;
  char color[20];
};

int main(void) {
  int table1Length = 24;
  int table1Width = 24;
  int table1Height = 20;
  char table1Color[20] = "Dark Brown";

  int table2Length = 42;
  int table2Width = 18;
  int table2Height = 32;
  char table2Color[20] = "Matte Black";

  // Write your code below
  struct Table table1={24, 24, 20, "Dark Brown"};
  struct Table table2={42, 18, 32, "Matte Black"};
}

/*
1. Create a Table structure
2. Define the following variables inside the structure, length, width, height and color[20]
3. Initialize the table1 using the Table struct and the first set of table data
4. Initialize the table2 using the Table struct and the second set of table data
*/

/*
Being able to represent data using structures is extremely beneficial as you continue working on more complex real-world problems.

1. Reduce complexity by representing a set of data with one variable
2. Package different, but logically similar, data together
3. Better represent real-world “things” into data types
*/