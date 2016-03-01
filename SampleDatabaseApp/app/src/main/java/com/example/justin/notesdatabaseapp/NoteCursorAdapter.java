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
    private OnItemClickListener mOnItemClickListener;

    public void setmOnItemClickListener(OnItemClickListener m)
    {
        this.mOnItemClickListener = m;
    }

    public interface OnItemClickListener
    {
        public void onItemClick(int id);
    }

    public NoteCursorAdapter(Context context, Cursor cursor)
    {
        super(context, cursor);
    }

    @Override
    public void onBindViewHolder(NoteViewHolder viewHolder, Cursor cursor)
    {
        String title = cursor.getString(cursor.getColumnIndex(Note.COLUMN_TITLE));

        viewHolder.tvTitle.setText(title);
        viewHolder.container.setTag(cursor.getInt(cursor.getColumnIndex(Note.COLUMN_ID)));
        viewHolder.container.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // call on item click here
                int dbid = Integer.parseInt(v.getTag().toString());
                mOnItemClickListener.onItemClick(dbid);
            }
        });
    }

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false);
        return new NoteViewHolder(v);
    }

    public class NoteViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvTitle;
        View container;

        public NoteViewHolder(View itemView)
        {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            container = itemView.findViewById(R.id.container);
        }
    }
}

// SET UP LISTENER
// 1. Create interface
// 2. Create Local variable of interface
// 3. Create a setter for variable
// implement call
// implement callback