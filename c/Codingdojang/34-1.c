#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
    int *numPtr1;
    int **numPtr2;
    int num1;

    scanf("%d", &num1);

    numPtr1 = &num1;
    numPtr2 = &numPtr1;

    printf("%d\n", **numPtr2);

    return 0;
}

// scanf로 변수 num1에 정수가 저장됩니다. 
// 여기서 이중 포인터 numPtr2를 두 번 역참조하여 num1에 저장된 값이 나와야 합니다. 
// 따라서 num1의 메모리 주소를 포인터 변수 numPtr1에 저장하고, 
// 다시 포인터 변수 numPtr1의 메모리 주소를 포인터 변수 numPtr2에 저장하면 됩니다.