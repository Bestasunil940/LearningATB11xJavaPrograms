package Exceptions;

import java.io.IOException;

public class Throws {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void readFile() throws IOException {
        throw new IOException("File not found");
    }
}
