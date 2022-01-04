import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

class Anagram{
    public static void main(String[] args) {
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First string");

        str1 = sc.nextLine();

        System.out.println("Enter second string");
        str2 = sc.nextLine();

        str1=str1.replace("\\s","").toLowerCase(Locale.ROOT);
        str2=str2.replace("\\s","").toLowerCase(Locale.ROOT);

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (String.valueOf(array1).equals(String.valueOf(array2))){
            System.out.println(str1+" is Anagram of "+str2);
        }
        else
        {
            System.out.println(str1+" is not Anagram of "+str2);
        }
    }
}