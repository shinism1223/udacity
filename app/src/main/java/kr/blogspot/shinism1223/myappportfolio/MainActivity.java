package kr.blogspot.shinism1223.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void showToastMessage(String text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onButton1Clicked(View v) {
        showToastMessage("This Button will launch my popular movies app!");
    }
    public void onButton2Clicked(View v) {
        showToastMessage("This Button will launch my stock hawk app!");
    }
    public void onButton3Clicked(View v) {
        showToastMessage("This Button will launch my build it bigger app!");
    }
    public void onButton4Clicked(View v) {
        showToastMessage("This Button will launch my make your app material app!");
    }
    public void onButton5Clicked(View v) {
        showToastMessage("This Button will launch my go ubiquitous app!");
    }
    public void onButton6Clicked(View v) {
        showToastMessage("This Button will launch my capstone app!");
    }



}

