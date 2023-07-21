// Generated by view binder compiler. Do not edit!
package com.tofa.Villa_1412200037.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tofa.Villa_1412200037.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView PasswordtextView;

  @NonNull
  public final TextView UsernametextView;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final EditText passwordEditText;

  @NonNull
  public final EditText usernameEditText;

  private FragmentLoginBinding(@NonNull LinearLayout rootView, @NonNull TextView PasswordtextView,
      @NonNull TextView UsernametextView, @NonNull Button loginButton,
      @NonNull EditText passwordEditText, @NonNull EditText usernameEditText) {
    this.rootView = rootView;
    this.PasswordtextView = PasswordtextView;
    this.UsernametextView = UsernametextView;
    this.loginButton = loginButton;
    this.passwordEditText = passwordEditText;
    this.usernameEditText = usernameEditText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.PasswordtextView;
      TextView PasswordtextView = ViewBindings.findChildViewById(rootView, id);
      if (PasswordtextView == null) {
        break missingId;
      }

      id = R.id.UsernametextView;
      TextView UsernametextView = ViewBindings.findChildViewById(rootView, id);
      if (UsernametextView == null) {
        break missingId;
      }

      id = R.id.loginButton;
      Button loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.passwordEditText;
      EditText passwordEditText = ViewBindings.findChildViewById(rootView, id);
      if (passwordEditText == null) {
        break missingId;
      }

      id = R.id.usernameEditText;
      EditText usernameEditText = ViewBindings.findChildViewById(rootView, id);
      if (usernameEditText == null) {
        break missingId;
      }

      return new FragmentLoginBinding((LinearLayout) rootView, PasswordtextView, UsernametextView,
          loginButton, passwordEditText, usernameEditText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
