class CheckingAccount(initialBalance: Double)
    extends BankAccount(initialBalance) {

  var depositFee = 1
  var withdrawFee = 1

  override def deposit(amount: Double): Double =
    super.deposit(amount - depositFee)

  override def withdraw(amount: Double): Double =
    super.withdraw(amount + withdrawFee)
}
