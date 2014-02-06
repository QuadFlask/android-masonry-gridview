package net.flask.masonry;

import android.graphics.Bitmap;


public interface OnUrlImageLoadCompletedCallback {
	public void onCompleted();
	public void onCompleted(Bitmap bitmap);
}
