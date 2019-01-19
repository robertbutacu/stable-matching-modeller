package types

import eu.timepit.refined.api.Refined
import eu.timepit.refined.numeric.Positive

object Types {
  type PreferenceIndex = Int Refined Positive
}
