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

public class Badminton extends Activity {

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
		help = (ImageButton) findViewById(R.id.help);
		
		// Sport Specific Code //
		rule1.setText("1. Minimum players for men: 4, max: 6");
		rule2.setText("2. Minimum players for women: 2, max: 4.");
		rule3.setText("3. There will be three singles and two doubles in men's category.");
		rule4.setText("4. There will be two singles and one double in women's category.");
		rule5.setText("5. There can be a maximum of 3 common players in the men's category.");
		rule6.setText("");
		number1.setText("Ashwin Barve: 9860793649");
		number2.setText("");
		money.setText("Men: Rs. 800, Women: Rs. 700");
		sport.setText("Badminton");
		
		// Call Button
				call1.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						startActivity(new Intent(Intent.ACTION_VIEW,
								Uri.parse("tel:9860793649")));
						
					}
				});
				
				//Call 2
				call2.setBackgroundResource(R.drawable.call_blank);
				
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
