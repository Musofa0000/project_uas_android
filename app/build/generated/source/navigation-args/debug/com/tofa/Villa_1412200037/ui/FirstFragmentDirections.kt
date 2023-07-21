package com.tofa.Villa_1412200037.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.tofa.Villa_1412200037.R
import com.tofa.Villa_1412200037.model.Villa
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class FirstFragmentDirections private constructor() {
  private data class ActionFirstFragmentToSecondFragment(
    public val villa: Villa?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_FirstFragment_to_SecondFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Villa::class.java)) {
          result.putParcelable("villa", this.villa as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Villa::class.java)) {
          result.putSerializable("villa", this.villa as Serializable?)
        } else {
          throw UnsupportedOperationException(Villa::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionFirstFragmentToSecondFragment(villa: Villa?): NavDirections =
        ActionFirstFragmentToSecondFragment(villa)
  }
}
