package algorithm

import types.Types.PreferenceIndex

trait PreferenceOrder[S] {
  def self: S
  def inferPreference(others: List[S]): PreferenceIndex
}
