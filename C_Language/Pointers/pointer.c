// POINTERS
#include<stdio.h>
int main(){

    int i = 3;
    int *p = &i;
    int **q = &p;
    int ***r = &q;
    printf("%p\n", &i);
    printf("%d\n", *(&i));
    printf("%p\n", p);
    printf("%d\n", *p);
    printf("%p\n", *q);
    printf("%p\n", *q);
    printf("%d\n", **q);
    printf("%p\n", r);
    printf("%p\n", *r);
    printf("%p\n", **r);
    printf("%d\n", ***r);
    printf("Value of i = %d\n", i);
    return 0;

}
