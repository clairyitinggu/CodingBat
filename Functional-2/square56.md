Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.

square56([3, 1, 4]) → [19, 11]
square56([1]) → [11]
square56([2]) → [14]



```java
public List<Integer> square56(List<Integer> nums) {
   /* solution 1 
  nums.replaceAll( s -> s * s + 10);
  nums.removeIf( s -> s % 10 == 5 || s % 10 == 6 );
  return nums;
  */
  
   /* solution 2 */
   return nums.stream().map( s -> s * s + 10).filter( s -> s % 10 < 5 || s % 10 >6).collect(Collectors.toList());
}

```

