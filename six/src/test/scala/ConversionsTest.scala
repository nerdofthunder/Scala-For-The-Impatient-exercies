package patmcdermott.six

import patmcdermott.util._

class ConversionsTest extends ImpatientTestKit {
  describe("convert between units") {
    it("should convert inches to centimeters") {
      assert(5.08 === InchesToCentimeters.convert(2))
    }
    it("should convert gallons to liters") {
      assert(3.785411784 === GallonsToLiters.convert(1))
    }
    it("should convert miles to kilometers") {
      assert(1.609344 === MilesToKilometers.convert(1))
    }
  }
}
