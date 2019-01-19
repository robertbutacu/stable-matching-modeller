package types

import eu.timepit.refined.api.Refined
import eu.timepit.refined.numeric.Greater

object Types {
  type Result[A, B]    = List[(A, B)]
  type IntermediaryResult[A, B] = Result[A, B]
  type Score           = Double

  type ValidIndex      = Greater[shapeless.nat._0]
  type PreferenceIndex = Refined[Int, ValidIndex]
}
