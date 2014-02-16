/**
 * Created by kenichi on 14/02/16.
 */

import scala.collection.mutable.ListBuffer

class URLDetector(it:Iterator[String]) {
  val URL = """((?i)<a href=")(.*)(http://)([^>]*)">""".r

  def findFirstOne():String = {
    val URLList = ListBuffer[String]()
    for(line <- it; matched <- URL.findFirstMatchIn(line)){
      val str = matched.group(3)+matched.group(4)
      URLList.append(str)
    }
    URLList(0)
  }
}
