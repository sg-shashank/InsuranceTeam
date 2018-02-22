package com.margaret.insuranceteam.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.margaret.insuranceteam.R;

public class MainActivity extends AppCompatActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Toolbar mainToolbar = findViewById(R.id.main_toolbar);
		mainToolbar.setTitle(R.string.team_profile);
		setSupportActionBar(mainToolbar);
	}
}
