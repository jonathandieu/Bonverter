import java.util.*;

/**
 * Bonverter
 */
public class Bonverter {

    public static void main(String[] args) {
        
        createHeader("Welcome to the B o n v e r t e r");
        Scanner input = new Scanner(System.in);
        boolean gatheringInput = true;
        
        while (gatheringInput)
        {
            ArrayList<String> plainText = new ArrayList<>();
            System.out.println("Please enter the sentence you would like to 'Bonvert' (Type END to stop)");
            String userInput = input.nextLine();
            if(userInput.equals("END")){
                gatheringInput = false;
                return;
            }
            for(String s : userInput.split(" ")){
                plainText.add(s);
            }
            // input.close();
    
    
            //BONVERT TIME
            plainText = bonvertText(plainText);
    
            for(String s : plainText){
                System.out.printf("%s ", s);
            }
            System.out.println("\n");           

        }
        
    }
    
    public static void createHeader(String header)
    {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-==-=-=-=-=-=-=-=-=-");
        System.out.println(header);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-==-=-=-=-=-=-=-=-=-");
    }
    

    public static ArrayList<String> bonvertText(ArrayList<String> words){
        ArrayList<String> ret = new ArrayList<String>();

        for(String s : words){
            Character firstLetter = s.charAt(0);
            //Check if the starting letter is a vowel
            if(isVowel(firstLetter)){
                if(Character.isUpperCase(firstLetter)){
                    ret.add("B" + Character.toLowerCase(firstLetter) + s.substring(1));
                }else{
                    ret.add( (String) ("b" + firstLetter + s.substring(1)));
                }
            } 
            else{
                if(Character.isUpperCase(firstLetter)){
                    ret.add("B" + s.substring(1));
                }else{
                    ret.add("b" + s.substring(1));
                }
            }

        }

        return ret;
    }

    public static boolean isVowel(Character c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return true;
        }
        return false;
    }
}
