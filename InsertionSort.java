import java.util.*;
public class InsertionSort {
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void insert(int arr[]){
        for(int i=1;i< arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j-1,j);
                j--;
            }
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
        System.out.println("Enter elements = ");
        for(int m=0;m< arr.length;m++){
            arr[m]=sc.nextInt();
        }
        insert(arr);
    }
}