package sample;

public class MainForTes {
    public static void main(String[] args) {
       String[] words = {"mary", "pary", "a", "loittle", "lamb"};
       Pair<String> mm = ArrayAlg.minmax(words);
       System.out.println("min = "+ mm.getFirst());
       System.out.println("max = "+ mm.getSecond());

    }
}