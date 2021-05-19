/*
Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.


strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
*/

public int strDist(String str, String sub) {
  if(str.length() == 0 || str.length() < sub.length() ) return 0;

  int subLength = sub.length();
  int strLength = str.length();

  if(str.substring(0,subLength).equals(sub) && str.substring(strLength - subLength).equals(sub) ){
    return str.length();
  }
  if(!str.substring(0, subLength).equals(sub))
        return strDist(str.substring(1), sub);

    return strDist(str.substring(0, strLength - 1), sub);

}
