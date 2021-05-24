Given two strings, **base** and **remove**, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"



```java
public String withoutString(String base, String remove) {
  /*
  String newStr = "";
  int size = remove.length();
  for(int i = 0; i < base.length();i++){
    if( !base.substring(i,i+size).equals(remove)){
      newStr = newStr + base.charAt(i);
    }else{
      i = i + size-1;
    }
  }
  return newStr;
  */
  
     String result = "";
    int index = base.toLowerCase().indexOf(remove.toLowerCase());
    while (index != -1) {
        result += base.substring(0, index);
        base = base.substring(index + remove.length());
        index = base.toLowerCase().indexOf(remove.toLowerCase());
    }
    result += base;
    return result;
}

```

