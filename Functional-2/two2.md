Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.

two2([1, 2, 3]) → [4, 6]
two2([2, 6, 11]) → [4]
two2([0]) → [0]



```java
public List<Integer> two2(List<Integer> nums) {
   /* solution 1 
  nums.replaceAll( s -> s * 2);
  nums.removeIf( s -> s % 10 ==2);
  return nums;
  */
  
   /* solution 2 */
   return nums.stream().map( s -> s * 2).filter( s -> s % 10 != 2).collect(Collectors.toList());
}

```

