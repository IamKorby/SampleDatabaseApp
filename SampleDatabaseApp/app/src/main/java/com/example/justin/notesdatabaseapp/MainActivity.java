package com.example.justin.notesdatabaseapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
{

    RecyclerView lvNotes;
    ImageButton buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvNotes = (RecyclerView) findViewById(R.id.lv_notes);
        buttonAdd = (ImageButton) findViewById(R.id.button_add);

    }

}
