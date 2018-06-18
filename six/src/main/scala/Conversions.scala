package patmcdermott.six

object Conversions {
  def inchesToCentimeters(inches: Double): Double = {
    inches * 2.54
  }

  def gallonsToLiters(gallons: Double): Double = {
    gallons * 3.785411784
  }
}
