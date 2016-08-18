package expresionesegulares2;
 
import java.util.regex.*;


/*
Simple script in Java to find regular expression example 4

*/ 
 
public class RegularExpression4{
 
    public static void main(String[] args) {

	String text
                = "String example for the purpose "
                + "to find patterns";
 
        String pattern = ".*find.*";
 
        boolean matches = Pattern.matches(pattern, text);
 
        System.out.println("matches = " + matches);
 
        String stringpattern = ".*http://.*";
 
        //Executing Compile()
		
        Pattern patternOBJ = Pattern.compile(stringpattern);
 
        //Using the matcher() function
        Matcher matcher = patternOBJ.matcher(text);
        matches = matcher.matches();
 
        System.out.println("matches = " + matches);
 
        //Using the Split() function
        text = "Es sep un text sep con sep muchos sep Separadores";
 
        stringpattern = "sep";
        patternOBJ = Pattern.compile(stringpattern);
 
        String[] split = patternOBJ.split(text);
 
        System.out.println("split.length = " + split.length);
 
        for (String element : split) {
            System.out.println("Element = " + element);
        }
 
    }
 
}