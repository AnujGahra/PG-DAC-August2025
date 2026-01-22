#include <stdio.h>
#include <fcntl.h>    /* For O_* constants */
#include <sys/stat.h> /* For mode constants */
#include <mqueue.h>

struct mq_attr attr;
mqd_t mq;

int main(int argc, char const *argv[])
{
    attr.mq_maxmsg = 5;
    attr.mq_msgsize = 128;
    mq = mq_open("/dacmq", O_CREAT | O_WRONLY, S_IRUSR | S_IWUSR | S_IRGRP | S_IWGRP, &attr);

    mq_send(mq, "hello", 5, 0);
    mq_close(mq);
    return 0;
}
