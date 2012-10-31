package name.generator;
//@author Sean Wilson

//Imports:


public class Alphabet {

    //Instance variables
    private static final char[] consonant = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
    private static final char[] vowel = {'a','e','i','o','u'};
    private static final int cLen = consonant.length;
    private static final int vLen = vowel.length;
    
    //--------------------------------------------------------------------------
    public char getRandomConsonant() {    
        
        char randomConst = consonant[(int)(Math.random()*cLen)];
        return randomConst;
    }
    
    //--------------------------------------------------------------------------
    public char getRandomVowel() {
        
        char randomVowel = vowel[(int)(Math.random()*vLen)];
        return randomVowel;
    }
}
