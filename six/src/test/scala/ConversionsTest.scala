package patmcdermott.six

import patmcdermott.util._

class ConversionsTest extends ImpatientTestKit {
  describe("convert between units") {
    it("should convert inches to centimeters") {
      assert(5.08 === Conversions.inchesToCentimeters(2))
    }
    it("should convert gallons to liters") {
      assert(3.785411784 === Conversions.gallonsToLiters(1))
    }
  }
}
