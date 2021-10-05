package GiaiThuatSapXep;

public class InsertionSort {
    public static void printArray(int no, int[]arr){
        System.out.print(no+":");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertSort(int[] a){
        int n = a.length;
        for(int i = 1; i < n; i++){
            // chèn a[i] vào dãy 0 > i-1
            int ai = a[i];
            int j = i-1;
            while(j>=0&&a[j]>ai){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=ai;
            printArray(i, a);
        }
    }
    public static void main(String[] args) {
        int[] a = {5,3,2,7,8,1,2};
        insertSort(a);
    }
}
