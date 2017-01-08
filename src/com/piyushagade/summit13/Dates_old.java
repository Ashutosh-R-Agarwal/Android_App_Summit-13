package com.piyushagade.summit13;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Dates_old extends Activity {

	ImageButton back,help;
	Button day1,day2,day3,day4,day5;
	TextView date,ev1,ev2,ev3,ev4,ev5,ev6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		// Fullscreen Codelet
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.dates);

		back = (ImageButton) findViewById(R.id.back);
		help = (ImageButton) findViewById(R.id.help);
		day1 = (Button) findViewById(R.id.day1);
		day2 = (Button) findViewById(R.id.day2);
		day3 = (Button) findViewById(R.id.day3);
		day4 = (Button) findViewById(R.id.day4);
		day5 = (Button) findViewById(R.id.day5);
		date = (TextView) findViewById(R.id.date); 
		ev1 = (TextView) findViewById(R.id.ev1);
		ev2 = (TextView) findViewById(R.id.ev2);
		ev3 = (TextView) findViewById(R.id.ev3);
		ev4 = (TextView) findViewById(R.id.ev4);
		ev5 = (TextView) findViewById(R.id.ev5);
		ev6 = (TextView) findViewById(R.id.ev6);

		// Help Button
		help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b = new Intent("com.piyushagade.summit13.HELP");
				startActivity(b);

			}

		});

		// Back Button
		back.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();

			}
		});

		day1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				date.setText("25th Sept:");
				ev1.setText("Baseball");
				ev2.setText("Baseball");
				ev3.setText("Baseball");
				ev4.setText("Baseball");
				ev5.setText("Baseball");
				ev6.setText("Baseball");						
			}
		});

		day2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				date.setText("26th Sept:");
				ev1.setText("Basketball");
				ev2.setText("Basketball");
				ev3.setText("Basketball");
				ev4.setText("Basketball");
				ev5.setText("Basketball");
				ev6.setText("Basketball");						
			}
		});

		day3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				date.setText("27th Sept:");
				ev1.setText("Volleyball");
				ev2.setText("Volleyball");
				ev3.setText("Volleyball");
				ev4.setText("Volleyball");
				ev5.setText("Volleyball");
				ev6.setText("Volleyball");
			}
		});

		day4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				date.setText("28th Sept:");
				ev1.setText("Volleyball");
				ev2.setText("Volleyball");
				ev3.setText("Volleyball");
				ev4.setText("Volleyball");
				ev5.setText("Volleyball");
				ev6.setText("Volleyball");
			}
		});

		day5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				date.setText("29th Sept:");
				ev1.setText("Volleyball");
				ev2.setText("Volleyball");
				ev3.setText("Volleyball");
				ev4.setText("Volleyball");
				ev5.setText("Volleyball");
				ev6.setText("Volleyball");
			}
		});


	}

}
