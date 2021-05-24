Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"



```java
public String oneTwo(String str) {
  if(str.length()< 3) return "";
  String newStr = "";
  // abc (1,3) 
  for(int i = 0 ; i < str.length(); i+=3){
    if(i+3 <=str.length()){
      newStr = newStr + str.substring(i+1,i+3) + str.charAt(i);
    }
    
  }
  return newStr;
}

```

