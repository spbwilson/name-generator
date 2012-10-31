package name.generator;
//@author Sean Wilson

//Imports:


public class Name {

    //Instance Variables
    private String name;
    private int nameLength;
    
    //Constructor
    public Name(int length) {
    
        setNameLength(length);
    }
    
    //--------------------------------------------------------------------------
    public void setNameLength(int length) {
        
        nameLength = length;
    }
    
    //--------------------------------------------------------------------------
    public int getNameLength() {
        
        return nameLength;
    }
    
    //--------------------------------------------------------------------------
    public void generateRandomName() {
        
        int length = getNameLength();
        int nextType;
        char nextChar;
        Alphabet a = new Alphabet();
        StringBuilder b = new StringBuilder();
        
        
        for (int i = 0; i < length; i++) {
            //Choose between a constant or a vowel (0=con, 1=vow)
            nextType = (int)(Math.random()*2);
            
            //Get the next character and append
            if(nextType == 0){
                nextChar = a.getRandomConsonant();
                b.append(nextChar);
            } else {
                nextChar = a.getRandomVowel();
                b.append(nextChar);
            }
        }
        name = b.toString();
    }
    
    //--------------------------------------------------------------------------
    public String getName() {
        
        return name;
    }
}
