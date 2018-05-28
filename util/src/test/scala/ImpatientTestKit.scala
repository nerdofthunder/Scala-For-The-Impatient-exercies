package patmcdermott.util

import org.scalatest._

object ImpatientTestKit {
  def formatClassName(inputClass: Class[_]): String =
    """[^a-zA-Z0-9]""".r.replaceAllIn(inputClass.getCanonicalName, "_")
}

class ImpatientTestKit extends TestKit
  with FunSpecLike
  with Matchers
  with BeforeAndAfterEach
  with Eventually
  with Inside