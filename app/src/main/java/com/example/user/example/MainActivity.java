package com.example.user.example;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;



public class MainActivity extends AppCompatActivity {

    //
    Button addTable;
    Button addRow;
    LinearLayout container;
    TableLayout container_row;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //
        addTable = (Button) findViewById(R.id.buttonAddTable);
        addRow = (Button) findViewById(R.id.buttonAddRow);
        container = (LinearLayout)findViewById(R.id.main);
        container_row = (TableLayout)findViewById(R.id.secondXML);

        //
        addTable.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View addView = layoutInflater.inflate(R.layout.table, null);
                TableLayout textOut = (TableLayout) addView.findViewById(R.id.secondXML);
                container.addView(addView);

                addTable.setEnabled(false);
                addRow.setEnabled(true);
            }});

        //
        addRow.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View addView2 = layoutInflater.inflate(R.layout.row, null);
                TableRow textOut2 = (TableRow)addView2.findViewById(R.id.thirdXML);
                container_row.addView(addView2);
            }});

    }
}
