package com.frostchein.atlant.views;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.ButterKnife;

public abstract class BaseCustomView extends FrameLayout implements CustomView {

  public BaseCustomView(Context context, AttributeSet attrs) {
    super(context, attrs);
    init(context);
  }

  public BaseCustomView(Context context) {
    super(context);
    init(context);
  }

  private void init(Context context) {
    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View view = inflater.inflate(getLayoutRes(), this);
    ButterKnife.bind(view);
    initView();
  }

  protected abstract void initView();

  @LayoutRes
  protected abstract int getLayoutRes();
}
