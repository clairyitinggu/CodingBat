Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"



```java
public String doubleChar(String str) {
  String newStr = "";
  for(int i = 0 ; i < str.length();i++){
    // newStr = newStr + str.charAt(i) + str.charAt(i);
    newStr = newStr + str.substring(i,i+1) + str.substring(i,i+1);
    
  }
  return newStr;
}

```

