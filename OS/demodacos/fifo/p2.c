#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int fd;
unsigned char buff[100];

int main(int argc, char const *argv[])
{
    mkfifo("comm", 0666);

    fd = open("comm", O_RDONLY);
    read(fd, buff, 100);
    printf("%s\n", buff);
    close(fd);  
    return 0;
}
