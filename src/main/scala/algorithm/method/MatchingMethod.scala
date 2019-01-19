package algorithm.method

import data.PreferenceTable

trait MatchingMethod[A, B] {
  def matchData(as: PreferenceTable[A,B], bs: PreferenceTable[B, A])
}
