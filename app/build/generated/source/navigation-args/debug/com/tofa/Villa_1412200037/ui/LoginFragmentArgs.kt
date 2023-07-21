package com.tofa.Villa_1412200037.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.tofa.Villa_1412200037.model.Villa
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class LoginFragmentArgs(
  public val Login: Villa?
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Villa::class.java)) {
      result.set("Login", this.Login as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Villa::class.java)) {
      result.set("Login", this.Login as Serializable?)
    } else {
      throw UnsupportedOperationException(Villa::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): LoginFragmentArgs {
      bundle.setClassLoader(LoginFragmentArgs::class.java.classLoader)
      val __Login : Villa?
      if (bundle.containsKey("Login")) {
        if (Parcelable::class.java.isAssignableFrom(Villa::class.java) ||
            Serializable::class.java.isAssignableFrom(Villa::class.java)) {
          __Login = bundle.get("Login") as Villa?
        } else {
          throw UnsupportedOperationException(Villa::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"Login\" is missing and does not have an android:defaultValue")
      }
      return LoginFragmentArgs(__Login)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): LoginFragmentArgs {
      val __Login : Villa?
      if (savedStateHandle.contains("Login")) {
        if (Parcelable::class.java.isAssignableFrom(Villa::class.java) ||
            Serializable::class.java.isAssignableFrom(Villa::class.java)) {
          __Login = savedStateHandle.get<Villa?>("Login")
        } else {
          throw UnsupportedOperationException(Villa::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"Login\" is missing and does not have an android:defaultValue")
      }
      return LoginFragmentArgs(__Login)
    }
  }
}
