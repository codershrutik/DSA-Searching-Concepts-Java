public class Ceiling{

    public static void main(String[] args){

    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        while(start<=end){

            int mid = start+(end-start-1)/2;

            if(arr[mid]>target){
                end = mid-1;
            } else if(arr[mid]<target){
                start = mid +1;
            } else{
                return mid;
            }
        }

        return start;
    }
}