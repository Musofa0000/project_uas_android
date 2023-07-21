package com.tofa.Villa_1412200037.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.tofa.Villa_141220037.model.Villa
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class StartFragmentArgs(
  public val GetStarted: Villa?
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Villa::class.java)) {
      result.putParcelable("Get started", this.GetStarted as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Villa::class.java)) {
      result.putSerializable("Get started", this.GetStarted as Serializable?)
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
      result.set("Get started", this.GetStarted as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Villa::class.java)) {
      result.set("Get started", this.GetStarted as Serializable?)
    } else {
      throw UnsupportedOperationException(Villa::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): StartFragmentArgs {
      bundle.setClassLoader(StartFragmentArgs::class.java.classLoader)
      val __GetStarted : Villa?
      if (bundle.containsKey("Get started")) {
        if (Parcelable::class.java.isAssignableFrom(Villa::class.java) ||
            Serializable::class.java.isAssignableFrom(Villa::class.java)) {
          __GetStarted = bundle.get("Get started") as Villa?
        } else {
          throw UnsupportedOperationException(Villa::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"Get started\" is missing and does not have an android:defaultValue")
      }
      return StartFragmentArgs(__GetStarted)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): StartFragmentArgs {
      val __GetStarted : Villa?
      if (savedStateHandle.contains("Get started")) {
        if (Parcelable::class.java.isAssignableFrom(Villa::class.java) ||
            Serializable::class.java.isAssignableFrom(Villa::class.java)) {
          __GetStarted = savedStateHandle.get<Villa?>("Get started")
        } else {
          throw UnsupportedOperationException(Villa::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"Get started\" is missing and does not have an android:defaultValue")
      }
      return StartFragmentArgs(__GetStarted)
    }
  }
}
