Given a string and a non-empty **word** string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy++



```java
public String plusOut(String str, String word) {
  String newStr = "";
  int size = word.length();
  for(int i = 0 ;i < str.length();i++){
    //12xy34 xy (2,4) i = 2+2-1=3
    if( i+size <= str.length() && str.substring(i,i+size).equals(word)){
      newStr = newStr + word;
      i = i + size-1;
    }else{
      newStr = newStr + '+';
    }
  }
  return newStr;
}

```

