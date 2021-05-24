Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"



```java
public String zipZap(String str) {
  if(str.length() == 0) return "";
  if(str.length() <= 2) return str;
  String newStr = "";
  for(int i = 0; i < str.length(); i++){
    if(str.charAt(i)== 'z' && str.charAt(i+2) == 'p'){
      newStr = newStr + "zp";
      i = i + 2;
      continue;
    }
    newStr = newStr + str.charAt(i);
  }
  return newStr;
}

```

