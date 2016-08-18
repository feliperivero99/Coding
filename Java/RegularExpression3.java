package expresionesregularesjava;
 
 /*
Simple script in Java to find regular expression example 3

*/ 
 
 
public class RegularExpression3 {
 
    public static void main(String[] args) {
		
		
        String example = "Small example " + " of string " + "to find patterns.";
        System.out.println(example.matches("\\w.*"));
        String[] splitString = (example.split("\\s+"));
        System.out.println(splitString.length);
        for (String string : splitString) {
            System.out.println(string);
        }
         
        System.out.println(example.replaceAll("\\s+", "\t"));
    }
 
}