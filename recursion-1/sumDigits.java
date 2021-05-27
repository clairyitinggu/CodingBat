/*
Given a non-negative int n, return the sum of its digits recursively (no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3
*/

public int sumDigits(int n) {
  // first version
  // if( n == 0){
  //   return 0;
  // }
  // if( n == 1){
  //   return 1;
  // }
  //
  // int i = n % 10;//6  2
  // return i + sumDigits( n/10 );//12  0

  //second version
  if(n == 0) return 0;
  return n % 10 + sumDigits(n / 10);
}
