Given a list of strings, return a list where each string has "y" added at its start and end.

moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]



```java
public List<String> moreY(List<String> strings) {
  strings.replaceAll(x -> "y" + x + "y");
  return strings;
}

```

