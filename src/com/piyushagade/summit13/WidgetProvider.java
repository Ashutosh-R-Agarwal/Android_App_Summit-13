package com.piyushagade.summit13;

 import java.text.SimpleDateFormat;
 import android.appwidget.AppWidgetManager;
 import android.appwidget.AppWidgetProvider;
 import android.content.Context;
 import android.widget.ImageButton;
 import android.widget.RemoteViews;

 public class WidgetProvider extends AppWidgetProvider {
	 ImageButton widget_call,widget_about;
 
 // Define the format string for the date
 private SimpleDateFormat formatter = new SimpleDateFormat("EEEEEEEEE\nd MMM yyyy" );

 @Override
 public void onUpdate(Context context,
 AppWidgetManager appWidgetManager, int[] appWidgetIds) {
	 
	 
				
	// Change the text in the widget
	 RemoteViews updateViews = new RemoteViews(
	 context.getPackageName(), R.layout.widget_layout);
   //updateViews.setTextViewText(R.id.days_remaining, now);
	 appWidgetManager.updateAppWidget(appWidgetIds, updateViews);
	 

	 // Not really necessary, just a habit
	 super.onUpdate(context, appWidgetManager, appWidgetIds);
	
		 
	 

  }
 }
 
 