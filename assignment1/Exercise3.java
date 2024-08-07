import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {
    
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String loop;
        do {
            System.out.print("Enter a number : ");
            String input = reader.readLine();
            System.out.println("Multiplication Table for " + input + " : ");
            for (int i = 1; i <= 10; i++) {
                System.out.println(input + " * "+i+" = "+ Integer.valueOf(input)*i);
            }
            System.out.print("restart Y/N : ");
            loop = reader.readLine();
        } while (loop.equalsIgnoreCase("Y"));
    }
}
