#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>

sem_t s1, s2;
int a, b;
int sum;

void *input_thread(void *arg)
{
    while (1)
    {
        sem_wait(&s1);
        scanf("%d %d", &a, &b);
        sem_post(&s2);
    }
    return NULL;
}

void *cal_sum(void *arg)
{
    while (1)
    {
        sem_wait(&s2);
        sum = a + b;
        printf("Sum: %d\n", sum);
        sem_post(&s1);
    }
    return NULL;
}

pthread_t tid1, tid2;

int main(int argc, char const *argv[])
{
    sem_init(&s1, 0, 1);
    sem_init(&s2, 0, 0);

    pthread_create(&tid2, NULL, cal_sum, NULL);
    pthread_create(&tid1, NULL, input_thread, NULL);

    pthread_join(tid1, NULL);
    pthread_join(tid2, NULL);

    sem_destroy(&s1);
    sem_destroy(&s2);

    return 0;
}
