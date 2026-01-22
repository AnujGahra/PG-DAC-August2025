
all: main

main: main.o add.o sub.o
	gcc -o main main.o add.o sub.o

main.o: main.c arith.h
	gcc -c -o main.o main.c

add.o: add.c arith.h
	gcc -c -o add.o add.c

sub.o: sub.c arith.h
	gcc -c -o sub.o sub.c
	
clean:
	rm -f main *.o
