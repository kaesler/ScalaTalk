package esler

import java.text.DateFormatSymbols

object ScalaExampleApp {

  // Toy program to print out the months that contain
  def main(args : Array[String]) : Unit = {

	// Get the array of month names
	//
    val monthNames = new DateFormatSymbols().getMonths

    val result = (
      // Create a sequence 0..11
      //
      0.until(12)
      
      // Map it to a sequence of monthnames
      //
      map { i => monthNames(i) }
      
      // Filter for those month names containing "m"
      //
      filter { s => s.contains("m") || s.contains("M")}
      
      // Sort in descending order
      //
      sortWith { (x, y) => x > y }
      
      // Concatenate comma-separated.
      //
      reduceLeft { (s: String , t: String ) => s + "," + t }
    )

    println(result)
  }
}
