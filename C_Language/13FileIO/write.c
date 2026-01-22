#include <stdio.h>

int main() {
    FILE *file_pointer;
   

    // Open the file in read mode
    // file_pointer = fopen("writing.txt", "w");
    file_pointer = fopen("writing.txt", "a");
    if (file_pointer == NULL) {
        printf("\nFile could not be opened.");
        return 1;
    }

    // for write file
    fprintf(file_pointer, "\nThis is my first write operation\n");
    fprintf(file_pointer, "Square of %d is %d\n", 3, 9);

   
    // Close the file
    int result = fclose(file_pointer);
    if (result == 0) {
        file_pointer = NULL;
    } else {
        printf("\nFile was not closed properly.");
        return 1;
    }

    return 0;
}
