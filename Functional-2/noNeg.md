Given a list of integers, return a list of the integers, omitting any that are less than 0.

noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []



```java
public List<Integer> noNeg(List<Integer> nums) {
  
  return nums.stream().filter( n -> n >=0).collect(Collectors.toList());
  // nums.removeIf( s -> s <0);
  //return nums;
}


/*
The Java stream system provides more complicated lambda features. 
The stream calls do not modify the original list, 
returning a new data structure of the results. 
Note that the boolean logic of filter() is the opposite of removeIf().
*/
```

