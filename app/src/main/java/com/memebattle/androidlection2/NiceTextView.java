package com.memebattle.androidlection2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint("AppCompatCustomView")
public class NiceTextView extends TextView {

    public NiceTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public NiceTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public NiceTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "GreatVibes-Regular.otf");
            setTypeface(tf);
        }
    }
}
