package esler

object PatternMatchingExampleApp {

  def main(args : Array[String]) : Unit = {

    def computeSize(s: Seq[Int]): Int = {
	  s match {
	    case x::xs => 1 + computeSize(xs)
		case _ => 0
	  }
	}

    println(computeSize(Seq()))
    println(computeSize(Seq(1,2,3,4,5)))
  }
}
