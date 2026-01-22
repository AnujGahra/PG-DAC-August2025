
- Processors
    - Micro Processor
    - Micro Controller

- CPU
    - Intel/ AMD, ARM, RISC V

- Memory
    - Volatile (RAM)
    - Non-Volatile (HDD, Flash)
    - Cache

- IO aka Peripherals
    - Keyboard, Mouse
    - Communication Interfaces (WiFi, BT, Ethernet etc)

- Program 
  - Dormant entity
  - Secondary storage
- Process
  - Active entity
  - RAM (Primary Storage)

- Sections
    - .text  .code
    - .data
    - .bss
    - heap
    - stack

- Address Space
    - Kernel Address Space
    - User Address Space

- Booting
    - BIOS
    - Bootloader
    - OS
    - Applications

- Context Switch
    - Context Saving + Context Restoring

- Context ?
    - GPR, Flags, PC/ IP, SP

- Stack
    - Stack Frame
    - Return Address + Args + local variables

- Priviledged
- Non-Priviledged

- Header Files and Libraries
- Build Flow
- Toolchain - CPP, Compiler, Linker, objdump, Debuggers

- System Calls
    - Open, Read, Write, Close
- Library Calls
    - fopen, fread, fwrite, fclose

- man
  - man 2 write
  - man -k open

- Libraries
  - Static Library (.a)
  - Dynamic Library
    - Shared Object (.so)
    - Dynamically Linked Library (.dll)

- ar (static)
  - ar -crv libname.a file1.o file2.o

- Dynamic (shared)
  - gcc -o libname.so -shared -fPIC file1.o file2.o

- Linking
  - Static Linking
  - Dynamic Linking
    - gcc -o app app.o -L. -lname
    - export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:.
    - ./app

- Process States
  - New (Created)
  - Ready
  - Running
  - Waiting
  - Terminated

- Scheduling Algorithms
  - FCFS
  - SJF
  - Round Robin
  - Priority Based
    - Preemptive
    - Non-Preemptive

- Process Management
 - Create Process
   - fork()
   - vfork()
   - exec()
- Interprocess Communication (IPC)
  - Pipes
  - FIFOs (Named Pipes)

- Threads
  - POSIX Threads (pthreads)
  - Thread Creation
    - pthread_create()
    - pthread_join()
  - Thread Attributes
    - pthread_attr_init()
    - pthread_attr_setdetachstate()
    - pthread_attr_destroy()
    - SCHED_FIFO, SCHED_RR, SCHED_OTHER
    - SCHED_ priority
    - Stack Size
  - Thread Cancellation
  - Mutexes
    - pthread_mutex_init()
    - pthread_mutex_lock()
    - pthread_mutex_unlock()
    - pthread_mutex_destroy()

    - Futex
    - Recursives Mutex 

  - Deadlocks

- Blocking and Non Blocking APIs
- Try variants
- Time variants

- Semaphores
  - Binary
    - Mutual Exclusion (1)
    - Signaling (0,1)
  - Counting
    - Resource management (resources of same type)
    - N - Maximum number of resources
    - +ve - Number of resources that are available at that instance of time
    - -ve - Number of threads waiting for the resources

- Message Queues (FIFO)
  - Allocated in the kernel
  - In-built synchronization
  - Attributes
    - Size
    - Max message size
    - Name

- Shared Memory
  - Allocated in the User space
  - No In-built synchronization
  - ftruncate, mmap
  - name, size, protection, flags, offset, address
