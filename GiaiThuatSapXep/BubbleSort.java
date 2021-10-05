package GiaiThuatSapXep;

public class BubbleSort {
    public static void printArray(int no, int[]arr){
        System.out.print(no+":");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] a){
        int n = a.length;
        for(int i = 0; i < n; i++){
            boolean isSort = true;
            for (int j = 0; j < n-i-1; j++) {
                if(a[j] > a[j+1]){
                    isSort=false;
                    int tg= a[j];
                    a[j] = a[j+1];
                    a[j+1]=tg;
                }
            }
            printArray(i, a);
            if(isSort){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {3,6,2,9,10,4,9};
        bubbleSort(a);
    }
}
