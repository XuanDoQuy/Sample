package com.xuandq.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_Tong;
    EditText edt_so1;
    EditText edt_so2;
    TextView txt_Ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Tong = (Button) findViewById(R.id.btn_calculate);
        edt_so1 = (EditText) findViewById(R.id.edt_number1);
        edt_so2 = (EditText) findViewById(R.id.edt_number2);
        txt_Ketqua = (TextView) findViewById(R.id.txt_result);

        btn_Tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1  = edt_so1.getText().toString();
                String chuoi2 = edt_so2.getText() . toString();

                int so1 = Integer.parseInt(chuoi1);
                int so2 = Integer.parseInt(chuoi2);

                txt_Ketqua.setText(String.valueOf(so1 + so2));
            }
        });
    }
}