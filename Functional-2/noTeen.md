Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []



```java
public List<Integer> noTeen(List<Integer> nums) {
  //solution 1
  // nums.removeIf( x -> x >= 13 && x <=19);
  // return nums;
  
  //solution 2
  return nums.stream().filter(x -> x <13 || x > 19).collect(Collectors.toList());
}

```

