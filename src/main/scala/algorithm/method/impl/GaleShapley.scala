package algorithm.method.impl

import algorithm.method.MatchingMethod
import data.PreferenceRow
import types.Types.{IntermediaryResult, Result}

object GaleShapley {
  implicit def galeShapley[A, B]: MatchingMethod[A, B] = (as: PreferenceRow[A, B], bs: PreferenceRow[B, A]) => {
    //@tailrec
    def go(as: PreferenceRow[A, B], bs: PreferenceRow[A, B], currentMatches: IntermediaryResult[A, B]): Result[A, B] = {
      ???
    }


    ???
  }
}
