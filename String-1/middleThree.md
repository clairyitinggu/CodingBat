Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"



```java
public String middleThree(String str) {
  if(str.length() == 3) return str;
  //candy and  (1,4) length = 5 /2 = 2
  int mid = str.length()/2;
  return str.substring(mid-1,mid+2);
}

```

