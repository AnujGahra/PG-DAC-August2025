#include <stdio.h>
#include <unistd.h>

int pipefd[2];
pid_t id;

unsigned char buff[5];

int main(int argc, char const *argv[])
{
    pipe(pipefd);
    id = fork();
    if (0 == id) {
        close(pipefd[1]);
        read(pipefd[0], buff, 5);
        printf("Parent sent me: %s\n", buff);

    } else {
        close(pipefd[0]);
        write(pipefd[1], "hi C\n", 5);
    }
    return 0;
}
