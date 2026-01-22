#include <stdio.h>
#include <pthread.h>

void *greetThread(void *arg)
{
    printf("%s from thread!\n", (char *)arg);
    return NULL;
}

int main(int argc, char const *argv[])
{
    pthread_t helloID, byeID;
    printf("Before thread creation\n");
    pthread_create(&helloID, NULL, greetThread, "Hello");
    pthread_create(&byeID, NULL, greetThread, "Goodbye");
    pthread_join(helloID, NULL);
    pthread_join(byeID, NULL);
    printf("After thread creation\n");
    return 0;
}

