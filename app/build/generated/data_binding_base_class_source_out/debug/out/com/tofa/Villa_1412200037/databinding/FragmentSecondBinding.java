// Generated by view binder compiler. Do not edit!
package com.tofa.Villa_1412200037.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tofa.Villa_1412200037.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSecondBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final EditText addresEditText;

  @NonNull
  public final EditText capacityEditText;

  @NonNull
  public final Button deleteButton;

  @NonNull
  public final EditText nameEditText;

  @NonNull
  public final Button savebutton;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  private FragmentSecondBinding(@NonNull NestedScrollView rootView,
      @NonNull EditText addresEditText, @NonNull EditText capacityEditText,
      @NonNull Button deleteButton, @NonNull EditText nameEditText, @NonNull Button savebutton,
      @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
    this.rootView = rootView;
    this.addresEditText = addresEditText;
    this.capacityEditText = capacityEditText;
    this.deleteButton = deleteButton;
    this.nameEditText = nameEditText;
    this.savebutton = savebutton;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSecondBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSecondBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_second, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSecondBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addresEditText;
      EditText addresEditText = ViewBindings.findChildViewById(rootView, id);
      if (addresEditText == null) {
        break missingId;
      }

      id = R.id.capacityEditText;
      EditText capacityEditText = ViewBindings.findChildViewById(rootView, id);
      if (capacityEditText == null) {
        break missingId;
      }

      id = R.id.deleteButton;
      Button deleteButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteButton == null) {
        break missingId;
      }

      id = R.id.nameEditText;
      EditText nameEditText = ViewBindings.findChildViewById(rootView, id);
      if (nameEditText == null) {
        break missingId;
      }

      id = R.id.savebutton;
      Button savebutton = ViewBindings.findChildViewById(rootView, id);
      if (savebutton == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new FragmentSecondBinding((NestedScrollView) rootView, addresEditText,
          capacityEditText, deleteButton, nameEditText, savebutton, textView2, textView3,
          textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
