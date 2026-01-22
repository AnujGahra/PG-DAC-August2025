#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>

int count = 0;
sem_t semCount;

void *inc_thread(void *arg)
{
    while (1)
    {
        sem_wait(&semCount);
        printf("Inc Thread: %d\n", count);
        count++;
        sem_post(&semCount);
    }
    return NULL;
}
void *dec_thread(void *arg)
{
    while (1)
    {
        sem_wait(&semCount);
        printf("Dec Thread: %d\n", count);
        count--;
        sem_post(&semCount);
    }
    return NULL;
}

int main()
{
    pthread_t t1, t2;

    sem_init(&semCount, 0, 1);
    pthread_create(&t1, NULL, inc_thread, NULL);
    pthread_create(&t2, NULL, dec_thread, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);
    sem_destroy(&semCount);

    printf("Final count: %d\n", count);
    return 0;
}