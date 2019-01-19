package algorithm.method

import data.PreferenceRow

trait MatchingMethod[A, B] {
  def matchData(as: PreferenceRow[A,B], bs: PreferenceRow[B, A])
}
