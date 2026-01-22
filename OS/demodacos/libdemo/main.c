#include <stdio.h>
#include "arith.h"

int g;
int ig=0;

int main(int argc, char const *argv[])
{
    int l;

    printf("Add: %d\n", add(2, 3));
    printf("Subtract: %d\n", sub(5, 2));
    return 0;
}
