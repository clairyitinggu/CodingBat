We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false



```java
public boolean gHappy(String str) {
  str = 'X' + str + 'X';
  for(int i = 1; i < str.length() - 1; i++){
    if( str.charAt(i) == 'g' && str.charAt(i-1) != 'g'&& str.charAt(i + 1) != 'g' ){
      return false;
    }
  }
  return true;
}

```

