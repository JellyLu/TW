import java.util.Scanner;

public class UserInput {


    public static String inputFromConsole(){

        Scanner scan = new Scanner(System.in);
        String read = scan.nextLine();

        return read;
    }
}
