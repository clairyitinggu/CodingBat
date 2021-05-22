Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"



```java
public String minCat(String a, String b) {
  int min = 0;
  //hello 5, hi 2, (5-2) ,
  if(a.length() >= b.length()){
    min = b.length();
    return a.substring( a.length() - b.length()) + b;
  }else{
    min = a.length();
    //java hello
    return a + b.substring(b.length()- a.length());
  }
  
}

```

