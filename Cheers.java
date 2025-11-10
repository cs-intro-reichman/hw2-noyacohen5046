//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = (args[0]);
            word = word.toUpperCase();
            int num = Integer.parseInt(args[1]);
            int length = word.length();

            
            for (int i = 0; i < length; i++) {
                String anOrA;
                if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || 
                word.charAt(i) == 'F' || word.charAt(i) == 'H' || 
                word.charAt(i) == 'I' || word.charAt(i) == 'L' || 
                word.charAt(i) == 'M' || word.charAt(i) == 'N' || 
                word.charAt(i) == 'O' || word.charAt(i) == 'R' || 
                word.charAt(i) == 'S' || word.charAt(i) == 'X'){
                  anOrA = " an ";   
                }
                else {
                        anOrA = " a  ";
                }
                System.out.println("Give me" + anOrA + word.charAt(i) + ": " + word.charAt(i) + "!");
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < num; i++) {
                System.out.println(word + "!!!");
        }
}
}
