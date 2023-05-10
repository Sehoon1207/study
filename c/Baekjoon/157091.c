#include <stdio.h>
#include <string.h>

int main(){
    char str1[50];
    char str2[] = {"\?\?!"};
    scanf("%s",str1);
    strcat(str1,str2);
    printf("%s\n",str1);
}