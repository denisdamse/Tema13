import java.util.TreeMap;

public class TreeMapExercise {
    public static void main(String[] args) {
        System.out.println(TreeMapExercise.@countWords({"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy","dog"}));
    }
    public static TreeMap<String, Integer> countWords(String[] words)
    {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        Integer i=1;
        for(String s: words)
        {
           if(map.containsKey(s))
           {
                i++;
                map.put(s,i);
           }
           else{
                map.put(s, i);
           }
           i=1;
        }
        return map;
    }
}
