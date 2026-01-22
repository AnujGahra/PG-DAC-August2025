#include <stdio.h>
#include <pthread.h>

int count = 0;
pthread_mutex_t countMut; 

void *inc_thread(void *arg)
{
    while (1)
    {
        pthread_mutex_lock(&countMut);
        printf("Inc Thread: %d\n", count);
        count++;
        pthread_mutex_unlock(&countMut);
    }
    return NULL;
}
void *dec_thread(void *arg)
{
    while (1)
    {
        pthread_mutex_lock(&countMut);
        printf("Dec Thread: %d\n", count);
        count--;
        pthread_mutex_unlock(&countMut);
    }
    return NULL;
}

int main()
{
    pthread_t t1, t2;

    pthread_mutex_init(&countMut, NULL);
    pthread_create(&t1, NULL, inc_thread, NULL);
    pthread_create(&t2, NULL, dec_thread, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);
    pthread_mutex_destroy(&countMut);
    printf("Final count: %d\n", count);
    return 0;
}