package com.example.masonry;

import java.util.Random;

import net.flask.masonry.MasonryGridView;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements OnClickListener {
	MasonryGridView masonryGridView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		masonryGridView = new MasonryGridView(this, 2);

		LinearLayout ll = (LinearLayout) findViewById(R.id.main);
		ll.addView(masonryGridView);

		for (int i = 0; i < 100; i++)
			addRandomButton();
	}

	Random rand = new Random();
	int index = 0;

	private void addRandomButton() {
		Button child = new Button(this);

		child.setHeight(50 + rand.nextInt(400));
		child.setText("[" + index++ + "]");
		child.setOnClickListener(this);

		masonryGridView.addView(child);
	}

	@Override
	public void onClick(View v) {
		addRandomButton();
	}

}
