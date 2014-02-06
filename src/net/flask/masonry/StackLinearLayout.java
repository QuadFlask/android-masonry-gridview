package net.flask.masonry;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class StackLinearLayout {
	private int height;
	private LinearLayout layout;
	
	public StackLinearLayout(Context context, LinearLayout.LayoutParams params, int orientation) {
		layout = new LinearLayout(context);
		layout.setOrientation(orientation);
		layout.setLayoutParams(params);
	}
	
	public void addView(View view) {
		layout.addView(view);
		increaseHeight(view);
	}
	
	private void increaseHeight(View view) {
		view.measure(ViewGroup.MeasureSpec.UNSPECIFIED, ViewGroup.MeasureSpec.UNSPECIFIED);
		height += view.getMeasuredHeight();
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setBackgroundColor(int color) {
		layout.setBackgroundColor(color);
	}
	
	public LinearLayout getLayout() {
		return layout;
	}
	
}