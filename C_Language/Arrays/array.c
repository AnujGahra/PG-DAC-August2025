#include<stdio.h>
int main() {
    // int marks1, marks2, marks3, marks4, marks5;

    // printf("Enter marks for student 1: ");
    // scanf("%d", &marks1);
    // printf("Enter marks for student 2: ");
    // scanf("%d", &marks2);
    // printf("Enter marks for student 3: ");
    // scanf("%d", &marks3);
    // printf("Enter marks for student 4: ");
    // scanf("%d", &marks4);
    // printf("Enter marks for student 5: ");
    // scanf("%d", &marks5);


    // printf("\nMarks of student 1 are: %d", marks1);
    // printf("\nMarks of student 2 are: %d", marks2);
    // printf("\nMarks of student 3 are: %d", marks3);
    // printf("\nMarks of student 4 are: %d", marks4);
    // printf("\nMarks of student 5 are: %d\n", marks5);


    // Arrays
    int marks[10] = {90, 94, 91, 96, 100};
    // int marks[5] = {1};

    // printf("Enter marks for student 1: ");
    // scanf("%d", &marks[1]);
    // printf("Enter marks for student 2: ");
    // scanf("%d", &marks[2]);
    // printf("Enter marks for student 3: ");
    // scanf("%d", &marks[3]);
    // printf("Enter marks for student 4: ");
    // scanf("%d", &marks[4]);
    // printf("Enter marks for student 5: ");
    // scanf("%d", &marks[5]);


    printf("\nMarks of student 1 are: %d", marks[0]);
    printf("\nMarks of student 2 are: %d", marks[2]);
    printf("\nMarks of student 3 are: %d", marks[3]);
    printf("\nMarks of student 4 are: %d", marks[4]);
    printf("\nMarks of student 5 are: %d", marks[5]);
    printf("\nMarks of student 6 are: %d", marks[6]); // get 0 value
    printf("\nMarks of student 7 are: %d\n", marks[7]); // get 0 value
    printf("\nMarks of student 7 are: %d\n", marks[10]); // get garbage value

    return 0;

}