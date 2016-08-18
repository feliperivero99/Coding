package expresionesegulares2;
 
import java.util.regex.*;
 
 
 
 /*
Simple script in Java to find regular expression example 5
Using several functions to find patterns inside strings

*/ 
 
 
public class RegularExpression5 {
 
    public static void main(String[] args) {
         
  // Creating a  Matcher instance      
        String text
                = = "String example for the purpose "
                + "to find patterns http://";
 
        String stringpattern = ".*http://.*";
 
        Pattern pattern = Pattern.compile(stringpattern);
 
        Matcher matcher = pattern.matcher(text);
        boolean matches = matcher.matches();
 
//Using lookingAt()
        System.out.println("lookingAt = " + matcher.lookingAt());
        System.out.println("matches   = " + matcher.matches());
 
//Using find() + start() + end()
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
        }
 
//Using group()
        text   = "Juan escribe sobre aquello, y Juan escribe de esto,"
                + "y Juan escribe de todo. ";
 
        String patternString1 = "(Juan)";
 
        pattern = Pattern.compile(patternString1);
        matcher = pattern.matcher(text);
 
        while (matcher.find()) {
            System.out.println("Matches: " + matcher.group(1));
        }
 
        //Using group()  for severals functions 
        text = "John writes about this, and John Doe writes about that,"
                + " and John Wayne writes about everything.";
 
        patternString1 = "(Juan) (.+?) ";
 
        pattern = Pattern.compile(patternString1);
        matcher = pattern.matcher(text);
 
        while (matcher.find()) {
            System.out.println("found: " + matcher.group(1)
                    + " " + matcher.group(2));
        }
 
//Finding groups inside groups 
        text = "Juan escribe sobre aquello, y Juan carlos escribe de esto,"
                + "y Juan escribe de todo. ";
 
        patternString1 = "((John) (.+?)) ";
 
        pattern = Pattern.compile(patternString1);
        matcher = pattern.matcher(text);
 
        while (matcher.find()) {
            System.out.println("Found: <" + matcher.group(1)
                    + "> <" + matcher.group(2)
                    + "> <" + matcher.group(3) + ">");
        }
 
        //Using replaceall() y replacefirst()
        text  = "Juan escribe sobre aquello, y Juan carlos escribe de esto,"
                + "y Juan Diaz escribe de todo. ";
 
 
        patternString1 = "((John) (.+?)) ";
 
        pattern = Pattern.compile(patternString1);
        matcher = pattern.matcher(text);
 
        String replaceAll = matcher.replaceAll("Juan Blocks ");
        System.out.println("replaceAll   = " + replaceAll);
 
        String replaceFirst = matcher.replaceFirst("Jose Blocks ");
        System.out.println("replaceFirst = " + replaceFirst);
 
        //Using  appendReplacement()y appendTail()
        text = "Juan escribe sobre aquello, y Juan carlos escribe de esto,"
                + "y Juan Diazz escribe de todo. ";
 
        patternString1 = "((Juan) (.+?)) ";
        pattern = Pattern.compile(patternString1);
        matcher = pattern.matcher(text);
        StringBuffer stringBuffer = new StringBuffer();
 
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "Jose Blocks ");
            System.out.println(stringBuffer.toString());
        }
        matcher.appendTail(stringBuffer);
 
        System.out.println(stringBuffer.toString());
    }
 
}