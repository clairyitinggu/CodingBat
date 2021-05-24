Given a string and a non-empty **word** string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"



```java
public String wordEnds(String str, String word) {
  
  /* I didn't figure out this one
  if(str.length() == word.length()) return "";
  
  String newStr = "";
  int pos = str.indexOf(word);
  
  return newStr;
  */
  
 //* online solution
  String res = "";
    int pos = str.indexOf(word);
    while (pos != -1) {
        if (pos != 0) res += str.charAt(pos-1);
        if (pos + word.length() == str.length()) break; 
        res += str.charAt(pos + word.length());
        pos = str.indexOf(word, pos+1);
    }
    return res; 
    
  //*/  
}

```

