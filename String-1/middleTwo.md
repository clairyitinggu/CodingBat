Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"



```java
public String middleTwo(String str) {
  //str.length =6, 6/2 = 3   (2,3) (3,4)
  int len = str.length()/2;
  return str.substring(len-1,len) + str.substring(len,len+1);
}

```

