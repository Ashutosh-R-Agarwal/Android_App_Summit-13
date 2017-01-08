package com.piyushagade.summit13;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
	String baseURL="http://mitsummit.mitpune.edu.in/android/notification.xml";

	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {

		// We want this service to continue running until it is explicitly
		// stopped, so return sticky.
		Toast.makeText(this, "Notification service active.", Toast.LENGTH_LONG).show();

		do{
			
		}while(!true);
		return START_STICKY;



	}
	@Override
	public void onDestroy() {
		super.onDestroy();
		Toast.makeText(this, "Notification service has been deactived You will not recieve any automatic news notification..", Toast.LENGTH_LONG).show();
	}
}
