public class Strings3 {
    public static void main(String[] args) {
        //Инвертировать все слова в предложении
        String sentence = "Инвертировать все слова в предложении";
        String word = "word";
        StringBuilder sb = new StringBuilder(word);
        System.out.println(sb.reverse());

        System.out.println(reverseWord(word));
        System.out.println(reverseFraze(sentence));
    }
    static String reverseWord (String s){
    return new StringBuilder(s).reverse().toString();
    }

    static String reverseFraze (String s){
        String [] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words)
            sb.append(reverseWord(word)).append(" ");
        return sb.toString();
    }
}
