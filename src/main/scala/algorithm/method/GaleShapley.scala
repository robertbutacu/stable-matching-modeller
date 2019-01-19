package algorithm.method
import data.PreferenceRow

object GaleShapley {
  implicit def galeShapley[A, B]: MatchingMethod[A, B] = new MatchingMethod[A, B] {
    override def matchData(as: PreferenceRow[A, B], bs: PreferenceRow[B, A]): Unit = ???
  }
}
