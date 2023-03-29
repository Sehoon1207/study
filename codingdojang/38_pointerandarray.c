#define _CRT_SECURE_NO_WARNING
#include <stdio.h>

int main()
{
    int size;

    scanf("%d", &size);  // 배열의 크기를 입력받음

    int numArr[size];    // GCC에서는 사용 가능, Visual Studio 2022에서는 컴파일 에러

    return 0;
}


// **가변 길이 배열
// C 언어는 int numArr[10];처럼 고정된 크기로 배열을 생성하는 것은 가능하지만 
//         int numArr[size];처럼 크기를 동적으로 지정할 수는 없었습니다. 
// 이후 C99 표준이 제정되었고 가변 길이 배열(Variable-Length Array, VLA) 기능도 추가되었습니다. 
// GCC, Clang 등의 컴파일러는 가변 길이 배열을 지원하지만 
// Visual Studio 2022는 아직 지원하지 않습니다.