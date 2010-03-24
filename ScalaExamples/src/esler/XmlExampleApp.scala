package esler

object XmlExampleApp {

  def main(args : Array[String]) : Unit = {
    var xmlDoc = <foo>
                   <bar>Bar text
                   </bar>
                 </foo>

    xmlDoc =  <projectDescription>
                <name>ScalaExamples</name>
                <comment></comment>
                <projects>
                </projects>
                <buildSpec>
                  <buildCommand>
                    <name>ch.epfl.lamp.sdt.core.scalabuilder</name>
                      <arguments>
                      </arguments>
                  </buildCommand>
                </buildSpec>
                <natures>
                  <nature>ch.epfl.lamp.sdt.core.scalanature</nature>
                  <nature>org.eclipse.jdt.core.javanature</nature>
                </natures>
              </projectDescription>

    // More relaxed syntax for unary methods.
    //
    for (node <- xmlDoc \ "natures" \ "nature") {
      println(node.text.trim)
    }

    // With syntax emphasizing method calls.
    //
    for (node <- xmlDoc.\("natures").\("nature")) {
      println(node.text.trim)
    }
  }
}
