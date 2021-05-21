Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}



```java
public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String,Integer> map = new HashMap<>();
  Map<String,Boolean> result = new HashMap<>();
  
  for(int i = 0 ; i < strings.length;i++){
    
    if(map.containsKey(strings[i])){
      map.put(strings[i],map.get(strings[i])+1);
    }else{
      map.put(strings[i],1);
    }
    
    result.put(strings[i], map.get(strings[i])>=2);
  }
  
  return result;
}

```

