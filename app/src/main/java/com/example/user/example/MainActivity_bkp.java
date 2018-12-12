package com.example.user.example;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TableRow;


public class MainActivity_bkp extends AppCompatActivity {

    //
    Button addTable;
    Button addRow;
    TableLayout container_header;
    TableLayout container_row;
    View test;
    int seekProgress;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //
        addTable = (Button) findViewById(R.id.buttonAddTable);
        addRow = (Button) findViewById(R.id.buttonAddRow);
        container_header = (TableLayout)findViewById(R.id.mainTable);
        container_row = (TableLayout)findViewById(R.id.scrolledTable);
        SeekBar seek = (SeekBar) findViewById(R.id.seekBar);

        //
        addTable.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View addView = layoutInflater.inflate(R.layout.table, null);
                TableRow row = (TableRow) addView.findViewById(R.id.header);
                container_header.addView(addView);

                addTable.setEnabled(false);

                //addRow.setEnabled(true);
            }});

        //
        addRow.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                //final View addView = layoutInflater.inflate(R.layout.row, null);
                if (seekProgress==3) {
                    test = layoutInflater.inflate(R.layout.row3, null);
                }
                else  {
                    test = layoutInflater.inflate(R.layout.row, null);
                }
                TableRow row = (TableRow) test.findViewById(R.id.tablerow);
                container_row.addView(row);
            }});


        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int flag=0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekProgress = 0;
                if (progress==3) {

                    //setContentView(R.layout.activity_main_copy);
                    if (flag==0) {
                    LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    final View addView = layoutInflater.inflate(R.layout.table3, null);
                    TableRow row = (TableRow) addView.findViewById(R.id.header);
                    container_header.addView(addView);

                    flag=1;
                    seekProgress = 3;
                    }
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
