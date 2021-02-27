package com.mycompany.jiajian;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity { 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // 加法按钮
	public void jia(View v) {
        // Log.d("TAG","点击了按钮");

        EditText ed =findViewById(R.id.EditText1);
        String edt = ed.getText().toString();
        int edtt = Integer.valueOf(edt).intValue() + 1;
        ed.setText(String.valueOf(edtt));     
    }

    // 减法按钮
    public void jian(View v) {
        EditText ed =findViewById(R.id.EditText1);
        String ed_str = ed.getText().toString();
        int ed_int = Integer.valueOf(ed_str).intValue() - 1;
        ed.setText(String.valueOf(ed_int));   
    }
    // 尝试解决EditText 值为空的时候，进行加减法运算程序闪退
    public void ceshi(View v) {
        final EditText ed =findViewById(R.id.EditText1);
        
        String edt = ed.getText().toString();
        int ed_int= Integer.valueOf(edt).intValue();

        if (ed.getText().toString() == null) {
            Toast.makeText(this, "空" + ed.getText().toString(), Toast.LENGTH_SHORT).show();
            //ed_int = ed_int + 1;
            ed.setText(String.valueOf(0));

        } else {
            Toast.makeText(this,"不空" + ed.getText().toString(), Toast.LENGTH_SHORT).show();
        }

        

    }
} 

