#include <stdio.h>

int main(){
    int a,b;
    scanf("%d",&a);
    scanf("%d",&b);
    int c = b%10;
    int d = ((b-c)%100)/10;
    int f = (((b-c)-d*10)%1000)/100;
    printf("%d\n",a*c);
    printf("%d\n",a*d);
    printf("%d\n",a*f);
    printf("%d\n",a*c+a*d*10+a*f*100);
}