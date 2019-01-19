package algorithm.method
import data.PreferenceTable

object GaleShapley {
  implicit def galeShapley[A, B]: MatchingMethod[A, B] = new MatchingMethod[A, B] {
    override def matchData(as: PreferenceTable[A, B], bs: PreferenceTable[B, A]): Unit = ???
  }
}
