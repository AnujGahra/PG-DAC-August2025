#include <stdio.h>
#include <fcntl.h>    /* For O_* constants */
#include <sys/stat.h> /* For mode constants */
#include <mqueue.h>

struct mq_attr attr;
mqd_t mq;

unsigned char buffer[128];

int main(int argc, char const *argv[])
{
    attr.mq_maxmsg = 5;
    attr.mq_msgsize = 128;
    mq = mq_open("/dacmq", O_CREAT | O_RDONLY, S_IRUSR | S_IWUSR | S_IRGRP | S_IWGRP, &attr);

    mq_receive(mq, buffer, sizeof(buffer), NULL);
    printf("Received: %s\n", buffer);
    mq_close(mq);
    return 0;
}
