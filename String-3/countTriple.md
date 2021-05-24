We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.

countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0



```java
public int countTriple(String str) {
  
  if(str.length() < 3) return 0;
  int count = 0;
  //aaa  length  is 3 , 
  for(int i = 1 ; i < str.length() -1; i++){
    if( str.charAt(i) == str.charAt(i-1) && str.charAt(i) == str.charAt(i+1)){
      count++;
    }
  }
  return count;
}

```

