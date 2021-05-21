Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.


math1([1, 2, 3]) → [20, 30, 40]
math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
math1([10]) → [110]



```java
public List<Integer> math1(List<Integer> nums) {
  nums.replaceAll(x -> (x+1) * 10);
  return nums;
}

```

