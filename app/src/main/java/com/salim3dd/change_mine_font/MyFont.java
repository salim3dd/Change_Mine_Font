package com.salim3dd.change_mine_font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Salim3dd on 28/12/2016.
 */

public class MyFont extends TextView {

    public MyFont(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.setTypeface(Typeface.createFromAsset(context.getAssets(),MainActivity.Font));
    }
}
