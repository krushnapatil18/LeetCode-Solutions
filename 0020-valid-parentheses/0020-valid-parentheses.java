class Solution {
    public boolean isValid(String s) {
        int len = -1;

        while(len != s.length()){
            len = s.length();

            s = s.replace("()","").replace("{}","").replace("[]","");
        }
        return s.isEmpty();
        
    }
}