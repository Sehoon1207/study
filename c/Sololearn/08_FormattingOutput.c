/*
Formatting Output 

출력 형식 지정
printf 함수는 첫 번째 Hello World 프로그램에서 도입되었습니다. 
이 함수를 호출하려면 값으로 대체되는 형식 지정자(format string)와 특수 문자를 출력하기 위한 이스케이프 시퀀스를 
포함할 수 있는 형식 문자열이 필요합니다.


*/

#include <stdio.h>

int main() {
    printf("The tree has %d apples.\n", 22);
    /* output: The tree has 22 apples. */

    printf("\"Hello World!\"\n");
    /* output: "Hello World!" */
}

/*

Escape sequences begin with a backslash \:
이스케이프 시퀀스는 백슬래시 \로 시작합니다.

\n new line         새 줄
\t horizontal tab   가로 탭
\\ backslash        백슬래시
\b backspace        백스페이스
\' single quote     작은따옴표
\" double quote     큰따옴표


The conversion character converts the argument, if necessary, to the indicated type:
형식 지정자는 퍼센트 기호 %로 시작하고 형식 문자열 뒤의 해당 인수로 대체됩니다. 
형식 지정자는 변환 문자와 함께 여러 옵션을 포함할 수 있습니다.

%[-][width].[precision]conversion character

선택적 [-]는 문자열에서 데이터의 왼쪽 맞춤을 지정합니다.
선택적 너비 [width]는 데이터의 최소 문자 수를 제공합니다.
마침표(.)는 너비와 정밀도를 구분합니다.
선택적 정밀도 [precision]는 숫자 데이터의 소수 자릿수를 제공합니다. 
s가 변환 문자로 사용되는 경우 정밀도는 인쇄할 문자 수를 결정합니다.
변환 문자 [conversion character]는 필요한 경우 인수를 표시된 유형으로 변환합니다.

d decimal               십진수
c character             문자
s string                문자열
f float                 플로트
e scientific notation   과학적 표기법
x hexadecimal           16진수


#include <stdio.h>

int main() {
    printf("Color: %s, Number: %d, float: %5.2f \n", "red", 42, 3.14159);
    // Color: red, Number: 42, float:  3.14  

    printf("Pi = %3.2f \n", 3.14159); 
    // Pi = 3.14 
    
    printf("Pi = %8.5f \n", 3.14159); 
    // Pi = 3.14159 
    
    printf("Pi = %-8.5f \n", 3.14159); 
    // Pi = 3.14159 
    
    printf("There are %d %s in the tree. \n", 22, "apples");
    // There are 22 apples in the tree. 
}

------------------------run--------------------------

Color: red, Number: 42, float:  3.14 
Pi = 3.14 
Pi =  3.14159 
Pi = 3.14159  
There are 22 apples in the tree. 

------------------------------------------------------

*/