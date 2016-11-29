package com.example.gk.testviewswitch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;

/**
 * 项目名称：Ytb_Android
 * 类描述：
 * 创建人：gk
 * 创建时间：2016/11/28 16:13
 * 修改人：gk
 * 修改时间：2016/11/28 16:13
 * 修改备注：
 */
public class CustomViewSwitch extends ViewSwitcher {
    public CustomViewSwitch(Context context) {
        super(context);
    }

    public CustomViewSwitch(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e("test", "onMeasure:onMeasure");
        if (getChildAt(0) == getCurrentView()) {
            setDisplayedChild(0);
        } else {
            setDisplayedChild(1);
        }
    }

    @Override
    public void setDisplayedChild(int whichChild) {
        Log.e("test", "whichChild:" + whichChild);
        super.setDisplayedChild(whichChild);
        int viewIndex = whichChild;
        if (viewIndex >= getChildCount()) {
            viewIndex = 0;
        } else if (viewIndex < 0) {
            viewIndex = getChildCount() - 1;
        }
        View child = getChildAt(viewIndex);
        MarginLayoutParams layoutParams = (MarginLayoutParams) child.getLayoutParams();
        ViewGroup.LayoutParams params = getLayoutParams();
        params.height = layoutParams.height + layoutParams.topMargin + layoutParams.bottomMargin;
        setLayoutParams(params);
    }
}
