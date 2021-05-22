Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"



```java
public String withoutX(String str) {
  /* solution 1
  str.removeIf( s -> s.equals("x"));
  return str;
  */
  /* solution 2 
  int begin = 0;
  int end = str.length();
  
  if(str.length()>0 && str.charAt(0) == 'x'){
    begin = 1;
  }
  
  if(str.length() > 1 && str.charAt(end-1) == 'x' ){
    end -= 1;
  }
  
  return str.substring(begin,end);
  */
  
 /* solution 3 */
 if(str.equals("")) return str;
 
 if(str.substring(0,1).equals("x")){
   str = str.substring(1);
 };
 
 if(str.length() > 0 && str.substring(str.length()-1).equals("x") ){
   str = str.substring(0,str.length()-1);
 }
 return str;
 
}

//note: Method substring() returns a new string that is a substring of given string.

```

