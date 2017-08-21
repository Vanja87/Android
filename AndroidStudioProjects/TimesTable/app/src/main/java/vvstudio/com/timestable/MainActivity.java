package vvstudio.com.timestable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

import static vvstudio.com.timestable.R.id.myListView;

public class MainActivity extends AppCompatActivity {

    ListView myListView;

    public void generatedTimesTable(int timesTable) {

        ArrayList<String> timesTableContent = new ArrayList<String>();

        for (int i = 1; i <= 10; i++) {

            timesTableContent.add(Integer.toString(i * timesTable));


        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, timesTableContent);
        myListView.setAdapter(arrayAdapter);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar mySeekBar = (SeekBar) findViewById(R.id.mySeekBar);
        myListView = (ListView) findViewById(R.id.myListView);

        mySeekBar.setMax(20);
        mySeekBar.setProgress(10);

        mySeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                int min = 1;
                int timesTable;

                if (progress < min) {

                    timesTable = min;
                    mySeekBar.setProgress(min);

                } else {

                    timesTable = progress;

                }

                generatedTimesTable(timesTable);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        generatedTimesTable(10);


    }
}
