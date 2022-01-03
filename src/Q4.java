import java.util.Locale;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to show Vowels");
        String str = sc.next();
        System.out.println("Vowels in string" + str + "are");
        String length=str.toLowerCase(Locale.ROOT);
    }
    static void vowels(String str){
        char ch;
        int i =0;
        for (int j = 0; j <str.length() ; j++) {
            ch=str.charAt(j);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                i=1;
                System.out.println(ch);

            }



        }




    }
}
