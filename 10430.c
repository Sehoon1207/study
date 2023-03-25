#include <stdio.h>

int main(){
    int a, b, c, tmp1, tmp2, tmp3, tmp4 = 0;
    
    scanf("%d %d %d", &a, &b, &c);
    
    tmp1 = (a+b)%c;
    tmp2 = ((a%c)+(b%c))%c;
    tmp3 = (a*b)%c;
    tmp4 = ((a%c)*(b%c))%c;

    printf("%d\n",tmp1);
    printf("%d\n",tmp2);
    printf("%d\n",tmp3);
    printf("%d\n",tmp4);
}