Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)

noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]



```java
public List<String> noZ(List<String> strings) {
  
  /* solution 1
  strings.removeIf( s -> s.contains("z"));
  return strings;
  */
  
  /* solution 2 */
  return strings.stream().filter( s -> !s.contains("z")).collect(Collectors.toList());
  
}

```

