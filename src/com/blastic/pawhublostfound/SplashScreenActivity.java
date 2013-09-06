package com.blastic.pawhublostfound;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;

import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import android.widget.TextView.BufferType;

public class SplashScreenActivity extends SherlockActivity {
	
	private final int SPLASH_DISPLAY_LENGHT = 2000;

	@Override 
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_splash_screen);
		
		TextView appTitle = (TextView) findViewById(R.id.splash_app_tittle);
		
		SpannableString text = new SpannableString(""+ appTitle.getText());
		text.setSpan(new ForegroundColorSpan(Color.rgb(99, 194, 208)), 0, 4, 0);
		text.setSpan(new ForegroundColorSpan(Color.rgb(255, 255, 255)), 5, 7, 1);
		text.setSpan(new ForegroundColorSpan(Color.rgb(255, 212, 0)), 7, text.length(), 2);
		appTitle.setText(text, BufferType.SPANNABLE);
		
		TextView appsubTitle = (TextView) findViewById(R.id.splash_app_subtittle);
		appsubTitle.setTypeface(null,Typeface.BOLD);
		 
		new Handler().postDelayed(new Runnable(){
	         @Override
	         public void run() {
	             Intent mainIntent = new Intent(SplashScreenActivity.this,LoginActivity.class); 
	             SplashScreenActivity.this.startActivity(mainIntent);
	             SplashScreenActivity.this.finish();
	         }
	     }, SPLASH_DISPLAY_LENGHT);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getSupportMenuInflater(); 
		inflater.inflate(R.menu.activity_itemlist, menu); 
		getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#B71C4E")));
		getSupportActionBar().hide();
		return true;
	}

}
