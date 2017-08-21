package vvstudio.com.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000) {

            public void onTick(long milisecondsUntilDone) {

                //countown is counting down every second
                Log.i("Seconds left", String.valueOf(milisecondsUntilDone / 1000));
            }

            public  void onFinish() {

                //counter is finished. after 10 seconds

                Log.i("Done!", "Countdown timer finished!");
            }
        }.start();
        }
    }
/*
        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {

                // Insert code to run every second

                Log.i("Runnable has run!", "a second must have been past...");

                handler.postDelayed(this, 1000);
            }
        };

        handler.post(run);
    }
}*/
