#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main(int argc, char const *argv[])
{
    int fd_dac;
    int res=0;
    unsigned char buff[5];

    fd_dac = open("./dac.txt", O_CREAT | O_RDONLY, S_IRUSR | S_IWUSR );

    if (-1 == fd_dac) {
        perror("Error opening file");
        return 1;
    }
    
    res = read(fd_dac, buff, 5);

    printf("Read Buffer: %s\n", buff);
    // printf("Number of bytes written: %d\n", res);

    close(fd_dac);

    return 0;
}
