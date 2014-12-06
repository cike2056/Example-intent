package com.qf.example_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SecondActivity extends Activity{
	private RadioGroup rg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		rg = (RadioGroup) findViewById(R.id.rg);
		
		RadioButton rb1 =(RadioButton)rg.getChildAt(0);
		rb1.setChecked(true);/**必须在这里设置是否被选中,在xml中设置,默认为"男",不选择时,闪退.*/
	}
	public void btnClick(View view){
		RadioButton rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
		if(rb.getText().toString()!=null){
			String text = rb.getText().toString();
			Intent intent = getIntent();
			intent.putExtra("text", text);
			setResult(11, intent);
			finish();
		}
	}
}
