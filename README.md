# Students
- Augusto Luchesi Matos, BCC, 740871
- Matheus Menecucci, BCC, 800310

# Project Setup Guide

This guide provides step-by-step instructions for setting up your development environment for the project.

## Linux Operational System

First, you must have a Linux distribution as your computer's operating system.

## Checking Java Installation

Now, you need to check if Java is installed on your system. Open a terminal and run:
```
java -version
```

If Java is installed, you should see a message similar to:

```
java version "11.0.8" 2020-07-14 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.8+10-LTS)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.8+10-LTS, mixed mode)
```

### Installing Java

If Java is not installed, you can install it using the following command:
```
sudo apt install openjdk-11-jre-headless
```


After installation, verify it again using `java -version`. You should see the version information as mentioned above.

## Checking GCC Installation

Next, check if GCC is installed by running:
```
gcc --version
```

If GCC is installed, you should see a message similar to:

```
gcc (Ubuntu 9.3.0-17ubuntu1~20.04) 9.3.0
```

### Installing GCC

If GCC is not installed, you can install it using:
```
sudo apt install gcc
```


After installation, verify it again with `gcc --version`. You should see the version information as mentioned above.

## Setting Up the Project

1. **Access the User's Home Directory**

Navigate to the user's home directory:
```
cd /home/$USER/
```


2. **Clone the Project Repository**

Clone the project repository into your home directory:
```
git clone https://github.com/MatheusMenecucci23/t1-compiladores.git
```

## Compile and Generating the JAR File

3. **Compiling the Project**

Navigate to the directory you just cloned:
```
cd /home/$USER/t1-compiladores
```

Compile the project using Maven:
```
mvn package
```
This is possible because the file 'pom.xml' is configured to compile the project.

The `alguma-lexico-1.0-SNAPSHOT.jar` file will be created in the `/home/$USER/t1-compiladores/target` directory.

4. **Running Tests**

Execute the following command to run the tests:
```
java -jar /home/$USER/t1-compiladores/corretor/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar "java -jar /home/$USER/t1-compiladores/target/alguma-lexico-1.0-SNAPSHOT.jar" gcc /home/$USER/t1-compiladores/corretor/temp /home/$USER/t1-compiladores/corretor/casos-de-teste/casos-de-teste "Student 1 number, Student 2 number, Student 3 number" t1
```

Replace `"Student 1 number, Student 2 number, Student 3 number"` with the actual student numbers.

This guide should help you set up your development environment and get started with the project.

This README.md provides a comprehensive guide for setting up the development environment, including checking and installing Java and GCC, setting up the project, compiling the source code, and running tests.
Replace `"Student 1 number, Student 2 number, Student 3 number"` with the actual student numbers.

This guide should help you set up your development environment and get started with the project.

This README.md provides a comprehensive guide for setting up the development environment, including checking and installing Java and GCC, setting up the project, compiling the source code, and running tests.
