import java.util.regex.*;
 
/*
Simple script in Java to find regular expression example 1

*/ 
 
 
 
public class RegularExpression1 {
 
    public static void main(String[] args) {
        String text
                = "Example string which will be use"
                + "to fin the pattern http:// ";
 
        String pattern = ".*http://.*";
 
        boolean findpattern = Pattern.matches(pattern, text);
 
        System.out.println("Pattern = " + findpattern);
    }
 