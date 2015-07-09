package com.ecellkgp.updates;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.SpannableString;
import android.widget.TextView;


public class SSP extends ActionBarActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssp);


        toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);


        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(new SpannableString("Startup Services Program"));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        }

        TextView tv = (TextView) findViewById(R.id.alum);
        tv.setText(Html.fromHtml("<h1 >About</h1><p>\n" +
                "\t\t\t\t\t\t<b>Startup Services Program</b> is an initiative by E-Cell, IIT Kharagpur. It aims to aid the fledgling start-ups of IIT Kharagpur in terms of providing them certain required business services. Starting-up can be a tricky business. It requires a great deal of effort, will, perseverance on the part of the founders along with plenty of resources. Most of the start-ups die out and shut down because of paucity of quality services required at the opportune time. Advice on legal, taxation, financial, technical aspects of running a startup, co-working space, HR needs etc. are just a few things which a startup requires post inception. A startup usually faces constant financial crunch in its early stages. To help them in their endeavours, this initiative has been launched wherein these start-ups are provided certain free/discounted services to reduce their financial burden. It is expected that this will encourage more and more students to take up the path of entrepreneurship and IIT Kharagpur will see an unprecedented rise in the number of entrepreneurs being produced in the institute. The benefits under this program are limited only to IIT Kharagpur student and alumni start-ups.\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</p>\n" +
                "\t\t\t\t\t    <h4>You are not eligible to avail discounts under this service if: </h4>\n" +
                "\t\t\t\t\t    <ol>\n" +
                "\t\t\t\t\t    \t<li> Your startup clocks an annual revenue of INR 1 crore or more.</li>\n" +
                "\t\t\t\t\t    \t<li>You have raised a total amount of INR 1 crore or more through VC/AI or \n" +
                "    any other kind of investments.</li>\n" +
                "    <li>\n" +
                "    \t Your startup has been registered for more than 3 years as on 1st \n" +
                "    May, 2014.\n" +
                "    </li>\n" +
                "\t\t\t\t\t    </ol>\n" +
                "\n" +
                "\t\t\t\t\t    <p>Have a look at the services which we are offering and if you are interested in availing any such service, refer to the Contact Us section. Based on the number of applicants for a particular startup service and the progress the startup has made, we will be providing assistance to the startups.\n" +
                "</p>"));


        SSPListAdapter sspad = new SSPListAdapter(this);
        NestedListView listview = (NestedListView) findViewById(R.id.list);
        listview.setAdapter(sspad);



        TextView tv2 = (TextView) findViewById(R.id.alum2);
        tv2.setText(Html.fromHtml("<h1>Contact</h1>\n" +
                "\t\t\t\t<p >Drop us a line at the below mentioned ids if you wish to know more about these services/avail them. You can also suggest us a service which is not listed here and which you feel might be helpful to startups. \n" +
                "</p>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<div >\n" +
                "\t\t\t\t<div >\n" +
                "\t\t\t\t\t<h3>\n" +
                "\t\t\t\t\t\tShovan Panigrahi\n" +
                "\t\t\t\t\t</h3>\n" +
                "                     <h4>shovan@ecell-iitkgp.org    </h4>\n" +
                "                     <h4>+91-7872683946    </h4>"));

    }




}
