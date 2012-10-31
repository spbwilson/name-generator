package name.generator;
//@author Sean Wilson

//Imports:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NameGenerator {

    static Name companyName;
    
    //--------------------------------------------------------------------------
    public static String getUserInput() {       
        
        String input = "empty";
        
        //Get an input string from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try {
            input = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(NameGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Generalize to ease processing later
        input = input.toLowerCase();
        return input;
    }    
    
    //--------------------------------------------------------------------------
    public static void main(String[] args) throws IOException {
       
        String input;
        
        System.out.println("Welcome to the company name generator!");
        
        while(true) {
            System.out.println("Would you like to generate a name for your company? (y/n)");
            input = getUserInput();
            
            //Start the generator
            if (input.equals("y")) {
                
                System.out.println("How long would you like the name?");
                input = getUserInput();
                
                //Ensure the input was a digit, set length
                try {
                    companyName = new Name(Integer.parseInt(input));
                    companyName.generateRandomName();
                    System.out.println("Your company name could be: " + companyName.getName());
                
                } catch (Exception e) {
                    System.out.println("Please type a digit");
                }
            
            //Exit the program
            } else if (input.equals("n")) {
                break;
            
            //User input incorrect, notify
            } else {
                System.out.println("Incorrect input, please type 'y' or 'n'");
            }
        }      
        System.out.println("Goodbye");
    }
}
