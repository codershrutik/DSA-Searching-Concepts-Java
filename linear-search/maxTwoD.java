public class maxTwoD {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        // int ans = max(arr);
        // System.out.println(ans);

        int ans = min(arr);
        System.out.println(ans);

    }

    // static int max(int[][] arr){
    //     // if(arr.length == 0){
    //     //     return -1;
    //     // }
    //     int max = Integer.MIN_VALUE;

    //     for(int i = 0;i<arr.length;i++){
    //         for(int j = 0;j<arr[i].length;j++){
    //             if(arr[i][j]>max){
    //                 max = arr[i][j];
    //             }
    //         }
    //     }
        
    //     return max;
    // }

    static int min(int[][] arr){
        
        int min = arr[0][0];

        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }

        return min;
    }
}
