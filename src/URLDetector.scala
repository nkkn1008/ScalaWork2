/**
 * Created by kenichi on 14/02/16.
 */

import scala.collection.mutable.ListBuffer

class URLDetector(it:Iterator[String]) {
  val URL = """((?i)<a href=")(.*)(http://)([^>]*)">""".r

  def findFirstOne():String = {
    val URLList = ListBuffer[String]()
    for(line <- it){
      URL.findFirstMatchIn(line) match {
        case Some(m) => {
          val str = m.group(3)+m.group(4)
          URLList.append(str)
        }
        case None => ;
      }
    }
    URLList(0)
  }
}

