package cn.sunzn.tevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TouchEventChildView extends TextView {

	public TouchEventChildView(Context context) {
		super(context);
	}

	public TouchEventChildView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public boolean dispatchTouchEvent(MotionEvent ev) {
		Log.e("sunzn", "TouchEventChildView | dispatchTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
		return super.dispatchTouchEvent(ev);
//		return true;
	}

	public boolean onTouchEvent(MotionEvent ev) {
		Log.d("sunzn", "TouchEventChildView | onTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
		return super.onTouchEvent(ev);
	}

}
