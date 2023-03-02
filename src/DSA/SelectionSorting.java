package DSA;

import java.util.Scanner;

public class SelectionSorting {
    public static void swap(int[] arr, int i, int minIndex){
        int temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SelectionSorting obj=new SelectionSorting();
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


//package DSA;
//
//import java.util.Scanner;
//
//public class SelectionSorting {
//    public static void swap(int[] arr, int i, int minIndex){
//        int temp=arr[i];
//        arr[i]=arr[minIndex];
//        arr[minIndex]=temp;
////        return arr;
//    }
//    public static void selectionSort(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            int minIndex=i;
//            for(int j=i+1;j<arr.length-1;j++){
//                if(arr[i]<arr[minIndex]){
//                    minIndex=j;
//                }
//            }
//            swap(arr, i, minIndex);
//        }
////        for(int i=0;i<arr.length;i++){
////            System.out.print(arr[i]+" ");
////        }
////        return arr;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        SelectionSorting obj=new SelectionSorting();
//        int n=sc.nextInt();
//        int arr[]= new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//         obj.selectionSort(arr);
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}
