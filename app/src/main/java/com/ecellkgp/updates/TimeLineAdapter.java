package com.ecellkgp.updates;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Avijit Ghosh on 14 Jul 2015.
 */
public class TimeLineAdapter extends ArrayAdapter<PostInfo> {
    public TimeLineAdapter(Context context, ArrayList<PostInfo> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        String user = getItem(position).getText();
        Date date=getItem(position).getDate();
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.single_row_item, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tv_person_name);
        //TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);
        // Populate the data into the template view using the data object
        tvName.setText(user);

        TextView tv2 = (TextView) convertView.findViewById(R.id.tv_person_pin);
        SimpleDateFormat df = new SimpleDateFormat("MMMM d, yyyy 'at' h:mm a");
        //SimpleDateFormat df = new SimpleDateFormat("MMMM d, yyyy");
        tv2.setText(df.format(getItem(position).getDate()));


        CardView card = (CardView) convertView.findViewById(R.id.card_view_list);
        card.setCardBackgroundColor(Color.parseColor("#292929"));
        //tvHome.setText(user.hometown);
        // Return the completed view to render on screen
        return convertView;
    }
}
