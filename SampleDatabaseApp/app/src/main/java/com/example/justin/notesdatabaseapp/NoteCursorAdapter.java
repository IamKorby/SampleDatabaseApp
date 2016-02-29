package com.example.justin.notesdatabaseapp;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Justin on 2/23/2016.
 */
public class NoteCursorAdapter extends CursorRecyclerViewAdapter<NoteCursorAdapter.NoteViewHolder>
{
    public NoteCursorAdapter(Context context, Cursor cursor)
    {
        super(context, cursor);
    }

    @Override
    public void onBindViewHolder(NoteViewHolder viewHolder, Cursor cursor)
    {
        String title = cursor.getString(cursor.getColumnIndex(Note.COLUMN_TITLE));

        viewHolder.tvTitle.setText(title);
    }

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, null);
        return new NoteViewHolder(v);
    }

    public class NoteViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvTitle;

        public NoteViewHolder(View itemView)
        {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
        }
    }
}
