#include<stdio.h>
#include<stdlib.h>
int main(){
    

    int *arr = (int*) calloc(2, sizeof(int)); // Dynamic memory allocation

    if(arr == NULL) {
        printf("Not enough memory\n");
        return 1;
    }

    printf("Address of arr: %p\n", arr);

    arr[0] = 45;
    arr[1] = 74;

    arr = (int*) realloc(arr, 3 * sizeof(int)); 
    if(arr == NULL) {
        printf("Not enough memory\n");
        return 1;
    }
        printf("New Address of arr: %p\n", arr);
        printf("Original element are: %d %d\nx", arr[0], arr[1]);
        arr[2] = 98;

    return 0;
}