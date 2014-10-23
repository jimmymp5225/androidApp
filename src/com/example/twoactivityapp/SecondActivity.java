package com.example.twoactivityapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

	private TextView lblName;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("Second Activity");
		setContentView(R.layout.activity_second);

		Bundle bundle = getIntent().getExtras();

		lblName = (TextView) findViewById(R.id.lblName);
		lblName.setText(bundle.getString("username"));
	}
}
