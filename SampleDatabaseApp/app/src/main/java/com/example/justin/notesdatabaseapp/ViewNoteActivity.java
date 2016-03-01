package com.example.justin.notesdatabaseapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ViewNoteActivity extends AppCompatActivity
{

    public final static int REQUEST_CODE_EDIT = 0;

    private EditText etTitle;
    private EditText etNote;
    private ImageButton buttonDelete;
    private ImageButton buttonSave;
    private ImageButton buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_note);

        etTitle = (EditText) findViewById(R.id.et_title);
        etNote = (EditText) findViewById(R.id.et_note);
        buttonDelete = (ImageButton) findViewById(R.id.button_delete);
        buttonSave = (ImageButton) findViewById(R.id.button_edit);
        buttonCancel = (ImageButton) findViewById(R.id.button_cancel);
    }

}
