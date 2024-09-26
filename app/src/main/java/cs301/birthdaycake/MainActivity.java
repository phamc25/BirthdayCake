package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.method.Touch;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cakeView = findViewById(R.id.cakeview);
        CakeController cakeCont = new CakeController(cakeView);

        // Button reference
        Button blow = findViewById(R.id.button);

        // Switch reference
        Switch candle = findViewById(R.id.switch_candles);

        // Seekbar reference
        SeekBar numCandles = findViewById(R.id.seekBar);

        // Balloon touch reference
        blow.setOnClickListener(cakeCont);

        // Set candle listener
        candle.setOnCheckedChangeListener(cakeCont);

        // Set seek bar listener
        numCandles.setOnSeekBarChangeListener(cakeCont);

        // Set touch for balloon
        cakeView.setOnTouchListener(cakeCont);

    }

    public void goodbyeButton(View button) {
        Log.i("button", "Goodbye");
    }
}
