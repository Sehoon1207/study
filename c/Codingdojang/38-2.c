#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int height;
    int width;

    printf("height와 width를 지정하세요(h w): ");
    scanf("%d %d", &height, &width);

    printf("메모리 설정중.....\n");
    char **matrix;
    matrix = (char **)malloc(sizeof(char *) * height);
    for (int i = 0; i < height; i++) {
        matrix[i] = (char *)malloc(sizeof(char) * (width + 1));
        memset(matrix[i], '0', width);  // 0으로 초기화
    }

    printf("지정한 크기의 2차 배열에 들어갈 지뢰를 표시하세요(지뢰:* 나머지:.): \n");
    for (int j = 0; j < height; j++) {
        for (int i = 0; i < width; i++) {
            scanf(" %c", &matrix[j][i]);  // 공백 문자를 추가하여 이전 입력 버퍼를 비움
        }
        matrix[j][width] = '\0';  // 문자열의 마지막에 NULL 문자를 추가
    }

    printf("지정된 .dot 위치에 숫자 0 배열... \n");
    for (int j = 0; j < height; j++) {
        for (int i = 0; i < width; i++) {
            if (matrix[j][i] == '.') {
                matrix[j][i] = '0';
                // matrix[j][i] = atoi(&matrix[j][i]);
            }
        }
    }

    printf("지정된 지뢰에 따라 주변에 숫자++ ... \n");
    for (int j = 0; j < height; j++) {
        for (int i = 0; i < width; i++) {
            if (matrix[j][i] == '*') {
                if (j != 0 && matrix[j - 1][i] != '*') {  // 12시
                    matrix[j - 1][i]++;
                }
                if (j != 0 && i != width - 1 && matrix[j - 1][i + 1] != '*') {  // 1시
                    matrix[j - 1][i + 1]++;
                }
                if (i != width - 1 && matrix[j][i + 1] != '*') {  // 3시
                    matrix[j][i + 1]++;
                }
                if (j != height - 1 && i != width - 1 && matrix[j + 1][i + 1] != '*') {  // 5시
                    matrix[j + 1][i + 1]++;
                }
                if (j != height - 1 && matrix[j + 1][i] != '*') {  // 6시
                    matrix[j + 1][i]++;
                }
                if (j != height - 1 && i != 0 && matrix[j + 1][i - 1] != '*') {  // 7시
                    matrix[j + 1][i - 1]++;
                }
                if (i != 0 && matrix[j][i - 1] != '*') {  // 9시
                    matrix[j][i - 1]++;
                }
                if (j != 0 && i != 0 && matrix[j - 1][i - 1] != '*') {  // 11시
                    matrix[j - 1][i - 1]++;
                }
            }
        }
    }

    printf("결과 출력: \n");
    for (int j = 0; j < height; j++) {
        for (int i = 0; i < width; i++) {
            printf("%c", matrix[j][i]);
        }
        printf("\n");
    }

    for (int i = 0; i < height; i++) {
        free(matrix[i]);
    }
    free(matrix);
}

// 입력
// 5 5
// *....
// .*.**
// .*...
// .....
// .....

// 결과
// *2222
// 3*3**
// 2*322
// 11100
// 00000