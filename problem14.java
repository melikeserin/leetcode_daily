class Solution{
  public String longestCommonPrefix(String [] strs) {
    if (strs.length == 0 || strs == null) {
      return "";
    }
    for (int i==; i<strs[0].length(); i++){
      char ch = strs[0].charAt(i);
      for (int j=1; j<strs.length() || strs[j].charAt(i) != ch){
         return strs [0].substring(0, i);
      }
    }
    return strs[0];
  }
}


