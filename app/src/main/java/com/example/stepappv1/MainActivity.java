package com.example.stepappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.progressindicator.CircularProgressIndicator;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int counter= 0;
    private TextView showCount;
    private CircularProgressIndicator progressbar;
    private int max=10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = (TextView) findViewById(R.id.show_count);
        progressbar = (CircularProgressIndicator) findViewById(R.id.progressBar2);
    }

    public void showToast(View view) {
        counter = 0;
        showCount.setText(Integer.toString(counter));
        Toast start_toast = Toast.makeText(this,R.string.counterStart, Toast.LENGTH_LONG);
        start_toast.show();
        progressbar.setProgress(counter);
    }

    public void countUp(View view) {
        counter ++;
        showCount.setText(Integer.toString(counter));
        progressbar.setProgress(counter);
    }
}