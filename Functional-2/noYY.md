Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.

noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) → ["ay", "by"]
noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]



```java
public List<String> noYY(List<String> strings) {
   /* solution 1 
  strings.replaceAll(s -> s + "y");
  strings.removeIf(s -> s.contains("yy"));
  return strings;
  */
  
   /* solution 2 */
   return strings.stream().map( s-> s + "y").filter( s -> !s.contains("yy")).collect(Collectors.toList());
}

```

