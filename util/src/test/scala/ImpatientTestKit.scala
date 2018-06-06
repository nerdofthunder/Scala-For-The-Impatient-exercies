package patmcdermott.util

import org.scalatest._

object ImpatientTestKit {
  def formatClassName(inputClass: Class[_]): String =
    """[^a-zA-Z0-9]""".r.replaceAllIn(inputClass.getCanonicalName, "_")
}

class ImpatientTestKit
    extends FunSpecLike
    with Matchers
    with BeforeAndAfterEach
    with Inside
