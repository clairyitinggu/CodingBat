Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"



```java
public String deFront(String str) {  
  
  int first = 0;
  int second = 1;
  //keep a
  if(!str.substring(0,1).equals("a")){
    first = -1;
  }
  //keep b
  if(!str.substring(1,2).equals("b")){
    second = -1;
  }
  // return without first 2
  if(first < 0 && second <0) {
    return str.substring(2);
  }
  
  if(first == 0 && second !=1) return str.substring(0,1)+str.substring(2);
  if(second == 1 && first != 0) return str.substring(1);
  return str;
  
}

```

