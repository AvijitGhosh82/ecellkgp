package com.ecellkgp.updates;

import android.content.Context;
import android.content.Intent;
import android.support.v7.graphics.Palette;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.etsy.android.grid.util.DynamicHeightImageView;
import com.github.florent37.picassopalette.PicassoPalette;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Random;

public class PhotoAdapter extends ArrayAdapter<PhotoInfo> {

    private static final String TAG = "SampleAdapter";

    private final LayoutInflater mLayoutInflater;
    private final Random mRandom;
    private static final SparseArray<Double> sPositionHeightRatios = new SparseArray<Double>();
    private final Context context1;
    private Palette palette;

    public PhotoAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
        this.mLayoutInflater = LayoutInflater.from(context);
        this.mRandom = new Random();
        context1=context;
    }

    @Override
    public View getView(final int position, View convertView,
                        final ViewGroup parent) {

        final ViewHolder vh;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.photoitem,
                    parent, false);
            vh = new ViewHolder();
            vh.imgView = (DynamicHeightImageView) convertView
                    .findViewById(R.id.imgView);

            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        double positionHeight = getPositionRatio(position);

        vh.imgView.setHeightRatio(positionHeight);
        //Picasso.with(context1).load(getItem(position)).into(vh.imgView);

        TextView tv=(TextView)convertView.findViewById(R.id.date);
        //SimpleDateFormat df = new SimpleDateFormat("MMMM d, yyyy 'at' h:mm a");
        SimpleDateFormat df = new SimpleDateFormat("MMMM d, yyyy");
        tv.setText(df.format(getItem(position).getDate()));

        Picasso.with(context1).load(getItem(position).getUrl()).into(vh.imgView,
                PicassoPalette.with(getItem(position).getUrl(), vh.imgView)
                        .use(PicassoPalette.Profile.MUTED)
                        .intoBackground(tv, PicassoPalette.Swatch.RGB)
                        .intoTextColor(tv, PicassoPalette.Swatch.BODY_TEXT_COLOR)
        );


        vh.imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(context1, Photoview.class);
                String strName = getItem(position).getUrl();
                i.putExtra("photouri", strName);
                context1.startActivity(i);
            }
        });



        return convertView;
    }

    static class ViewHolder {
        DynamicHeightImageView imgView;
    }

    private double getPositionRatio(final int position) {
        double ratio = sPositionHeightRatios.get(position, 0.0);
        // if not yet done generate and stash the columns height
        // in our real world scenario this will be determined by
        // some match based on the known height and width of the image
        // and maybe a helpful way to get the column height!
        if (ratio == 0) {
            ratio = getRandomHeightRatio();
            sPositionHeightRatios.append(position, ratio);
            Log.d(TAG, "getPositionRatio:" + position + " ratio:" + ratio);
        }
        return ratio;
    }

    private double getRandomHeightRatio() {
        return (mRandom.nextDouble() / 2.0) + 1.0; // height will be 1.0 - 1.5
        // the width
    }
}
