//https://leetcode.com/problems/detect-capital/
class Solution {
    public boolean detectCapitalUse(String word) {
        Integer count=0;
        if(word.toUpperCase()==word || word.toLowerCase()==word){
            return true;
        }else{
            for(Character c:word.toCharArray()){
                if(c>='A' && c<='Z'){
                count++;    
                }
            }
            if(count>1){
                return false;
            }else{
                if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
                    return true;
                }
            }
        }
        return false;
    }
}
/*
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
            if (word.length() == 1) return true;
            if (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z') {
                for (int i = 2; i < word.length(); i += 1){
                    if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') return false;
                }
            } else {
                for (int i = 2; i < word.length(); i += 1){
                    if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') return false;
                }
            }
        } else {
            for (int i = 1; i < word.length(); i += 1){
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') return false;
            } 
        }
        return true;
    }
}
*/
