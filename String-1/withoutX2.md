Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"



```java
public String withoutX2(String str) {
  if(str.length() == 0){
    return str;
  }
  if(str.length() ==1 && str.equals("x")){
    return "";
  }else if(str.length() == 1){
    return str;
  }
  String sub = str.substring(0,2);
  return sub.replace("x","") + str.substring(2);
}

```

