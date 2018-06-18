package patmcdermott.six

object InchesToCentimeters extends UnitConversion {
  override def convert(inches: Double): Double = {
    inches * 2.54
  }
}

object GallonsToLiters extends UnitConversion {
  override def convert(gallons: Double): Double = {
    gallons * 3.785411784
  }
}

object MilesToKilometers extends UnitConversion {
  override def convert(miles: Double): Double = {
    miles * 1.609344
  }
}
