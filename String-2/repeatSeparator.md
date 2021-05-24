Given two strings, **word** and a separator **sep**, return a big string made of **count** occurrences of the word, separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"



```java
public String repeatSeparator(String word, String sep, int count) {
  if(count == 0) return "";
  if(count == 1) return word;
  String newStr = "";
  for(int i = 0 ; i < count -1; i++){
    newStr = newStr + word + sep;
  }
  return newStr + word;
}

```

