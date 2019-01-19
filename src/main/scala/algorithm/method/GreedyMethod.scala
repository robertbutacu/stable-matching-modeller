package algorithm.method
import data.PreferenceTable

object GreedyMethod {
  implicit def greedyMethod[A, B]: MatchingMethod[A, B] = (as: PreferenceTable[A, B], bs: PreferenceTable[B, A]) => ???
}
