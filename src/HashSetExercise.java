import java.util.HashSet;

public class HashSetExercise {
    public static void main(String[] args){
        if(HashSetExercise.containsAllVowels("the quick brown fox jumps over the lazy dog"))
        {
            System.out.println("String-ul are toate vocalele");
        }
        else System.out.println("NU");
    }
    public static boolean containsAllVowels(String str) {
        boolean contains=true;
        HashSet<String> vowelSet = new HashSet<String>();
        vowelSet.add("a");
        vowelSet.add("e");
        vowelSet.add("i");
        vowelSet.add("o");
        vowelSet.add("u");
        for(String vowel:vowelSet)
        {
            if(!str.contains(vowel))
            contains=false;
        }
        return contains;
    }
}
