import patmcdermott.util._

class CheckingAccountTest extends ImpatientTestKit {
  describe("deposit") {
    it("should charge 1 dollar for a deposit") {
      val checkingAccount = new CheckingAccount(50)

      assert(59 == checkingAccount.deposit(10))
      assert(59 == checkingAccount.currentBalance)
    }
  }

  describe("withdraw") {
    it("should charge 1 dollar for a withdraw") {
      val checkingAccount = new CheckingAccount(50)

      assert(39 == checkingAccount.withdraw(10))
      assert(39 == checkingAccount.currentBalance)
    }
  }
}
