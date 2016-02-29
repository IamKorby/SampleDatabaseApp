package com.example.justin.notesdatabaseapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

public class ViewNoteActivity extends AppCompatActivity
{

    public final static int REQUEST_CODE_EDIT = 0;

    private TextView tvTitle;
    private TextView tvNote;
    private ImageButton buttonEdit;
    private ImageButton buttonDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_note);

        tvTitle = (TextView) findViewById(R.id.tv_title);
        tvNote = (TextView) findViewById(R.id.tv_note);
        buttonEdit = (ImageButton) findViewById(R.id.button_edit);
        buttonDelete = (ImageButton) findViewById(R.id.button_delete);
    }

}
