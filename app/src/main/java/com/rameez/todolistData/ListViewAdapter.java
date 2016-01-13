package com.rameez.todolistData;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.rameez.todolist.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Rameez on 1/6/2016.
 */
public class ListViewAdapter extends ArrayAdapter<DataEntry> {

    public ListViewAdapter(Context context, List<DataEntry> items) {
        super(context, R.layout.fragment_dataentries);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.fragment_dataentries, parent, false);

            viewHolder = new ViewHolder();

            // text view id not showing up?
            viewHolder.name = (TextView) convertView.findViewById(R.id.itemName);
            viewHolder.description = (TextView) convertView.findViewById(R.id.description);
            viewHolder.dateAndTime = (TextView) convertView.findViewById(R.id.dateAndTime);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        DataEntry data = getItem(position);
        viewHolder.name.setText(data.getEntryName());
        viewHolder.dateAndTime.setText(data.getDateandTime());
        viewHolder.description.setText(data.getDescription());

        return convertView;




    }

    private static class ViewHolder {
        TextView name;
        TextView description;
        TextView dateAndTime;
    }
}
