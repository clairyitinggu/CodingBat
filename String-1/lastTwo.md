Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"



```java
public String lastTwo(String str) {
  if(str.length() <=1) return str;
  //cat
  String last = str.substring(str.length()-1);//t
  String last2 = str.substring(str.length()-2,str.length()-1);//(1,2)a
  return str.substring(0,str.length()-2) + last + last2;
}

```

