Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true



```java
public boolean xyzThere(String str) {
  if(str.length()>=3 && str.substring(0,3).equals("xyz")) return true;
  //xyz
  for(int i = 1; i < str.length()-2;i++){
    if(str.substring(i,i+3).equals("xyz") && !str.substring(i-1,i).equals(".")){
     return true;
    }
  }
  
  return false;
}

```

