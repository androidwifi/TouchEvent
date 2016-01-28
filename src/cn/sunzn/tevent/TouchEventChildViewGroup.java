package cn.sunzn.tevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class TouchEventChildViewGroup extends LinearLayout {

	public TouchEventChildViewGroup(Context context) {
		super(context);
	}

	public TouchEventChildViewGroup(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public boolean dispatchTouchEvent(MotionEvent ev) {
		Log.e("sunzn", "TouchEventChildViewGroup | dispatchTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
//		return super.dispatchTouchEvent(ev);
		return true;
	}

	public boolean onInterceptTouchEvent(MotionEvent ev) {
		Log.i("sunzn", "TouchEventChildViewGroup | onInterceptTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
		return super.onInterceptTouchEvent(ev);
	}

	public boolean onTouchEvent(MotionEvent ev) {
		Log.d("sunzn", "TouchEventChildViewGroup | onTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
		return super.onTouchEvent(ev);
	}

}
