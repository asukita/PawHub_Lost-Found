package com.blastic.pawhublostfound;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView.BufferType;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;

public class LoginActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		TextView appTitle = (TextView) findViewById(R.id.login_app_tittle);

		SpannableString text = new SpannableString("" + appTitle.getText());
		text.setSpan(new ForegroundColorSpan(Color.rgb(99, 194, 208)), 0, 4, 0);
		text.setSpan(new ForegroundColorSpan(Color.rgb(255, 255, 255)), 5, 7, 1);
		text.setSpan(new ForegroundColorSpan(Color.rgb(255, 212, 0)), 7,
				text.length(), 2);
		appTitle.setText(text, BufferType.SPANNABLE);

		TextView appsubTitle = (TextView) findViewById(R.id.login_app_subtittle);
		appsubTitle.setTypeface(null, Typeface.BOLD);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getSupportMenuInflater();
		inflater.inflate(R.menu.activity_itemlist, menu);
		getSupportActionBar().setBackgroundDrawable(
				new ColorDrawable(Color.parseColor("#B71C4E")));
		getSupportActionBar().hide();
		return true;
	}

	public void onBtnLogin_Click(View v) {
		/*
		TextView user = (TextView) findViewById(R.id.txtUser);
		TextView password = (TextView) findViewById(R.id.txtPassword);

		if (user.getText().toString().equals("")) {
			Toast.makeText(getApplicationContext(), ENTER_USERNAME,
					Toast.LENGTH_SHORT).show();
			return;
		} else if (password.getText().toString().equals("")) {
			Toast.makeText(getApplicationContext(), ENTER_PASSWORD,
					Toast.LENGTH_SHORT).show();
			return;
		}*/

		Intent loginPHIntent = new Intent(this, MainActivity.class);
		startActivity(loginPHIntent);
	}

}
