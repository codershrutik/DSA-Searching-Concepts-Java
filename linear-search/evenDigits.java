//leetcode problem - link - 
public class evenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums){
        int count = 0;
       
        for(int num: nums){
            int countn = 0;
            int n = num;
            while (n != 0) {
                n /= 10;
                ++countn;
            }
            if(countn % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
