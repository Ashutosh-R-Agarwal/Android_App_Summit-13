package com.piyushagade.summit13;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ToggleButton;

public class Service extends Activity {
	ToggleButton switcher;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Fullscreen Codelet
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.service);
		ImageButton iback = (ImageButton) findViewById(R.id.back);
		switcher = (ToggleButton) findViewById(R.id.tbswitch);

		switcher.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(switcher.isChecked()){
					startService(new Intent(getBaseContext(), MyService.class));
				}
				else{

					stopService(new Intent(getBaseContext(), MyService.class));

				}
			}
		});

		// Back Button
		iback.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();

			}

		});

	}
	public void startService(View view) {
		startService(new Intent(getBaseContext(), MyService.class));
	}
	public void stopService(View view) {
		stopService(new Intent(getBaseContext(),
				MyService.class));
	}
}