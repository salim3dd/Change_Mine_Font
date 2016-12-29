package com.salim3dd.change_mine_font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Salim3dd on 29/12/2016.
 */

public class MyEditTExt extends EditText {
    public MyEditTExt(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),MainActivity.Font));
    }
}
