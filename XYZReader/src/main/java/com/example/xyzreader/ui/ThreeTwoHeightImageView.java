package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;


/**
 * Created by chahat on 5/8/17.
 */

public class ThreeTwoHeightImageView extends ImageView {

    public ThreeTwoHeightImageView(Context context){
        super(context);
    }

    public ThreeTwoHeightImageView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
    }

    public ThreeTwoHeightImageView(Context context,AttributeSet attributeSet,int defStyle){
        super(context,attributeSet,defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int threeTwoHeight = MeasureSpec.getSize(widthMeasureSpec) * 2/3;
        int threeTwoHeightSpec = MeasureSpec.makeMeasureSpec(threeTwoHeight,MeasureSpec.EXACTLY);

        super.onMeasure(widthMeasureSpec,threeTwoHeightSpec);
    }
}
