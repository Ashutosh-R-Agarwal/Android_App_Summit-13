package com.piyushagade.summit13;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Sports extends ListActivity {
	
	// List 
	String classes[] = {"Cricket","Football","Baseball","Basketball","Volleyball",
			"Rowing","Waterpolo","Swimming","Carrom","Chess","Boxing","Squash","Badminton",
			"LawnTennis","TableTennis"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		Toast.makeText(this, "Select a sport.", Toast.LENGTH_LONG).show();


		// Fullscreen Codelet
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		// List Adapter
		setListAdapter(new ArrayAdapter <String>(Sports.this, android.R.layout.simple_list_item_1, classes));

	}


	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String cheese = classes[position];
		try {

			Class ourClass = Class.forName("com.piyushagade.summit13." + cheese);
			Intent ourIntent = new Intent(Sports.this, ourClass);
			startActivity(ourIntent);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



}

