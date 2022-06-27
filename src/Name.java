import java.util.regex.PatternSyntaxException;

public class Name {

    public static void main(String[] args) {
        String sentence = "My name is   klaus";
        String[] words = sentence.split("\\s+");
        System.out.println("Number of words " + words.length);


    }

}
