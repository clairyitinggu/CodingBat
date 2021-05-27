/*
Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
so powerN(3, 2) is 9 (3 squared).

powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
*/

public int powerN(int base, int n) {
  // version 1
  // if( n == 1){
  //   return base;
  // }
  //
  // if( n % 2 == 0){
  //   return powerN(base, n / 2) * powerN(base, n / 2);
  // }else{
  //   return base * powerN(base, n / 2) * powerN(base, n / 2);
  // }

  // version 2
  if( n == 0) return 1;
  return base * powerN(base, n - 1);
}
