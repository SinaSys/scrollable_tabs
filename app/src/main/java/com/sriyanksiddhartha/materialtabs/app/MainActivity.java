package com.sriyanksiddhartha.materialtabs.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.sriyanksiddhartha.materialtabs.R;
import com.sriyanksiddhartha.materialtabs.tabs.ScrollTabs;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	private Toolbar toolbar;
	private Button btnSimpleTabs, btnScrollableTabs, btnIconTabs, btnCustomIconTextTabs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		btnSimpleTabs = (Button) findViewById(R.id.btnSimpleTabs);
		btnScrollableTabs = (Button) findViewById(R.id.btnScrollableTabs);
		btnIconTabs = (Button) findViewById(R.id.btnIconTabs);
		btnCustomIconTextTabs = (Button) findViewById(R.id.btnCustomIconTabs);

		btnSimpleTabs.setOnClickListener(this);
		btnScrollableTabs.setOnClickListener(this);
		btnIconTabs.setOnClickListener(this);
		btnCustomIconTextTabs.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {

		Intent i = null;

		switch (view.getId()) {

			case R.id.btnSimpleTabs:
				break;

			case R.id.btnIconTabs:
				break;

			case R.id.btnScrollableTabs:
				i = new Intent(MainActivity.this, ScrollTabs.class);
				break;

			case R.id.btnCustomIconTabs:
				break;
		}

		startActivity(i);
	}
}
