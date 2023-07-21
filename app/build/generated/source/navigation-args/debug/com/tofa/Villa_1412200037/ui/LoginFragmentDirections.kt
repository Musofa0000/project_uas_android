package com.tofa.Villa_1412200037.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.tofa.Villa_1412200037.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToFirstFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_LoginFragment_to_FirstFragment)
  }
}
