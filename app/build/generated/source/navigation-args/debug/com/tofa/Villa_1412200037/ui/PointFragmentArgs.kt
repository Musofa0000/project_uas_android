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

public data class PointFragmentArgs(
  public val Register: Villa?
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Villa::class.java)) {
      result.putParcelable("Register", this.Register as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Villa::class.java)) {
      result.putSerializable("Register", this.Register as Serializable?)
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
      result.set("Register", this.Register as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Villa::class.java)) {
      result.set("Register", this.Register as Serializable?)
    } else {
      throw UnsupportedOperationException(Villa::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): PointFragmentArgs {
      bundle.setClassLoader(PointFragmentArgs::class.java.classLoader)
      val __Register : Villa?
      if (bundle.containsKey("Register")) {
        if (Parcelable::class.java.isAssignableFrom(Villa::class.java) ||
            Serializable::class.java.isAssignableFrom(Villa::class.java)) {
          __Register = bundle.get("Register") as Villa?
        } else {
          throw UnsupportedOperationException(Villa::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"Register\" is missing and does not have an android:defaultValue")
      }
      return PointFragmentArgs(__Register)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): PointFragmentArgs {
      val __Register : Villa?
      if (savedStateHandle.contains("Register")) {
        if (Parcelable::class.java.isAssignableFrom(Villa::class.java) ||
            Serializable::class.java.isAssignableFrom(Villa::class.java)) {
          __Register = savedStateHandle.get<Villa?>("Register")
        } else {
          throw UnsupportedOperationException(Villa::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"Register\" is missing and does not have an android:defaultValue")
      }
      return PointFragmentArgs(__Register)
    }
  }
}
