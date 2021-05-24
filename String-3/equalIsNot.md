Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true



```java
public boolean equalIsNot(String str) {
  int is = 0;
  int not = 0;
  //isnotis
  for(int i = 0; i < str.length(); i++){
    if(i+2 <= str.length() && str.substring(i,i+2).equals("is")){
      is++;
      i = i + 1;
      continue;
    }
    
    if(i+3 <= str.length() && str.substring(i,i+3).equals("not")){
      not++;
      i = i + 2;
      continue;
    }
    
  }
 return is == not;
  
}

//Greg's solution
/*
public boolean equalIsNot(String str) {
    int countIs = 0;
    int countNot = 0;
    str = str + "X";    
    for (int i = 0; i < str.length() - 2; i++) {
        if (str.substring(i, i + 2).equals("is")) countIs++;
        if (str.substring(i, i + 3).equals("not")) countNot++;
    }
    return (countIs == countNot);
}

*/
```

