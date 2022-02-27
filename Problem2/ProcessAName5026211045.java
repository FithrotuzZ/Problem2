import java.util.Scanner;

public class ProcessAName5026211045 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.print("Write down your name: ");

            String name = console.nextLine();
            int index = name.indexOf(' ');
            String firstName = name.substring(0, index);
            String lastName = name.substring(index);
            	System.out.println(index);
            	System.out.println("So, this is your name: " +lastName+ ", " +firstName.charAt(0)+ ".");
        }

}
