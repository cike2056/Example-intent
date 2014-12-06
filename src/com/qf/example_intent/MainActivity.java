package com.qf.example_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tx_sex;
	private ImageView imgv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tx_sex= (TextView) findViewById(R.id.txtv_sex);
		imgv = (ImageView) findViewById(R.id.imgv);
	}
	public void btnClick(View view){
		switch(view.getId()){
		case R.id.btn_sex:
			Intent intent_sex = new Intent(MainActivity.this,SecondActivity.class);
			startActivityForResult(intent_sex, 1);
			break;
		case R.id.btn_imgv:
			Intent intent_imgs = new Intent(MainActivity.this,ThirdActivity.class);
			startActivityForResult(intent_imgs, 2);
			break;
		}
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode==1&&resultCode==11){
			String stringExtra = data.getStringExtra("text");
			tx_sex.setText(stringExtra);
		}else if(requestCode==2&&resultCode==12){
			int id = data.getIntExtra("img", 100);
			imgv.setBackgroundResource(id);
		}
	}
}
