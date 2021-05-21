Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"



```java
public String wordAppend(String[] strings) {
  //use variable to make the code more readable
  Map<String,Integer> map = new HashMap<>();
  String result = "";
  for(int i = 0; i < strings.length;i++){
    if(map.containsKey(strings[i])){
    if((map.get(strings[i])+1)%2==0){
      result += strings[i];
    }
      map.put(strings[i],map.get(strings[i])+1);
    }else{
    map.put(strings[i],1);
  }
  }
  return result;
 
}



```

