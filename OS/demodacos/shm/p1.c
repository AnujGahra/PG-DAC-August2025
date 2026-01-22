#include <stdio.h>
#include <sys/mman.h>
#include <sys/stat.h> /* For mode constants */
#include <fcntl.h>    /* For O_* constants */

int shmd;

int *data;

int main(int argc, char const *argv[])
{
    shmd = shm_open("/dacshm", O_CREAT | O_RDWR, S_IRUSR | S_IWUSR);

    ftruncate(shmd, sizeof(int));
    data = mmap(NULL, sizeof(int), PROT_READ | PROT_WRITE, MAP_SHARED, shmd, 0);
    *data = 0;
    while(1) {
        (*data)++;
        printf("%d\n", *data);
        sleep(1);
    }

    return 0;
}
