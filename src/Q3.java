import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int sum = 0;
        for (arr[i] % 3 && arr[i] % 5) ;
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
