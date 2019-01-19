package subject

import types.Types.PreferenceIndex

case class PreferenceValue[B](preferred: B, index: PreferenceIndex)
