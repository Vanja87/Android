package vvstudio.com.curencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private double rezultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {

        EditText unosEditText = (EditText) findViewById(R.id.unosEditText);

        double finalValue = Double.parseDouble(unosEditText.getText().toString());
        this.rezultat = finalValue * 123.23;
        Toast.makeText(MainActivity.this, String.format("%.2f", rezultat) + " din.", Toast.LENGTH_SHORT).show();
    }
}
