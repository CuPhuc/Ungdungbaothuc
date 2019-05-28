package com.example.baothuc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    Button btnHenGio,btnNgung;
    TextView txtHienThi;
    TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHenGio = (Button)findViewById(R.id.btnHenGio);
        btnNgung = (Button)findViewById(R.id.btnNgung);
        txtHienThi = (TextView)findViewById(R.id.txtHienThi);
        timePicker = (TimePicker)findViewById(R.id.timePicker);

        btnHenGio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                txtHienThi.setText("Giờ bạn đặt giờ là:");
            }
        });

        btnNgung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtHienThi.setText("Ngưng");
            }
        });
    }
}
