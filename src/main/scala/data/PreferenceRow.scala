package data

case class PreferenceRow[A, B](subject: A, preferences: List[PreferenceValue[B]])
