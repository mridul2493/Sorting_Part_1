import java.util.*;
public class BubbleSort {
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    continue;
                }
                else{
                    continue;
                }
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
        for(int m=0;m<arr.length;m++){
            arr[m]= sc.nextInt();
        }
        bubble(arr);
    }
}