#include <stdio.h>
#include <pthread.h>

int count = 0;

void *inc_thread(void *arg)
{
    while (1)
    {
        printf("Inc Thread: %d\n", count);
        count++;
    }
    return NULL;
}
void *dec_thread(void *arg)
{
    while (1)
    {
        printf("Dec Thread: %d\n", count);
        count--;
    }
    return NULL;
}

int main()
{
    pthread_t t1, t2;

    pthread_create(&t1, NULL, inc_thread, NULL);
    pthread_create(&t2, NULL, dec_thread, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);

    printf("Final count: %d\n", count);
    return 0;
}