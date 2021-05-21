Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]



```java
public List<Integer> no9(List<Integer> nums) {
  //solution 1 
  //nums.removeIf(x -> x % 10 == 9);
  // return nums;
  
  //solution 2
  return nums.stream().filter( x -> x % 10 != 9).collect(Collectors.toList());
}

```

