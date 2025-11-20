object TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    for(i<-0 until nums.size){
      for(j<-i+1 until nums.size){
        if(nums(i) + nums(j) == target){
          return Array(i,j)
        }
      }
    }
    Array(0,0)
  }

  def main(args: Array[String]): Unit = {
    //Test case 1
    val numsOne = Array(2,7,11,15)
    val targetOne = 9

    val ansOne = twoSum(numsOne, targetOne)

    println(s"Input nums = [${numsOne.mkString(", ")}], target = $targetOne")
    println("Output: " + ansOne.mkString("Array(", ", ", ")"))

    //Test case 2
    val numsTwo = Array(3,2,4)
    val targetTwo = 6

    val ansTwo = twoSum(numsTwo, targetTwo)


    println(s"\nInput nums = [${numsTwo.mkString(", ")}], target = $targetTwo")
    println("Output: " + ansTwo.mkString("Array(", ", ", ")"))

    //Test case 3
    val numsThree = Array(3,3)
    val targetThree = 6

    val ansThree = twoSum(numsThree, targetThree)

    println(s"\nInput nums = [${numsThree.mkString(", ")}], target = $targetThree")
    println("Output: " + ansThree.mkString("Array(", ", ", ")"))
  }

}
