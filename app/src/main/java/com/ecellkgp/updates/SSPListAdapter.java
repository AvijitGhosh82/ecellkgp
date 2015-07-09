package com.ecellkgp.updates;

/**
 * Created by Avijit Ghosh on 26 May 2015.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class SSPListAdapter extends BaseAdapter {

    private final Activity context;

    String[] itemname ={
            "Doodleblue",
            "Tax Mantra",
            "91springboard",
            "VDO",
            "Inc42",

    };

    String[] desc={"doodleblue is a boutique creative technology solution consulting firm. We create Beautiful Product Experiences for Startups and Leading Brands.Services offered:\n" +
            "\n" +
            "    Web Design Consultancy\n" +
            "    App Design Consultancy\n" +
            "    SEO, SEM, Social Media Profile Management and Analytics\n" +
            "    Website and App promotions\n" +
            "    Business Intelligence\n" +
            "    Visual Analytics\n" +
            "    Big Data Analysis and Reporting\n",
    "Services Offered:\n" +
            "\n" +
            "    Business Incorporation Service:\n" +
            "        Company registration\n" +
            "        LLP registration\n" +
            "        Local registration\n" +
            "    Business Maintenance Solutions:\n" +
            "        Maintenance of books of accounts\n" +
            "        Audit Compliances\n" +
            "        ROC Compliances\n" +
            "        Filing of ITR and TDS Compliances\n" +
            "        Secretarial Drafting\n" +
            "        Advance\u200B\u200B\u200B Tax Compliance\n" +
            "        Service Tax Compliance\n" +
            "        Payroll Processing\n",
    "91springboard is a startup growth hub which provides co-working space in Delhi and Gurgaon. They have created a collaborative environment where entrepreneurs can connect with each other, mentors, investors, and tap into the collective knowledge of the community. They usually have 4-8 startup meetups\u200B/\u200Bevents \u200Bevery\u200B month. \u200BTheir members include startups, developers, designers, consultants, NGOs, and more. \u200B\n" +
            "\u200BServices offered:\n" +
            "Co-working space in Delhi and Gurgaon",
    " VDo are the masters of story telling. They are a blend of creative and strategic folks crafting audio visuals for communication across broadcast, air and web. Services Offered:\n" +
            "\n" +
            "    \u200BThe PODIUM: Video solutions for corporate businesses\u200B\u200B\u200B. It includes: \u200B\n" +
            "        Marketing videos\n" +
            "        Subject expert videos\n" +
            "        Internal communication videos\n" +
            "    The CHIMES: Audio solutions for outbound marketing activities.These include Brand themes, Signature tunes and ad jingles.\u200B\n" +
            "    \u200BThe PRISM\u200B: This includes TV commercials and infomercials for businesses.\n" +
            "    \u200BThe MONTAGE: This includes:\n" +
            "        Content writing for websites, brochures\n" +
            "        Voice-over and subtitling\n" +
            "        Animation and Graphic design\n",
    "'Life is too short to work at a boring company. It's time to start-up!'\n" +
            "Following this, Inc42 is the Nation's top Startup Magazine that passionately promotes Entrepreneurial Ecosystem in India. It provides as a rostrum where entrepreneurs discuss and pervade their ideas, in an ardent community, and are presented with the most recent trends and solutions in the Entrepreneurial Realm.\n" +
            "\n" +
            "In addition, Inc42 also supports Startups and helps in their promotion through and through, and organizes events that scale from Promotion of Entrepreneurship to helping Entrepreneurs and Enterprises. "};

    String[] imguri={
"http://ecell-iitkgp.org/ssp/assets/doodleblue.jpg",
            "http://ecell-iitkgp.org/ssp/assets/taxmantra.jpg",
            "http://ecell-iitkgp.org/ssp/assets/91springboard.png",
            "http://ecell-iitkgp.org/ssp/assets/vdo.png",
            "http://ecell-iitkgp.org/ssp/assets/inc42.png"
    };

    public SSPListAdapter(Activity context) {
        // TODO Auto-generated constructor stub

        this.context=context;

    }

    @Override
    public int getCount() {
        return imguri.length;
    }

    @Override
    public Object getItem(int i) {
        return imguri[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemname[position]);
        //imageView.setImageResource(imgid[position]);
        Picasso.with(context).load(imguri[position]).into(imageView);
        extratxt.setText(desc[position]);
        return rowView;

    };
}