#include<stdio.h>
int main(){
    char str[100];
    printf("Enter a string: ");
    // gets(str);
    // printf("Good morning: %s", str);
    fgets(str, sizeof(str), stdin);
    // puts(str);
    printf("Good morning ");
    puts(str);


}

  