public class rangeCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 6;
        System.err.println(linearSearch(arr, target, 1, 8));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i<end;i++){
            if(arr[i] == target){
                return i;
            } else{
                return -1;
            }
        }

        return -1;
    }
}
