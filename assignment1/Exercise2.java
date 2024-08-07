import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String loop;
        do {
            System.out.print("Enter a number : ");
            String input = reader.readLine();
            int output = 1;
            for (int i = 1; i <= Integer.valueOf(input); i++) {
                output *= i;
            }
            System.out.println("The factorial of "+input+" is : "+output);
            System.out.print("restart Y/N : ");
            loop = reader.readLine();
        } while (loop.equalsIgnoreCase("Y"));
    }
}