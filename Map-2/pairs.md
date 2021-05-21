Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.


pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

```
public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<>();

  for(int i = 0;i < strings.length;i++){
    String temp = strings[i];
    String one = String.valueOf(temp.charAt(0));
    String last = String.valueOf(temp.charAt(temp.length()-1));
    map.put(one,last);
  }
  return map;
}


```
