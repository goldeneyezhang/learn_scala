import scala.collection.mutable

object Greet {
  def main(args: Array[String]) = {
    println("Hello world!")
    //sample 3.1
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"
    for(i <- 0 to 2)
      print(greetStrings(i))

    //sample 3.3
    val oneTwo = List(1,2)
    var threeFour = List(3,4)
    val oneTwoThreeFout = oneTwo ::: threeFour
    println(oneTwo + " and " + threeFour + " were not mutated.")
    println("Thus, " + oneTwoThreeFout + " is a new List")
    val twoThree = List(2,3)
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree)

    //sample 3.4
    val pair = (99, "Luftballons")
    println(pair._1)
    println(pair._2)

    //sample 3.5
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet)
    println(jetSet.contains("Cessna"))

    //sample 3.6
    val movieSet = mutable.Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)
  }
}
