Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2



```java
public int countCode(String str) {
  
  int count = 0;
  
  for(int i = 0 ;i < str.length()-3;i++){
    // str.substring(0,4) == code
    if(str.substring(i,i+4).equals("code")){
      count++;
      continue;
    }
    // str.substring(0,2) && str.substring(3,4)
    if(str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e")){
      count++;
    }
    
  }
  return count;
  
}

```

