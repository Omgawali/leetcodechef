/*
1832. Check if the Sentence Is Pangram

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
*/

class Solution {
    public boolean checkIfPangram(String str) {
       boolean flag=false;
       for(char ch='a';ch<='z';ch++)
       {
           boolean panagram = check_panagram(ch,str);
           if(panagram==false){
               flag=false;
               break;
           }
           else
           flag=true;
       }
       return flag;
    }

    public boolean check_panagram(char ch,String str){
        for(char c: str.toCharArray())
        {
            if(c==ch)
            return true;
        }
        return false;
    }
}