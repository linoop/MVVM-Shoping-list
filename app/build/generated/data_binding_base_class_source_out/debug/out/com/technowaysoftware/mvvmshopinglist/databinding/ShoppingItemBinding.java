// Generated by view binder compiler. Do not edit!
package com.technowaysoftware.mvvmshopinglist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.technowaysoftware.mvvmshopinglist.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ShoppingItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageViewDelete;

  @NonNull
  public final ImageView imageViewMinus;

  @NonNull
  public final ImageView imageViewPlus;

  @NonNull
  public final TextView textViewAmount;

  @NonNull
  public final TextView textViewName;

  private ShoppingItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageViewDelete, @NonNull ImageView imageViewMinus,
      @NonNull ImageView imageViewPlus, @NonNull TextView textViewAmount,
      @NonNull TextView textViewName) {
    this.rootView = rootView;
    this.imageViewDelete = imageViewDelete;
    this.imageViewMinus = imageViewMinus;
    this.imageViewPlus = imageViewPlus;
    this.textViewAmount = textViewAmount;
    this.textViewName = textViewName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ShoppingItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ShoppingItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.shopping_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ShoppingItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewDelete;
      ImageView imageViewDelete = rootView.findViewById(id);
      if (imageViewDelete == null) {
        break missingId;
      }

      id = R.id.imageViewMinus;
      ImageView imageViewMinus = rootView.findViewById(id);
      if (imageViewMinus == null) {
        break missingId;
      }

      id = R.id.imageViewPlus;
      ImageView imageViewPlus = rootView.findViewById(id);
      if (imageViewPlus == null) {
        break missingId;
      }

      id = R.id.textViewAmount;
      TextView textViewAmount = rootView.findViewById(id);
      if (textViewAmount == null) {
        break missingId;
      }

      id = R.id.textViewName;
      TextView textViewName = rootView.findViewById(id);
      if (textViewName == null) {
        break missingId;
      }

      return new ShoppingItemBinding((ConstraintLayout) rootView, imageViewDelete, imageViewMinus,
          imageViewPlus, textViewAmount, textViewName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
