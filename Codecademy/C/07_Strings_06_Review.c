/* Review
Review
Congratulations on completing the lesson on strings in C! 
You are now capable of solving many problems that require string manipulation. 
Here is a brief review of everything you learned:

In C, strings are simply arrays of the char data type.
Since strings are arrays, they are subject to all the properties and constraints of an array.
You cannot change the size of a string.
You cannot delete characters from a string; only replace them.
Modifying a character in a string is done in the same way as modifying an element in an array.
You can loop through a string like you would an array.
A string can be created in one of two ways:
The first being an array of chars: char str[] = {'S', 't', 'r', 'i', 'n', 'g', '\0'};
The second and more convenient is to use a string literal: char str[] = "String";
An empty string of length len, is created like so: char str[len];
All strings must end with the null terminating character ‘\0’.
This character must be added manually when creating a string using the array method.
This character is automatically added when creating a string using a string literal.
The length of a string is the number of characters it contains plus one to account for the null character.
There exists a library in the C language that contains common functions that are used to operate on strings. 
The library is imported by including the line #include<string.h> at the top of the code.
The strlen() function returns the number of characters in that string excluding the null terminator.

Syntax: strlen(str);

The strcat() function concatenates two strings together.
Syntax: strcat(dst, src);
strcat() creates a new string of length strlen(src) + strlen(dst) + 1, containing all the characters of strings dst and src. 
The new string is assigned to the variable holding the original dst string. 
A separate third string is NOT created.
The function strcpy(), copies an existing string into a new empty string.
The empty string must be long enough to accommodate the original string or else undefined behavior will occur. 
Good work!

*/