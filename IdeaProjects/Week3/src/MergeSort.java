public class MergeSort {
    public static void mergeSort(int[]arr, int start, int end){
        int middle = (start+end)/2;
        start = arr[(arr.length/2)];
        end = arr[arr.length];

    }
    public static void main(String[] args) {
        int [] array = {4,2,9,1,5,3,7};
        mergeSort(array,0,array.length-1 );
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}