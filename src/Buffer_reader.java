import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer_reader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number:");
        int number = Integer.parseInt(br.readLine()); // Convert string to integer

        System.out.println("You entered: " + number);
    }
}
