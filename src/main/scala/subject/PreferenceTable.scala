package subject

case class PreferenceTable[A, B](subject: A, preferences: List[PreferenceValue[B]])
