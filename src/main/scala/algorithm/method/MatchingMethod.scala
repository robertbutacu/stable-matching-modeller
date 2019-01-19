package algorithm.method

import data.PreferenceRow
import types.Types.Result

trait MatchingMethod[A, B] {
  def matchData(as: PreferenceRow[A,B], bs: PreferenceRow[B, A]): Result[A, B]
}
