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

public data class SecondFragmentArgs(
  public val villa: Villa?
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Villa::class.java)) {
      result.set("villa", this.villa as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Villa::class.java)) {
      result.set("villa", this.villa as Serializable?)
    } else {
      throw UnsupportedOperationException(Villa::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): SecondFragmentArgs {
      bundle.setClassLoader(SecondFragmentArgs::class.java.classLoader)
      val __villa : Villa?
      if (bundle.containsKey("villa")) {
        if (Parcelable::class.java.isAssignableFrom(Villa::class.java) ||
            Serializable::class.java.isAssignableFrom(Villa::class.java)) {
          __villa = bundle.get("villa") as Villa?
        } else {
          throw UnsupportedOperationException(Villa::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"villa\" is missing and does not have an android:defaultValue")
      }
      return SecondFragmentArgs(__villa)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): SecondFragmentArgs {
      val __villa : Villa?
      if (savedStateHandle.contains("villa")) {
        if (Parcelable::class.java.isAssignableFrom(Villa::class.java) ||
            Serializable::class.java.isAssignableFrom(Villa::class.java)) {
          __villa = savedStateHandle.get<Villa?>("villa")
        } else {
          throw UnsupportedOperationException(Villa::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"villa\" is missing and does not have an android:defaultValue")
      }
      return SecondFragmentArgs(__villa)
    }
  }
}
