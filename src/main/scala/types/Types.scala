package types

import eu.timepit.refined.api.Refined
import eu.timepit.refined.numeric.Greater

object Types {
  type Score           = Double

  type ValidIndex      = Greater[shapeless.nat._1]
  type PreferenceIndex = Refined[Int, ValidIndex]
}
