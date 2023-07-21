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

public class PointFragmentDirections private constructor() {
  private data class ActionPointFragmentToLoginFragment(
    public val Login: Villa?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_PointFragment_to_LoginFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Villa::class.java)) {
          result.putParcelable("Login", this.Login as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Villa::class.java)) {
          result.putSerializable("Login", this.Login as Serializable?)
        } else {
          throw UnsupportedOperationException(Villa::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionPointFragmentToLoginFragment(Login: Villa?): NavDirections =
        ActionPointFragmentToLoginFragment(Login)
  }
}
