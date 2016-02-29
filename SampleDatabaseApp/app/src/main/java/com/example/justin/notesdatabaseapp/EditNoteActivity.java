package com.example.justin.notesdatabaseapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageButton;

public class EditNoteActivity extends AppCompatActivity
{

    private EditText etTitle;
    private EditText etNote;
    private ImageButton buttonSave;
    private ImageButton buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);

        etTitle = (EditText) findViewById(R.id.et_title);
        etNote = (EditText) findViewById(R.id.et_note);
        buttonSave = (ImageButton) findViewById(R.id.button_save);
        buttonCancel = (ImageButton) findViewById(R.id.button_cancel);

    }

}
