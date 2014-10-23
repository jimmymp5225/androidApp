package com.example.twoactivityapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends Activity implements OnClickListener {

	private EditText txtName;
	private Button btnGo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("First Activity");
		setContentView(R.layout.activity_first);

		txtName = (EditText) findViewById(R.id.txtName);
		btnGo = (Button) findViewById(R.id.btnGo);

		btnGo.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

		Bundle bundle = new Bundle();
		bundle.putString("username", txtName.getText().toString());
		bundle.putString("password", "xyz");
		intent.putExtras(bundle);
		startActivity(intent);
	}
}
