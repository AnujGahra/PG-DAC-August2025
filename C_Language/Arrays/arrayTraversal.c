#include<stdio.h>
int main(){
    // int marks[5] = {10, 20, 30, 50, 60};
    int marks[5];

    // int size = sizeof(marks) / sizeof(marks[0]);
    
    for(int i = 0; i<5; i++){
        printf("Please enter marks for Student %d: ", i+1);
        scanf("%d", &marks[i]);
    }

    for(int i=0; i<5; i++){
        printf("Marks of student %d are: %d\n",(i+1), marks[i]);
    }

    return 0;
}