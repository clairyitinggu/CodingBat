Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.

firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}



```java
public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<>();
  for(int i = 0; i < strings.length;i++){
    String firstString = strings[i];
    String firstLetter = firstString.substring(0,1);//if use .charAt(),add valueOf(str.charAt())
    if(map.containsKey(firstLetter)){
      String concatLetter = map.get(firstLetter)+strings[i];
      map.put(firstLetter,concatLetter);
    }else{
      map.put(firstLetter,strings[i]);
    }
    
  }
  
  return map;
}

```

