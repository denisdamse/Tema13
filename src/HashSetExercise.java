public class HashSetExercise {
    public static void main(String[] args){
        if(HashSetExercise.containsAllVowels("the quick brown fox jumps over the lazy dog"))
        {
            System.out.println("String-ul are toate vocalele");
        }
        else System.out.println("NU");
    }
    public static boolean containsAllVowels(String str) {
        if(str.contains("a") && str.contains("e") && str.contains("i") && str.contains("o") && str.contains("u"))
        {
            return true;
        }
        else return false;
    }
}
