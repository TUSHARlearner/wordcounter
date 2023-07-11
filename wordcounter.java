











import java.util.Scanner;

public class wordcounter {
    static final int OUT = 10;
    static final int IN = 20;

    static int countWords(String str){
        int state = OUT;
        int wc = 0;
        int i = 0;

        while (i < str.length()){
            if(str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t')
                state = OUT;
            else if(state == OUT){
                state = IN;
                ++wc;
            }
            ++i;
        }
        return wc;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        String str = scanner.nextLine();
        
        System.out.println("No of words : " + countWords(str));
        
        scanner.close();
    }
}
