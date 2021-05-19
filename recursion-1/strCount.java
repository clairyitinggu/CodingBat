/*
Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.

strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
*/

public int strCount(String str, String sub) {
  if(str.length() < sub.length()) return 0;
  //xyx x
  int subLength = sub.length();//1
  if(str.substring(0,subLength).equals(sub)){
    return 1 + strCount(str.substring(subLength),sub);
  }
  return strCount(str.substring(1),sub);

}
