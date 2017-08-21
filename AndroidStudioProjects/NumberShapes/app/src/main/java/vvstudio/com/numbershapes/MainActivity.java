package vvstudio.com.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

            class Numbers {

                int n;

                public boolean isSquare() {
                    double squareRoot = Math.sqrt(n);

                    if(squareRoot == Math.floor(squareRoot)) {

                        return true;

                    } else {

                        return false;

                    }
                }

                public boolean isTriangular() {

                    int x = 1;
                    int triangularNumber = 1;

                    while(triangularNumber<n) {

                        x++;
                        triangularNumber = triangularNumber + x;
                    }


                    if(triangularNumber == n) {
                        return true;
                    } else {
                        return false;
                    }


                }
            }



    public void testNumber(View view) {

        String message = "";

        EditText usersNumber = (EditText) findViewById(R.id.usersNumber);

        if (usersNumber.getText().toString().isEmpty()) {

            message = "Please enter a number!";
        } else {

            Numbers myNumber = new Numbers();

            myNumber.n = Integer.parseInt(usersNumber.getText().toString());

            if (myNumber.isSquare()) {

                if (myNumber.isTriangular()) {

                    message = myNumber.n + " is both triangular and square!";
                } else {

                    message = myNumber.n + " is square but not triangular!";
                }
            } else {

                if (myNumber.isTriangular()) {

                    message = myNumber.n + " is triangular but not square!";
                } else {

                    message = myNumber.n + " is neither square nor triangular!";
                }

            }
        }

            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();


        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
