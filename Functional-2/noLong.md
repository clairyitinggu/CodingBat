Given a list of strings, return a list of the strings, omitting any string length 4 or more.

noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []



```java
public List<String> noLong(List<String> strings) {
  /* solution 1 
  strings.removeIf( s -> s.length() >=4);
  return strings;
  */
   /* solution 2 */
   return strings.stream().filter( s -> s.length() < 4).collect(Collectors.toList());
   
}

```

