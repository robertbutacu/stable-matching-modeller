package algorithm.method
import data.PreferenceRow

object GreedyMethod {
  implicit def greedyMethod[A, B]: MatchingMethod[A, B] = (as: PreferenceRow[A, B], bs: PreferenceRow[B, A]) => ???
}
