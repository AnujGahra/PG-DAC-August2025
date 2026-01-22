#include <stdio.h>
#include <sys/mman.h>
#include <sys/stat.h> /* For mode constants */
#include <fcntl.h>    /* For O_* constants */

int shmd;

int *datar;

int main(int argc, char const *argv[])
{
    shmd = shm_open("/dacshm", O_CREAT | O_RDWR, S_IRUSR | S_IWUSR);

    ftruncate(shmd, sizeof(int));
    datar = mmap(NULL, sizeof(int), PROT_READ | PROT_WRITE, MAP_SHARED, shmd, 0);
    
    while(1) {
        printf("%d\n", *datar);
        sleep(1);
    }

    return 0;
}
