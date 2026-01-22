#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int fd;
int main(int argc, char const *argv[])
{
    mkfifo("comm", 0666);

    fd = open("comm", O_WRONLY);
    write(fd, "Hello World", 11);
    close(fd);  
    return 0;
}
