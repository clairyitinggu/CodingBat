Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true



```java
public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  //check which one is shorter: here b is shorter
  if(a.length() > b.length()){
    // check whether the shortest one does exit in the longest one
    //hiabc  abc   length: 5 3   (2,5)   
    if(a.substring(a.length()-b.length()).equals(b)){
      return true;
    }
  // here a is shorter 
  }else{
    if(b.substring(b.length()-a.length()).equals(a)){
      return true;
    }
  }
  return false;
   
}

```

