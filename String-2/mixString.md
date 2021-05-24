Given two strings, **a** and **b**, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"



```java
public String mixString(String a, String b) {
  String newStr = "";
  //hi there  2, 5
  int len = a.length() >= b.length() ? b.length(): a.length();
  for(int i = 0;i < len ;i++){
    newStr = newStr + a.substring(i,i+1) + b.substring(i,i+1);
  }
  
  if(a.length() > len){
    newStr = newStr + a.substring(len);
  }
  if(b.length() > len){
    newStr = newStr + b.substring(len);
  }
  
  return newStr;
}

```

