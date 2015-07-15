package com.ecellkgp.updates;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Instances of this class are fragments representing a single
// object in our collection.
public class DemoObjectFragment extends Fragment {
    public static final String ARG_OBJECT = "object";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.
        View rootView = inflater.inflate(
                R.layout.ead_city_item, container, false);
        Bundle args = getArguments();
        ((TextView) rootView.findViewById(R.id.city_name)).setText("EAD City "+
                Integer.toString(args.getInt(ARG_OBJECT)));
        CardView card = (CardView) rootView.findViewById(R.id.card_view_list);
        card.setCardBackgroundColor(Color.parseColor("#292929"));
        return rootView;
    }
}
