import java.util.Scanner;

public class Lab02_Q3 {

    public static void main(String[] args) {

    //question
        System.out.println("Enter the title: ");
        
    //naming the input
    
        String theTitle;
        Scanner in = new Scanner(System.in);
        theTitle = in.nextLine();

    //

        int NumberOfChar = theTitle.codePointCount(0,theTitle.length());

    //output
        
        System.out.println("--------------------------------------");
        System.out.println("Number of characters: " + NumberOfChar );
        System.out.println("All upercase: " + theTitle.toUpperCase());
        System.out.println("Remove leading and trailing characters: " + theTitle.trim());
        System.out.println("Character at index position 5: " + theTitle.charAt(5));
        System.out.println("Title from 3rd character to 8th character (not included): " + theTitle.substring(3,7));
        System.out.println("First occurence of character 'a': " + theTitle.indexOf('a'));
        System.out.println("Last occurence of character 'a': "+ theTitle.lastIndexOf('a'));

        in.close();


    }
}
