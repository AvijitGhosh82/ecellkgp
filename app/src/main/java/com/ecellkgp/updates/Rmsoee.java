package com.ecellkgp.updates;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.SpannableString;
import android.widget.TextView;


public class Rmsoee extends ActionBarActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rmsoee);

        toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);


        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(new SpannableString("RMSOEE"));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        }

        TextView tv= (TextView)findViewById(R.id.alum);
        tv.setText(Html.fromHtml("<h2>Rajendra Mishra School of Engineering Entrepreneurship</h2>\n" +
                "            <p>Rajendra Mishra School of Engineering Entrepreneurship (RMSOEE) was established in the year 2010 to encourage entrepreneurial minds of the engineering students at IIT Kharagpur.</p>\n" +
                "            <p>\n" +
                "            \tIt is a revolutionary step forward by integrating the academic and practice aspects of entrepreneurship education. This is for the first time that a Higher Education Institution of technology has established such a kind of school in India where the output will be an entrepreneur and a potential world-class enterprise. In addition to establishing a core of academic resources in entrepreneurial management, the School leverages the academic engineering departments of the Institute, Vinod Gupta School of Management, Rajiv Gandhi School of Intellectual Property Law, School of Medical Sciences and Technology and the Science and Technology Entrepreneurs' Park (STEP). The RMSOEE is co-located with the STEP, and eventually as new infrastructural developments are completed.\n" +
                "            </p>\n" +
                "            <p>\n" +
                "            \tMoreover, the vibrant ecosystem of IIT Kharagpur is an amalgamation of several incubation and innovation funding programs from DST, DIT, MSME, DSIR, and W. Bengal Government into the broad umbrella of Technology Incubation and Entrepreneurship Training Society (TIETS), which helps these budding entrepreneurs in their initial stage of start-up. This ecosystem has already spun off over a dozen successful start-ups, and a whole lot more in the making.\n" +
                "            </p>\n" +
                "            <p>\n" +
                "            \tAlready several mentors are attached to the School, including an active association with TIE (The Indo-US Entrepreneurs); including an attractive entrepreneurship-in-residence (EIR) program for the RMSOEE students during semester breaks.\n" +
                "            </p>\n" +
                "            <p>\n" +
                "            \tThe unique Innovation Lab of the School provides all-inclusive environment for the students to think differently for their products and progress. Every student gets a cubicle to organize and setup his or her workspace. This flexibility makes the fertile mind of the young students more vibrant and energetic.\n" +
                "            </p>\n" +
                "            <h2>Why RMSoEE?</h2>\n" +
                "            <p>\n" +
                "            \tThe RMSOEE at Indian Institute of Technology, Kharagpur has been started to integrate the academic and practice in entrepreneurship. </p><p>Students who major in entrepreneurship will be exposed to the new venture creation process through which they gain an understanding of the skills, knowledge, and experience required to be a successful entrepreneur. The curriculum will be designed to give students an opportunity to develop their own creative skills while applying principles of management, marketing, and finance to the challenges of starting a new business, growing a business, or managing a family business.</p>\n" +
                "            <p>\n" +
                "            \t<b>After the attainment of the course the student will be eligible for </b>\n" +
                "            </p>\n" +
                "            <p>\n" +
                "            \t1.Developing the skills necessary to think and act entrepreneurially within large, established  organizations<br />\n" +
                "                2.Identifying new business opportunities<br />\n" +
                "                3.Finding finance for a new business<br />\n" +
                "                4.Managing a family business\n" +
                "            </p>\n" +
                "            <p>\n" +
                "            \t<b>The entrepreneurship major offers students challenging and exciting courses emphasizing the formal study of entrepreneurship.  The learning process includes</b>\n" +
                "            </p>\n" +
                "            <p>\n" +
                "            \t1.Understanding risk analysis and problem solving<br />\n" +
                "                2.The development of a new venture marketing plan<br />\n" +
                "                3.The strategic management of growth<br />\n" +
                "                4.The development of a business plan, and<br />\n" +
                "                5.The raising of capital for launch and growth\n" +
                "            </p>\n" +
                "            <p>\n" +
                "            \tIndian Institute of Technology, Kharagpur (IIT KGP) has developed a rich entrepreneurship ecosystem consisting of academic programs, action based training programs and incubation over several domains with students, alumni and faculty. There is also a vibrant student based entrepreneurship cell (E- Cell) which organizes a variety of awareness and mentoring programs. As the premier engineering institution in the country, we have launched an effort to integrate the practice and academic aspects of entrepreneurship in IIT KGP, through the creation of School of Entrepreneurship (SoE).\n" +
                "            </p>"));
    }

    
}
