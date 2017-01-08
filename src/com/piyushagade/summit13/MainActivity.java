package com.piyushagade.summit13;

import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
public class MainActivity extends Activity {
	String baseURL = "http://mitsummit.mitpune.edu.in/android/notification.xml";
	ImageButton updates_red,register_red,ibexit,sports_red,calendar,dates,other,contactus,others_red,help,settings,about_red;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Fullscreen Codelet
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);


		setContentView(R.layout.activity_main);

		ibexit = (ImageButton) findViewById(R.id.ibexit);
		help = (ImageButton) findViewById(R.id.help);
		sports_red = (ImageButton) findViewById(R.id.sports_red);
		register_red = (ImageButton) findViewById(R.id.register_red);
		dates = (ImageButton) findViewById(R.id.dates_red);
		calendar = (ImageButton) findViewById(R.id.calendar);
		contactus = (ImageButton) findViewById(R.id.contactus);
		updates_red = (ImageButton) findViewById(R.id.updates_red);
		others_red = (ImageButton) findViewById(R.id.updates_red);
		about_red = (ImageButton) findViewById(R.id.about_red);
		settings = (ImageButton) findViewById(R.id.settings);


		new DownloadImageTask((ImageView) findViewById(R.id.imageView2))
		.execute("http://mitsummit.mitpune.edu.in/android/go.png");


		// Help Button
		help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b = new Intent("com.piyushagade.summit13.HELP");
				startActivity(b);

			}

		});




		// Settings Button
		settings.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b = new Intent("com.piyushagade.summit13.SERVICE");
				startActivity(b);

			}

		});

		// Exit Button
		ibexit.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();

			}

		});


		// Sports_Red Button
		sports_red.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b = new Intent("com.piyushagade.summit13.SPORTS");
				startActivity(b);

			}

		});

		// About_Red Button
		about_red.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b = new Intent("com.piyushagade.summit13.ABOUTSUMMIT");
				startActivity(b);

			}

		});

		// Updates_Red Button
		updates_red.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b = new Intent("com.piyushagade.summit13.WEBVIEWACTIVITY");
				startActivity(b);

			}

		});

		// Register_Red Button
		register_red.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b = new Intent("com.piyushagade.summit13.REGISTER");
				startActivity(b);

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



		//Dates_red
		dates.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent b = new Intent("com.piyushagade.summit13.DATES");
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

	// ********** Menu Code

	private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
		ImageView bmImage;

		public DownloadImageTask(ImageView bmImage) {
			this.bmImage = bmImage;
		}

		protected Bitmap doInBackground(String... urls) {
			String urldisplay = urls[0];
			Bitmap mIcon11 = null;
			try {
				InputStream in = new java.net.URL(urldisplay).openStream();
				mIcon11 = BitmapFactory.decodeStream(in);
			} catch (Exception e) {
				Log.e("Error", e.getMessage());
				e.printStackTrace();
			}
			return mIcon11;
		}

		protected void onPostExecute(Bitmap result) {
			bmImage.setImageBitmap(result);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lowmenu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub

		switch (item.getItemId()) {
		case R.id.menuregister:
			Intent i = new Intent("com.piyushagade.summit13.REGISTER");
			startActivity(i);
			break;

		case R.id.menucontactus:
			Intent j = new Intent("com.piyushagade.summit13.CONTACTUS");
			startActivity(j);
			break;

		case R.id.menudates:
			Intent k = new Intent("com.piyushagade.summit13.DATES");
			startActivity(k);
			break;			

		case R.id.menuabout:
			Intent b = new Intent("com.piyushagade.summit13.ABOUT");
			startActivity(b);
			break;

		case R.id.exit:
			finish();
			break;
		}
		return false;
	}

}
