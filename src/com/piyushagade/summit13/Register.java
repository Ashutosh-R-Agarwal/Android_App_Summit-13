package com.piyushagade.summit13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import android.app.Activity;
import android.app.DownloadManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Register extends Activity {

	ImageButton back;
	Button button1;
	ImageView view;
	Notification notification;
	URL url;
    URLConnection conn;
    int fileSize, lastSlash;
    String fileName;
    BufferedInputStream inStream;
    BufferedOutputStream outStream;
    File outFile;
    FileOutputStream fileStream;
    Message msg;
	

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		// Fullscreen Codelet
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.register);
		

		
		back = (ImageButton) findViewById(R.id.back);
		button1 = (Button) findViewById(R.id.button1);
		
		// Back Button
				back.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						finish();
						
					}
				});
				
		// Download Button
				button1.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub

						
						//startActivity(new Intent(Intent.ACTION_VIEW,
							//	Uri.parse("http://www.mitsummit.mitpune.edu.in/downloads/form.pdf")));
						Intent b = new Intent("com.piyushagade.summit13.DOWNLOAD");
						startActivity(b);
		            

						
					}
				});
		
	}

}
