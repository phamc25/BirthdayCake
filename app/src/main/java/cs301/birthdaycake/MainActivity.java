package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
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

        blow.setOnClickListener(cakeCont);

        candle.setOnCheckedChangeListener(cakeCont);

        numCandles.setOnSeekBarChangeListener(cakeCont);

    }

    public void goodbyeButton(View button) {
        Log.i("button", "Goodbye");
    }
}
