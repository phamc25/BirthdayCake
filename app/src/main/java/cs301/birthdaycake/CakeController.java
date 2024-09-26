package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, View.OnTouchListener, CompoundButton.OnCheckedChangeListener, SeekBar
        .OnSeekBarChangeListener {

    // Instance variables
    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView initCake) {
        this.cakeView = initCake;
        this.cakeModel = initCake.getCakeModel();
    }

    public void onClick(View view) {
        Log.d("cake", "click!");
        cakeModel.candleLit = false;
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        // Assign boolean with if button is checked
        cakeModel.candleCandles = compoundButton.isChecked();
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeModel.candleNum = i;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();

        cakeModel.balloonX = x;
        cakeModel.balloonY = y;

        cakeView.invalidate();
        cakeView.performClick();

        return cakeModel.touchBalloon = true;
    }
}
