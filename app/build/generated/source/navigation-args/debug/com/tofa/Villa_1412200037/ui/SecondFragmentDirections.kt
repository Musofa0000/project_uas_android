package com.tofa.Villa_1412200037.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.tofa.Villa_1412200037.R

public class SecondFragmentDirections private constructor() {
  public companion object {
    public fun actionSecondFragmentToFirstFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_SecondFragment_to_FirstFragment)
  }
}
