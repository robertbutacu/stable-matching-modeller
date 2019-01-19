package algorithm.inferer

import data.{PreferenceRow, PreferenceValue}
import types.Types.{ValidIndex, PreferenceIndex, Score}
import eu.timepit.refined._

trait MatchesInferer[A, B] {
  def inferForValue(a: A, bs: List[B], preferenceFunction: (A, B) => Score): PreferenceRow[A, B] = {
    PreferenceRow(a,
      bs.map(b => (b, preferenceFunction(a, b)))
        .sortWith((s1, s2) => s1._2 >= s2._2)
        .map(_._1)
        .zipWithIndex
        .map(m => refineV[ValidIndex](m._2 + 1) match {
          case Left(err) => ???
          case Right(v) => PreferenceValue(m._1, v: PreferenceIndex)
        })
    )
  }
}
