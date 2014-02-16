/**
 * Created by kenichi on 14/02/15.
 */

import scala.io.Source

object ScalaWork {

  def main(args: Array[String]){
    val source = Source.fromURL("http://www.brother.co.jp/")
    val lines = source.getLines()
    val urlDetector = new URLDetector(lines)

    println(urlDetector.findFirstOne())
    source.close()
  }
}