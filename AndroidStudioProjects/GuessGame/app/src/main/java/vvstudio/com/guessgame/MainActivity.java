package vvstudio.com.guessgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    int n;

    public  void makeToast(String string) {

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

        
    }

    public void guess(View view) {


        EditText enterNumberEditText2 = (EditText) findViewById(R.id.enterNumberEditText2);
        int guessNum = Integer.parseInt(enterNumberEditText2.getText().toString());


        if (guessNum > n) {
            makeToast("Lower!");
        } else if (guessNum < n) {
            makeToast("Higher!!");
        } else {
            makeToast("You guessed! Try again!");

            Random rand = new Random();
            n = rand.nextInt(20)+1;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        n = rand.nextInt(20)+ 1;
    }
}
