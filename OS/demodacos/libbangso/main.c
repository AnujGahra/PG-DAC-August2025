
#include "arith.h"
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
  int sum = 0;

  sum = add(1, 2);
  sum = sub(sum, 10);

  printf("Sum: %d\n", sum);
  return EXIT_SUCCESS;
}
