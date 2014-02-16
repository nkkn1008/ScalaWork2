/**
 * Created by kenichi on 14/02/16.
 */
class URLDetector(it:Iterator[String]) {
  val URL = """((?i)<a href=")(.*)(http://)([^>]*)">""".r

  def findFirstOne():String = {
    val func = (x:String) => {
      val matched = URL.findFirstIn(x)
      if( matched != None) List(matched.get)
      else List()
    }
    val URLList = it.flatMap(func)
    URLList.next()
  }
}
