#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
    int n;
    scanf("%d",&n);

    int **matrix = malloc(sizeof(int *) * n);

    for (int i = 0; i < n; i++) {
        matrix[i] = malloc(sizeof(int) * n);
        memset(matrix[i], 0, sizeof(int) * n);
    }

    for (int i = 0; i < n; i++){
        matrix[i][i] = 1;
    }

    for(int i=0; i < n; i++){
        for(int j=0; j < n; j++){
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }
    free(matrix);
}