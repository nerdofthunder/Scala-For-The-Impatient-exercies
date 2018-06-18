package patmcdermott.six

import patmcdermott.util._

class ConversionsTest extends ImpatientTestKit {
  describe("convert between units") {
    it("should convert inches to centimeters") {
      assert(5.08 === Conversions.inchesToCentimeters(2))
    }
  }
}
