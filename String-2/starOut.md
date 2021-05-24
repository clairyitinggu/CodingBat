Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"



```java
public String starOut(String str) {
  //I didn't figure out this problem
  /*String newStr = "";
  int start = str.indexOf("*");
  int end = str.lastIndexOf("*");
  
  if(start == end){
    //ab*cd   * is in index 2
    
    newStr = newStr + str.substring(0,start-1)  + str.substring(start+2); 
  }else{
    //sm*eil*ly start = 2, end = 6 (start + 2, end -1 )  4
    newStr = newStr + str.substring(0,start-1) + str.substring(start + 2, end -1) + str.substring(end+2);
  }
  return newStr;
  */
  
  while (str.indexOf('*') != -1) {
        if (str.equals("*")) return "";
        int starPos = str.indexOf('*');
        int secondStar = str.indexOf('*', starPos+1);
        if (secondStar - starPos == 1) {
            str = str.substring(0,starPos) + str.substring(secondStar);
            continue;
        }
        if (starPos == 0) str = str.substring(starPos+2);
        else if (starPos == str.length()-1)
            str = str.substring(0, str.length()-2);
        else str = str.substring(0, starPos-1) + str.substring(starPos+2);
    }
    return str;
}

```

