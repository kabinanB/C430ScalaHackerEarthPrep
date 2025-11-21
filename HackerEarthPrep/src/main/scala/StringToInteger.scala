object StringToInteger {

  def myAtoi(s: String): Int = {
    var sign = 1
    var res = 0
    var idx = 0

    // 1. Skip leading spaces
    while (idx < s.length && s.charAt(idx) == ' ') {
      idx += 1
    }

    // 2. Handle sign
    if (idx < s.length && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
      if (s.charAt(idx) == '-') sign = -1
      idx += 1
    }

    // 3. Process digits
    while (idx < s.length && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {

      // Overflow/underflow check
      if (res > Integer.MAX_VALUE / 10 ||
        (res == Integer.MAX_VALUE / 10 && (s.charAt(idx) - '0') > 7)) {

        return if (sign == 1) Integer.MAX_VALUE else Integer.MIN_VALUE
      }

      // Build the number
      res = res * 10 + (s.charAt(idx) - '0')
      idx += 1
    }

    res * sign
  }

  def main(args: Array[String]): Unit = {

    val ex1 = "42"
    println(s"Input: '$ex1' => Output: ${myAtoi(ex1)}  (Expected: 42)")

    val ex2 = "   -42"
    println(s"Input: '$ex2' => Output: ${myAtoi(ex2)}  (Expected: -42)")

    val ex3 = "4193 with words"
    println(s"Input: '$ex3' => Output: ${myAtoi(ex3)}  (Expected: 4193)")

    val ex4 = "words and 987"
    println(s"Input: '$ex4' => Output: ${myAtoi(ex4)}  (Expected: 0)")

    val ex5 = "-91283472332"
    println(s"Input: '$ex5' => Output: ${myAtoi(ex5)}  (Expected: -2147483648)")
  }
}
