package com.qf.example_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends Activity{
	private int images[]={R.drawable.img3,R.drawable.img4,R.drawable.img5};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
	}
	public void btnClick(View view){
		Intent intent = getIntent();
		switch(view.getId()){
		case R.id.imgb1:
			intent.putExtra("img", images[0]);
			break;
		case R.id.imgb2:
			intent.putExtra("img", images[1]);
			break;
		case R.id.imgb3:
			intent.putExtra("img", images[2]);
			break;
		}
		setResult(12, intent);
		finish();
	}
}
