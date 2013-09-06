package com.blastic.pawhublostfound;

import com.actionbarsherlock.app.SherlockActivity; 
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;

import android.os.Bundle;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import android.view.View;
import android.widget.TextView; 


public class MainActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		int titleId = Resources.getSystem().getIdentifier("action_bar_title", "id", "android");
		TextView Tv = (TextView)findViewById(titleId);
		
		Tv.setTextColor(Color.rgb(99, 194, 208));
		//Log.i("info", "ksaisi"+Tv.length());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getSupportMenuInflater();
		inflater.inflate(R.menu.activity_itemlist, menu);
		getSupportActionBar().setDisplayShowTitleEnabled(false);
		getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#B71C4E")));
		return true;
	}
	
	public void goToDetailPics(View v){
		Intent detailPicsIntent = new Intent(this, DetailPicsActivity.class);
		startActivity(detailPicsIntent);
	}

}
