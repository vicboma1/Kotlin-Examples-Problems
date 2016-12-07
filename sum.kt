/*
 * Your task is to implement the sum() function so that it computes the sum of
 * all elements in the given array a.
 */
package sum

fun sum(a: IntArray): Int {
    // Write your solution here
    return 0
}

// Solution 1

fun sum1(a: IntArray): Int {
 return a.filter { it != null }.sum()
}

// Solution 2

fun sum2(a: IntArray): Int {
  var _sum = 0
  for(element in a)
    _sum += element       

  return _sum
  
// Solution 3

fun sum3(a: IntArray): Int {
  val iterator = a.iterator()
  var _sum: Int = 0
  while (iterator.hasNext()){
    _sum += iterator.next()
  }

   return _sum
}
