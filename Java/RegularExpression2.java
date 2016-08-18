package expresionesregularesjava;
 
import java.util.regex.*;


/*
Simple script in Java to find regular expression Example 2

*/ 

 
public class RegularExpression2 {
 
    public static void main(String[] args) {
        String text;
                =  "Example string which will be use"
                + "to fin the pattern http:// ";
 
        String stringpattern = ".*http://.*";
 
        Pattern pattern = Pattern.compile(stringpattern);
        Matcher equals = pattern.matcher(text);
        boolean matches = equals.matches();
 
    }
 
}