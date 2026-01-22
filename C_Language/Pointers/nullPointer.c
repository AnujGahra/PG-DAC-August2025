#include<stdio.h>
int main(){
    int a = 5;
    int *p = &a;
    // int *q = NULL;
    int b = 0;   // FIXED
    int *r = &b;
    printf("%p\n", (void*)&a);
    printf("%p\n", (void*)p);
    printf("%d\n", *p);
    // printf("%p\n", q);
    // printf("%d\n", *q);
    printf("%p\n", (void*)&b);
    printf("%p\n", (void*)r);
    printf("%d\n", *r);
}
