package cn.sunzn.tevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class TouchEventParent extends LinearLayout {

	public TouchEventParent(Context context) {
		super(context);
	}

	public TouchEventParent(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public boolean dispatchTouchEvent(MotionEvent ev) {
		Log.e("sunzn", "TouchEventParent | dispatchTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
		return super.dispatchTouchEvent(ev);
	}

	public boolean onInterceptTouchEvent(MotionEvent ev) {
		Log.i("sunzn", "TouchEventParent | onInterceptTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
//		return super.onInterceptTouchEvent(ev);
		return false;
	}

	public boolean onTouchEvent(MotionEvent ev) {
		Log.d("sunzn", "TouchEventParent | onTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
		return super.onTouchEvent(ev);
	}

}