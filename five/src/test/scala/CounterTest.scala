package patmcdermott.five

import patmcdermott.util._

class CounterTest extends ImpatientTestKit {
  describe("counter increment") {
    it("should not exceed integer boundary") {
      val counter = new Counter()

      (0 to Int.MaxValue).foreach(_ => counter.increment())
      counter.increment()

      assert(Int.MaxValue === counter.current())
    }
  }
}
