package Basic_DSA.Sorting;

import java.util.Scanner;

public class BubbleSorting {
    public static void swap(int[] arr, int i, int minIndex){
        int temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    swap(arr, j, j+1);
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        SelectionSorting obj=new bubb();
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
