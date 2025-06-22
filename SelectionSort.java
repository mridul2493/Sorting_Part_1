import java.util.*;
public class SelectionSort {
    public static void smallest(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int min = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                    continue;
                }
                else {
                    continue;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int k=0;k< arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements = ");
        for(int m=0;m<arr.length;m++){
            arr[m]= sc.nextInt();
        }
        smallest(arr);
    }
}