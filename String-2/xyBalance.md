We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false



```java
public boolean xyBalance(String str) {
  
  if(str.length()==0) return true;
  int x = -1;
  int y = -1;
  int count = 0;
  for(int i = 0;i < str.length();i++){
    if(str.charAt(i) == 'x'){
      x = i;
    }
    if(str.charAt(i) == 'y'){
      y = i;
    }
    count++;
  }
  return y >= x && str.length() == count;
}

```

