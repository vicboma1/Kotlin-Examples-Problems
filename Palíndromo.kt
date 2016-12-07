/*
 * Your task is to implement a palindrome test.
 *
 * A string is called a palindrome when it reads the same way left-to-right
 * and right-to-left.
 *
 * See http://en.wikipedia.org/wiki/Palindrome
 */
package palindrome

fun isPalindrome(s: String): Boolean {
    // Write your solution here
    return false
}

// Solution 1

fun isPalindrome(s: String): Boolean {
    return s == s.reversed()
}

// Solution 2

fun isPalindrome(s: String): Boolean {
  var reversed = ""
  for(i in s.indices.reversed())
    reversed = "$reversed${s.charAt(i)}"

    return s == reversed  
}

// Solution 3

fun isPalindrome(s: String): Boolean {
  val iterator = s.iterator()
  var _reversed = ""
  while(iterator.hasNext()){
      val _char = iterator.next()
      _reversed = "$_char$_reversed"
  }
    return s == _reversed
}
