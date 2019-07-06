public class MissingNum {
    public static void missingNum(int[] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }

        System.out.println("The missing number is "+ (55-sum) +".");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,7,8,10};
        missingNum(arr);

    }
}
