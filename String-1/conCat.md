Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"



```java
public String conCat(String a, String b) {
   if(a.length()==0) return b;
   if(b.length()==0) return a;
   
   String lastA = a.substring(a.length()-1);
   String firstB = b.substring(0,1);
   
   if(lastA.equals(firstB)){
     return a + b.substring(1);
   }
   return a+b;
}

```

