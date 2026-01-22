// What is Computer ?
// Computer io machine which compute data.
// Data can be
// Binary Data (0/1)
// Physical Phenomena (like speed, temprature, pressure, voltage, petrol and other hydraaulic entities etc.)

// Types of computer
// 1. Digital Computer  -> Binary Data => Text, Number, Audio, Videos, Images, ADVANTAGE-> ACccuracy speed, DISADVANTAGE-> Physical Phenomena
// 2. Hybrid Computers  -> both
// 3. Analog Computers  -> Physical phenomena

// What is Digital Computer?
// Digital Computer is an electronic machine which accept data in input, process it and produce information in output.

// Data -> input Device -> CPU -> output device

// What is Software
// Software either control hardware or do some specific task.
// Software is a set of instruction written in specific computer understandable form and perform specific task.

/*
#include<stdio.h>
int main(){
    int n = 5;
    printf("%i\n", n);
    printf("Hello world \n");
    return 0;
}
*/

// GOTO Lavel
// #include<stdio.h>
// int main(){
//     int num;
//     input_number: // Label for goto
//     printf("Please enter a number: ");
//     scanf("%d", &num);

//     if(num != 10){
//         goto input_number;
        
//     }

//     return 0;
// }



// Function
#include<stdio.h>

void count_to_100();   // function prototype 
int sum(int, int);

int main(){

    count_to_100(); // calling function
    int add = sum(5, 6);
    printf("\n%d \n", add);
    return 0;
}

// function defination

void count_to_100(){
    for(int i=1; i<=100; i++){
        printf("%d ", i);
    }
}

int sum(int first, int second){
    int addition = first + second;
    return addition;
}



