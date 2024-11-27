import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {



            File file = new File("data.txt");
            if (file.createNewFile())   // Create the file if it doesn't exist
                System.out.println("File created: " + file.getName());
            else
                System.out.println("File already exists.");

            addDataFromScratch(file,"hello");


    }


    public static void addDataFromScratch(File file, String data) {

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {  //try with () when we know there something that is closable i.e scanner
                writer.write(data);
            } catch (IOException r) {
                throw new RuntimeException(r);
            };

            System.out.println("Data has been added to the file");
    }

    public static void appendData(File file, String data) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {  //try with () when we know there something that is closable i.e scanner
            writer.write(data);
        } catch (IOException r) {
            throw new RuntimeException(r);
        };

        System.out.println("Data has been appended to the file");
    }



}




















/*
* File handling in Java can be accomplished through several classes and methods, primarily from the `java.io` and `java.nio` packages. These classes provide functionalities for reading, writing, creating, and deleting files, as well as other file-related operations. Here’s a breakdown of the primary methods of file handling in Java:

### 1. **Using `File` Class (java.io package)**

The `File` class in Java represents files and directories. While it does not directly provide methods to read or write file content, it allows for file manipulation, such as creating, deleting, and checking file properties.

- **Creating a file**:
  ```java
  File file = new File("example.txt");
  boolean created = file.createNewFile(); // returns true if the file was created
  ```

- **Checking if a file exists**:
  ```java
  boolean exists = file.exists(); // returns true if file exists
  ```

- **Getting file properties**:
  ```java
  long size = file.length(); // file size in bytes
  long lastModified = file.lastModified(); // last modified timestamp
  ```

- **Deleting a file**:
  ```java
  boolean deleted = file.delete(); // returns true if file is successfully deleted
  ```

- **Renaming a file**:
  ```java
  File newFile = new File("new_example.txt");
  boolean renamed = file.renameTo(newFile); // renames the file
  ```

### 2. **Using `FileReader` and `FileWriter` Classes**

These classes are designed specifically for reading and writing text files using characters.

- **Reading from a file using `FileReader`**:
  ```java
  FileReader fr = new FileReader("example.txt");
  int i;
  while ((i = fr.read()) != -1) {
      System.out.print((char) i);
  }
  fr.close();
  ```

- **Writing to a file using `FileWriter`**:
  ```java
  FileWriter fw = new FileWriter("example.txt");
  fw.write("Hello, world!");
  fw.close();
  ```

### 3. **Using `BufferedReader` and `BufferedWriter` Classes**

These classes are used to read and write files efficiently by buffering input and output, which is useful for reading large files.

- **Reading from a file using `BufferedReader`**:
  ```java
  BufferedReader br = new BufferedReader(new FileReader("example.txt"));
  String line;
  while ((line = br.readLine()) != null) {
      System.out.println(line);
  }
  br.close();
  ```

- **Writing to a file using `BufferedWriter`**:
  ```java
  BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"));
  bw.write("Hello, world!");
  bw.newLine(); // writes a newline character
  bw.close();
  ```

### 4. **Using `Scanner` Class**

The `Scanner` class is used for reading input from files as well as user input. It is more flexible in terms of parsing data.

- **Reading from a file using `Scanner`**:
  ```java
  Scanner sc = new Scanner(new File("example.txt"));
  while (sc.hasNextLine()) {
      System.out.println(sc.nextLine());
  }
  sc.close();
  ```

### 5. **Using `PrintWriter` Class**

The `PrintWriter` class is used for writing formatted text to a file. It has additional methods for printing formatted data (like `printf()`).

- **Writing to a file using `PrintWriter`**:
  ```java
  PrintWriter pw = new PrintWriter("example.txt");
  pw.println("Hello, world!");
  pw.close();
  ```

### 6. **Using `RandomAccessFile` Class**

`RandomAccessFile` allows both reading and writing to a file at any position. It is useful for applications like databases and file editors where random access to file content is required.

- **Reading and writing using `RandomAccessFile`**:
  ```java
  RandomAccessFile raf = new RandomAccessFile("example.txt", "rw");
  raf.seek(100); // move to position 100
  raf.writeBytes("Hello at position 100");
  raf.close();
  ```

### 7. **Using `Files` Class (java.nio.file package)**

The `Files` class provides modern file I/O features in Java 7 and later, allowing easier file handling through utility methods.

- **Reading all lines from a file**:
  ```java
  List<String> lines = Files.readAllLines(Paths.get("example.txt"));
  ```

- **Writing to a file**:
  ```java
  Files.write(Paths.get("example.txt"), "Hello, world!".getBytes());
  ```

- **Copying a file**:
  ```java
  Files.copy(Paths.get("source.txt"), Paths.get("destination.txt"), StandardCopyOption.REPLACE_EXISTING);
  ```

- **Moving or renaming a file**:
  ```java
  Files.move(Paths.get("old.txt"), Paths.get("new.txt"), StandardCopyOption.REPLACE_EXISTING);
  ```

- **Deleting a file**:
  ```java
  Files.delete(Paths.get("example.txt"));
  ```

### 8. **Using `Path` Class (java.nio.file package)**

The `Path` class represents the path to a file or directory. It provides various methods to interact with the file system.

- **Getting file properties**:
  ```java
  Path path = Paths.get("example.txt");
  BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);
  long size = attrs.size(); // size in bytes
  ```

- **Checking if file exists**:
  ```java
  boolean exists = Files.exists(path);
  ```

- **Creating directories**:
  ```java
  Path directory = Paths.get("newDir");
  Files.createDirectories(directory); // creates directory (and parent directories if needed)
  ```

### 9. **Using `FileChannel` Class (java.nio package)**

`FileChannel` is used for reading, writing, and mapping files into memory. It provides high-performance file I/O, especially useful when dealing with large files.

- **Reading from a file using `FileChannel`**:
  ```java
  RandomAccessFile file = new RandomAccessFile("example.txt", "r");
  FileChannel channel = file.getChannel();
  ByteBuffer buffer = ByteBuffer.allocate(1024);
  int bytesRead = channel.read(buffer);
  ```

- **Writing to a file using `FileChannel`**:
  ```java
  RandomAccessFile file = new RandomAccessFile("example.txt", "rw");
  FileChannel channel = file.getChannel();
  ByteBuffer buffer = ByteBuffer.wrap("Hello, world!".getBytes());
  channel.write(buffer);
  ```

### Conclusion

In Java, file handling can be done in several ways, using different classes and techniques to fit various needs. The newer `java.nio.file` package (introduced in Java 7) provides more efficient and convenient methods for file manipulation, while the older `java.io` classes are still widely used for simpler tasks. Depending on the requirements, you can choose between basic methods like `FileReader` and `FileWriter`, or use more advanced approaches like `FileChannel` and `RandomAccessFile`.
* */