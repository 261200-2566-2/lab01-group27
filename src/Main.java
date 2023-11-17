import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number member : ");
        //get number of member. if member <= 0. Ended
        int n = s.nextInt();
        if(n <= 0) {
            return;
        }
        int arr [] = new int[n];
        int temp = 0;
        System.out.println("Enter all number : ");
        //get number form typing
        for (int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        //print number in array
        System.out.println("number before sorting : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //sorting method (ascending)
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        //print result
        System.out.println("number after sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}