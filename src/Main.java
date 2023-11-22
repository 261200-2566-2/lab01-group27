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
        System.out.println("Enter all number : ");
        //get number form typing
        for (int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        //print number in array
        printBefore(arr);
        //sorting array
        sorting(arr);
        //print result
        printResult(arr);

    }
    public static void sorting(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public  static  void printBefore(int arr[]){
        System.out.println("number before sorting : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public  static  void printResult(int arr[]){
        System.out.println();
        //print result
        System.out.println("number after sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}