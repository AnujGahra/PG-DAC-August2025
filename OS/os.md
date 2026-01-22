
- Processors
    - Micro Processor
    - Micro Controller

- CPU
    - Intel/ AMD, ARM, RISC V

- Memory
    - Volatile (RAM)
    - Non-Volatile (HDD, Flash)

- IO aka Peripherals
    - Keyboard, Mouse
    - Communication Interfaces (WiFi, BT, Ethernet etc)

- Program and Process

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
    - GPR, Flags, PC, SP

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
