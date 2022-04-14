#include<stdio.h>
#include<string.h>

int main() {
  char s[] = "When the zombies arrive, quickly fax Judge Pat Alphabet";
  char p[] = "poolloop";  


  // Checkpoint 1 code goes here
  /*
  1.The string s contains a message that must be concealed. Using  a loop, replace every character in the string with the character '*'.
*/
  
  for(int i = 0; i < strlen(s); i++) {
    s[i] = '*'; 
  }
  printf("%s\n", s);


  // Checkpoint 2 code goes here
  /*
  2.String p contains the string “pool” and its mirror string “loop”. Loop through the string and replace the first half with '#'s.
*/


  for(int i = 0; i < strlen(p)/2; i++) {
    p[i] = '#'; 
  }
  printf("%s", p);


/*
  #include<string.h>
  strlen(str) // 문자열 길이 구함

*/
}