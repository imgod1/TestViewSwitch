package com.example.gk.testviewswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewSwitcher;

import com.example.gk.testviewswitch.view.CustomViewSwitch;

public class MainActivity extends AppCompatActivity {
    private ViewSwitcher vswitch;
    private CustomViewSwitch cvswitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //传统
        vswitch = (ViewSwitcher) findViewById(R.id.vswitch);
        vswitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vswitch.showNext();
            }
        });

        //修改后
        cvswitch = (CustomViewSwitch) findViewById(R.id.cvswitch);
        cvswitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cvswitch.showNext();
            }
        });
    }
}
