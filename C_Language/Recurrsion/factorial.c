#include<stdio.h>
int factorial_using_loop(int);
int factorial_using_recurrsion(int);

int main(){
    int res = factorial_using_loop(5);
    printf("%d \n", res);
    int res2 = factorial_using_recurrsion(6);
    printf("%d \n", res2);
    return 0;
}

int factorial_using_recurrsion(int num){
    if(num == 0) {
        return 1;
    }
    return num * factorial_using_recurrsion(num - 1);
}


int factorial_using_loop(int num) {
    int result = 1;
    for(int i = 2; i<=num; i++){
        result *= i;
    }

    return result;
}