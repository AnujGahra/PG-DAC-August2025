#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main(int argc, char const *argv[])
{
    int fd_dac;
    int res=0;

    fd_dac = open("./dac.txt", O_WRONLY, S_IRUSR | S_IWUSR );

    if (-1 == fd_dac) {
        perror("");
        return 1;
    }
    
    res = write(fd_dac, "Hello", 5);

    printf("Number of bytes written: %d\n", res);

    close(fd_dac);

    return 0;
}
