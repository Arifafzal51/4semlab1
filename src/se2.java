import java.util.Scanner;

public class se2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
       int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }


        int sum = 0;
        for (int i = 0; i < arr.length ; i++)
        {
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
