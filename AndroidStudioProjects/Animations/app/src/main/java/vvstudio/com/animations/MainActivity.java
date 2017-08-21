package vvstudio.com.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void crossfade(View view) {

        ImageView bart = (ImageView) findViewById(R.id.bart);
       // ImageView homer = (ImageView) findViewById(R.id.homer);

        bart.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotation(1800f)
                .setDuration(2000);
       // homer.animate().alpha(1f).setDuration(2000);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView bart = (ImageView) findViewById(R.id.bart);

        bart.setTranslationX(-1000f);
        bart.setTranslationY(-1000f);
    }
}
