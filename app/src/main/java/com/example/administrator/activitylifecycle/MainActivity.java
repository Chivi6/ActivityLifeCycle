package com.example.administrator.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private void shorttoast(String str ){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(in);
            }
        });
        findViewById(R.id.b2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(in1);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        shorttoast("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        shorttoast("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        shorttoast("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        shorttoast("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        shorttoast("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        shorttoast("onRestatr");
    }
}
