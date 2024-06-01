public class searchInStrings{
    public static void main(String[] args){

    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == target){
                return true;
            } else{
                return false;
            }
        }

        return false;
    }

    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            } else{
                return false;
            }
        }
        return false;
    }
}