In Java, exceptions and errors are categorized into three main types: checked exceptions, unchecked exceptions, and errors. Understanding the differences between them is crucial for handling exceptions effectively in Java.

### 1. **Checked Exceptions**
- **Definition**: Checked exceptions are exceptions that are checked at compile-time. The Java compiler requires that these exceptions be either caught or declared in the method signature using a `throws` clause.
- **Examples**: `IOException`, `SQLException`, `FileNotFoundException`.
- **Usage**: They typically represent conditions that a reasonable application might want to catch. For example, when performing file I/O, a `FileNotFoundException` might be thrown, and the programmer is expected to handle this possibility.

- **Example Code**:
  ```java
  public void readFile(String fileName) throws IOException {
      FileReader file = new FileReader(fileName);
      BufferedReader fileInput = new BufferedReader(file);
      fileInput.readLine();
  }
  ```

### 2. **Unchecked Exceptions**
- **Definition**: Unchecked exceptions are exceptions that are not checked at compile-time. These are also known as runtime exceptions and derive from `RuntimeException`.
- **Examples**: `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException`.
- **Usage**: Unchecked exceptions usually indicate programming errors, such as logic errors or improper use of an API. These exceptions are often not expected to be caught explicitly by the programmer but rather should be prevented through proper code logic.

- **Example Code**:
  ```java
  public void divide(int a, int b) {
      int result = a / b; // May throw ArithmeticException if b is 0
  }
  ```

### 3. **Error**
- **Definition**: Errors are serious problems that a reasonable application should not try to catch. Errors are usually abnormal conditions that occur within the JVM and are often not recoverable.
- **Examples**: `StackOverflowError`, `OutOfMemoryError`, `VirtualMachineError`.
- **Usage**: Errors indicate serious problems, such as JVM-related issues, that are beyond the control of the application. Handling them is not usually recommended because they typically indicate a fundamental issue that cannot be easily recovered from.

- **Example Code**:
  ```java
  public void recursiveMethod() {
      recursiveMethod(); // This will eventually throw StackOverflowError
  }
  ```

### Summary
- **Checked Exceptions**: Must be handled by the programmer (try-catch or throws clause).
- **Unchecked Exceptions**: Occur during runtime and typically represent programming errors.
- **Errors**: Represent serious problems within the JVM that are not expected to be handled by the application.