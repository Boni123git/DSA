class Solution {
    public boolean isPalindrome(String s) {
        char[] c_arr = new char[s.length()];
        int j = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                c_arr[j] = s.charAt(i);
                j++;
            }
        }

        if(j == 0){
            return true;
        }
        int k = j-1;
        for(int i = 0 ; i <= j/2 ; i++){
            if(Character.toLowerCase(c_arr[i]) != Character.toLowerCase(c_arr[k])){
                return false;
            }
            k--;
        }

        return true;
    }
}
