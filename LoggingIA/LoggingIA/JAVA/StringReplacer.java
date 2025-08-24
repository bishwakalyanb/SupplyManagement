public class StringReplacer {
    
    public static String replaceString(String originalString, String searchString, String replacementString) {
        return originalString.replace(searchString, replacementString);
    }
    
    public static void main(String[] args) {
        String originalString = "The original string"; // Your original string
        String searchString = "original"; // The string you want to replace
        String replacementString = "new"; // The replacement string
        
        String modifiedString = replaceString(originalString, searchString, replacementString);
        
        // Output the modified string
        System.out.println("Modified string: " + modifiedString);
    }
}
