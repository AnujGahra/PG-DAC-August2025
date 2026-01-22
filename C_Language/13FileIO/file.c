#include <stdio.h>

int main() {
    FILE *file_pointer;
    char text[100];

    // Open the file in read mode
    file_pointer = fopen("file.txt", "r");
    if (file_pointer == NULL) {
        printf("\nFile could not be opened.");
        return 1;
    }

    // Read a line from the file
    // fgets(text, 100, file_pointer);
    // printf("\n%s", text);

    char c;
    do {
        c = fgetc(file_pointer);
        printf("%c", c);
    } while(c != EOF);

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
