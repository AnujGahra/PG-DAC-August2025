#include <stdio.h>
#include <unistd.h>

pid_t id;

int main(int argc, char const *argv[])
{
    printf("Before Fork\n");
    id = vfork();
    printf("After Fork\n");
    if (0 == id) {
        printf("Child: My PID: %d, Parent PID: %d\n", getpid(), getppid());
    } else {
        printf("Parent: My PID: %d, Child PID: %d\n", getpid(), id);
    }
    
    return 0;
}
