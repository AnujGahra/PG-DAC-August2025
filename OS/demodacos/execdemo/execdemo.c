#include <stdio.h>
#include <unistd.h>

pid_t id;

int main(int argc, char const *argv[])
{
    printf("Before execle\n");

    id = fork();
    if (0 == id) {
        execle("/mahi/demo/demodacos/libdemo/main", "main", NULL, NULL);
    } else
    {
        printf("Parent:\n");
    }
    
    
    return 0;
}
