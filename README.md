# Project Setup Guide

This guide provides step-by-step instructions for setting up your development environment for the project.

## Checking Java Installation

First, you need to check if Java is installed on your system. Open a terminal and run:
```
bash
java -version
```

If Java is installed, you should see a message similar to:

```
bash
java version "11.0.8" 2020-07-14 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.8+10-LTS)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.8+10-LTS, mixed mode)
```

### Installing Java

If Java is not installed, you can install it using the following command:
```
bash
sudo apt install openjdk-11-jre-headless
```


After installation, verify it again using `java -version`. You should see the version information as mentioned above.

## Checking GCC Installation

Next, check if GCC is installed by running:
```
bash
gcc --version
```

If GCC is installed, you should see a message similar to:

```
bash
gcc (Ubuntu 9.3.0-17ubuntu1~20.04) 9.3.0
```

### Installing GCC

If GCC is not installed, you can install it using:
```
bash
sudo apt install gcc
```


After installation, verify it again with `gcc --version`. You should see the version information as mentioned above.

## Setting Up the Project

1. **Access the User's Home Directory**

Navigate to the user's home directory:
```
bash
cd /home/$USER/
```


2. **Clone the Project Repository**

Clone the project repository into your home directory:
```
bash
git clone https://github.com/MatheusMenecucci23/t1-compiladores.git
```


3. **Compiling the Project**

Navigate to the source code directory:
```
bash
cd /home/$USER/t1-compiladores/src/main/java/br/ufscar/dc/compiladores/alguma/lexico
```


Compile the Java files:
```
bash
javac *.java
```

4. **Generating the JAR File**

After compiling the Java files, proceed to generate the `.jar` file for the project. This involves creating a manifest file and using the `jar` command to package the compiled classes.

### 4.1. **Create a Manifest File**

Create a manifest file named `Manifest.txt` in the root directory of your project with the following content:
```
Main-Class: Principal.java
```

Ensure there is a newline at the end of the file.

### 4.2. **Generate the JAR File**

Use the following command to generate the `.jar` file in the specified target directory:
```
bash
jar cvfm /home/$USER/t1-compiladores/target/alguma-lexico-1.0-SNAPSHOT.jar Manifest.txt *.class
```

The `alguma-lexico-1.0-SNAPSHOT.jar` file will be created in the `/home/$USER/t1-compiladores/target` directory.

### 4.3. **Verify the JAR File**

To verify that the JAR file has been created correctly and is located in the target directory, run:
```
bash
java -jar /home/$USER/t1-compiladores/target/alguma-lexico-1.0-SNAPSHOT.jar
```

5. **Return to the Root Directory**

Return to the root directory of the project:
```
bash
cd /home/$USER/t1-compiladores
```

6. **Running Tests**

Execute the following command to run the tests:
```
bash
java -jar /home/$USER/t1-compiladores/corretor/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar "java -jar /home/$USER/t1-compiladores/target/alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar" gcc /home/$USER/t1-compiladores/corretor/temp /home/$USER/t1-compiladores/corretor/casos-de-teste/casos-de-teste "Student 1 number, Student 2 number, Student 3 number" t1
```

Replace `"Student 1 number, Student 2 number, Student 3 number"` with the actual student numbers.

This guide should help you set up your development environment and get started with the project.
```

This README.md provides a comprehensive guide for setting up the development environment, including checking and installing Java and GCC, setting up the project, compiling the source code, and running tests.
