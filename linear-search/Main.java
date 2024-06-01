public class Main{
    public static void main(String[] args){
        int[] nums = {23, 45, 1,2,8,19,-3,16,-11,28};
        int target = 19;

        int ans = linearSearch(nums, target);
        System.out.println(ans);
        
    }

    //searching in the array - returning the index if the item is found, else return -1
    // static int linearSearch(int[] arr, int target){
    //     if(arr.length == 0){
    //         return -1;
    //     }

    //     for(int i=0; i<arr.length;i++){
    //         if(arr[i] == target){
    //             return i;
    //         } else{
    //             return -1;
    //         }
    //     }
    // }

    //searching the target and returning the element
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int element: arr){
            if(element == target){
                return element;
            }
        }

        return -1;
    }
}