package com.piyushagade.summit13;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Waterpolo extends Activity {

	ImageButton calendar,dates,other,contactus,ibexit,iback,call1,call2,help;
	TextView rule6,rule1,rule2,rule3,rule4,rule5,number1,number2,sport,money;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Fullscreen Codelet
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.a_sport);

		ibexit = (ImageButton) findViewById(R.id.ibexit);
		help = (ImageButton) findViewById(R.id.help);
		dates = (ImageButton) findViewById(R.id.dates_red);
		calendar = (ImageButton) findViewById(R.id.calendar);
		contactus = (ImageButton) findViewById(R.id.contactus);
		iback = (ImageButton) findViewById(R.id.iback);
		rule1 = (TextView) findViewById(R.id.rule1);
		rule2 = (TextView) findViewById(R.id.rule2);
		rule3 = (TextView) findViewById(R.id.rule3);
		rule4 = (TextView) findViewById(R.id.rule4);
		rule5 = (TextView) findViewById(R.id.rule5);
		rule6 = (TextView) findViewById(R.id.rule6);
		number1 = (TextView) findViewById(R.id.number1);
		number2 = (TextView) findViewById(R.id.number2);
		sport = (TextView) findViewById(R.id.sport);
		money = (TextView) findViewById(R.id.money);
		call1 = (ImageButton) findViewById(R.id.call1);
		call2 = (ImageButton) findViewById(R.id.call2);

		// Help Button
		help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b = new Intent("com.piyushagade.summit13.HELP");
				startActivity(b);

			}

		});

		// Sport Specific Code //
		rule1.setText("1. Maximum no. of players: 13");
		rule2.setText("2. Balls will be provided.");
		rule3.setText("3. Incase of a draw, 2 halves of 3 mins each will be played & if required then penalty shootout will decide the winner.");
		rule4.setText("");
		rule5.setText("");
		rule6.setText("");
		number1.setText("Pratik Bendale: 8390056966");
		number2.setText("");
		money.setText("Men: Rs. 800");
		sport.setText("Water Polo");

		// Call Button
		call1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("tel:8390056966")));

			}
		});

		//Call 2
		call2.setBackgroundResource(R.drawable.call_blank);


		// Back Button
		iback.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();

			}

		});		

		// Exit Button
		ibexit.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub


			}

		});




		// Contactus Button
		contactus.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b = new Intent("com.piyushagade.summit13.CONTACTUS");
				startActivity(b);

			}

		});





		//Calendar
		calendar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent b = new Intent("com.piyushagade.summit13.DATES");
				startActivity(b);
			}
		});


	}


}
