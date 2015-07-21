package com.ecellkgp.updates;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Instances of this class are fragments representing a single
// object in our collection.
public class EmpresarioFragment extends Fragment {
    public static final String ARG_OBJECT = "object";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.
        View rootView = inflater.inflate(
                R.layout.empresario_item, container, false);
        Bundle args = getArguments();
        switch(args.getInt(ARG_OBJECT))
        {
            case 1:
                ((TextView) rootView.findViewById(R.id.city_name)).setText(Html.fromHtml("<strong>Empresario</strong> is the annual business model competition organized by <strong>Entrepreneurship Cell, IIT Kharagpur</strong> in association with <strong>International Business Model Competition (IBMC)</strong>.</p><p>Entrepreneurship Cell is searching for innovative and enterprising ideas through Empresario. Empresario 2015-2016 provides a platform for students to get excellent professional mentorship from our experienced, varied and distinguished mentor pool, and to showcase their ideas in front of Venture Capitalists, Angel Investors and Industry Leaders. If you want to turn your idea into an entrepreneurial venture, then this is the perfect stage for you!\n\n\n\n<h2>Why Business Model?</h2>\n\n\t\t\t\t\t\t\t<p>Over 85 percent of new businesses fail within the first few years.This Competition represents a radical departure from the past and the crest of a new paradigm in entrepreneurship.Unlike a business plan competition, participants won’t be rewarded for doing lots of library research, drawing fancy graphs, or crafting the perfect sales pitch to venture capitalists.</p>"));
                break;
            case 2:
                ((TextView) rootView.findViewById(R.id.city_name)).setText(Html.fromHtml("\n" +
                        "\t\t\t\t<section id=\"about\">\n" +
                        "\t\t\t\t\t<article class=\"blogpost shadow light-gray-bg bordered object-non-visible\" data-animation-effect=\"fadeInUpSmall\" data-effect-delay=\"100\">\n" +
                        "\t\t\t\t\t\t<li><h3>Know your Track:</h3></li>\n" +
                        "\t\t\t\t\t\t<ul>\n" +
                        "\t\t\t\t\t\t<li><b>Products & Services Track:</b></li>\n" +
                        "\t\t\t\t\t\t<p>A Business Model that is function oriented and is aimed at provising sustainability of both consumption and production. Ideas/Prototypes based on meeting diverse consumer requirements or providing an innovative service.</p>\n" +
                        "\n" +
                        "\n" +
                        "\t\t\t\t\t\t<li><b>Social Track:</b></li>\n" +
                        "\t\t\t\t\t\t<p>A Business Model that focuses on adding value to the people at the bottom of the pyramid and/or help building a greener tomorrow. Empresario's very own track for enterprises that have a positive social or environmental impact.</p>\n" +
                        "\t\t\t\t\t\t</ul>\n" +
                        "\t\t\t\t\t\t<!--\n" +
                        "\t\t\t\t\t\t<li><h3>Structure:</h3></li>\n" +
                        "\t\t\t\t\t\t\t<ol>\n" +
                        "\t\t\t\t\t\t\t\t<li><b>Online form submission:</b> The team needs to register on the Empresario website and authenticate their account using Code sent to the email-id specified. After that a team can log into their account and fill the form online.</li>\n" +
                        "\t\t\t\t\t\t\t\t<li><b>Early Bird:</b> Additional incentives include extended mentorship and a face-to-face mentoring session for shortlisted students</li>\n" +
                        "\t\t\t\t\t\t\t\t<li><b>Mentorship:</b> Mentoring will be provided to the shortlisted teams. The participants are required to make optimum utilization of the mentoring process so as to create an appropriately refined Business Model.</li>\n" +
                        "\t\t\t\t\t\t\t\t<li><b>Final Submission:</b> After Mentoring, the teams have to submit their final Business Model in a prescribed format. Visit this link to know <a href-\"http://ecell-iitkgp.org/empresario/bmodel.php\">\"How to prepare a submission\"</a></li>\n" +
                        "\t\t\t\t\t\t\t\t<li><b>Grand Finale:</b> The final shortlisted teams will present their final Business Model in front of the judging panel at IIT Kharagpur during the Global Entrepreneurship Summit 2016.</li>\n" +
                        "\t\t\t\t\t\t\t</ol>\n" +
                        "\t\t\t\t\t\t<div class=\"separator-2\"></div>\n" +
                        "\t\t\t\t\t\t<li><h3>Prizes:</h3></li>\n" +
                        "\t\t\t\t\t\t<ol><li>Winners & Runner-up of Products & Services Track</li>\n" +
                        "\t\t\t\t\t\t<li>Winners & Runner-up of Social Track</li>\n" +
                        "\t\t\t\t\t\t<li>Best Innovative Product (Product Design)</li>\n" +
                        "\t\t\t\t\t\t<li>Best IIT Kharagpur Entry</li></ol>\n" +
                        "\t\t\t\t\t-->\n" +
                        "\t\t\t\t\t\n" +
                        "\t\t\t\t\t<div class=\"separator-2\"></div>\n" +
                        "\t\t\t\t\t<li><h3>Structure:</h3></li>\n" +
                        "\t\t\t\t\t\t\t<ol>\n" +
                        "\t\t\t\t\t\t\t\t<li><b>Online form submission:</b> The team needs to register on the Empresario website and authenticate their account using Code sent to the email-id specified. After that a team can log into their account and fill the form online.</li>\n" +
                        "\t\t\t\t\t\t\t\t<li><b>Early Bird:</b> Additional incentives include extended mentorship and a face-to-face mentoring session for shortlisted students</li>\n" +
                        "\t\t\t\t\t\t\t\t<li><b>Mentorship:</b> Mentoring will be provided to the shortlisted teams. The participants are required to make optimum utilization of the mentoring process so as to create an appropriately refined Business Model.</li>\n" +
                        "\t\t\t\t\t\t\t\t<li><b>Final Submission:</b> After Mentoring, the teams have to submit their final Business Model in a prescribed format. Visit this link to know <a href=\"resources.php\">\"How to prepare a submission\"</a></li>\n" +
                        "\t\t\t\t\t\t\t\t<li><b>Grand Finale:</b> The final shortlisted teams will present their final Business Model in front of the judging panel at IIT Kharagpur during the Global Entrepreneurship Summit 2016.</li>\n" +
                        "\t\t\t\t\t\t\t</ol>\n" +
                        "\t\t\t\t\t\t<div class=\"separator-2\"></div>\n" +
                        "\t\t\t\t\t\t<li><h3>Prizes:</h3></li>\n" +
                        "\t\t\t\t\t\t<ol><li>Winners & Runner-up of Products & Services Track</li>\n" +
                        "\t\t\t\t\t\t<li>Winners & Runner-up of Social Track</li>\n" +
                        "\t\t\t\t\t\t<li>Best Innovative Product (Product Design)</li>\n" +
                        "\t\t\t\t\t\t<li>Best IIT Kharagpur Entry</li></ol>\n" +
                        "\t\t\t\t\t\n" +
                        "\t\t\t\t</article>\n" +
                        "\t\t\t</section>",null, new MyTagHandler()));
                break;
            case 3:
                ((TextView) rootView.findViewById(R.id.city_name)).setText(Html.fromHtml("<header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<h2><a>Prize Money</a></h2>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t</header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<div class=\"blogpost-content\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<p> Prizes worth over INR 15 Lakhs.</p><p>The Prizes include the Winners & Runner-up of Products & Services Track, Winners & Runner-up of Social Track, Best Innovative Product (Product Design), Best IIT Kharagpur Entry </p>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t</div>" +
                        "<header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<h2><a >Direct Entry to Semi-Finals of IBMC 2016</a></h2>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<div class=\"post-info\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
                        "\t\t\t\t\t\t\t\t\t\t</header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<div class=\"blogpost-content\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<p>One lucky team decided by the judges will get direct entry to the Semi-Finals of International Business Model Competition 2016.</p>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t</div>" +
                        "<header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<h2><a>Elevator Pitch</a></h2>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t</header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<div class=\"blogpost-content\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<p>Chance to pitch in front of leading angel investors, venture capitalists and industrialists from reputed firms.</p>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t</div>" +
                        "<header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<h2><a >Expert Mentoring</a></h2>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<div class=\"post-info\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
                        "\t\t\t\t\t\t\t\t\t\t</header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<div class=\"blogpost-content\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<p> In order to develop the idea and bring into reality, the semi-finalists are provided mentors (seasoned entrepreneurs and experienced industry professionals) from various sectors. </p><p>The finalists will continue the mentorship program for the final business model formation.</p>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t</div>" +
                        "<header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<h2><a >Networking</a></h2>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t</header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<div class=\"blogpost-content\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<p> Networking opportunities with potential partners, investors and world class entrepreneurs.</p>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t</div>" +
                        "<header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<h2><a >StartUp Services</a></h2>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<div class=\"post-info\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
                        "\t\t\t\t\t\t\t\t\t\t</header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<div class=\"blogpost-content\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<p>Advice on legal, taxation, financial, technical aspects of running a startup, co-working space, HR needs etc.</p>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t</div>" +
                        "<header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<h2><a >Incubation opportunities.</a></h2>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t</header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<div class=\"blogpost-content\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<p>Get opportunity to win the incubation amount to the tune of INR 2.5 crore.</p>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t</div>" +
                        "<header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<h2><a >Feedback</a></h2>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<div class=\"post-info\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
                        "\t\t\t\t\t\t\t\t\t\t</header>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<div class=\"blogpost-content\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<p>Content rich feedback on the business model from world class entrepreneurs,investors, and professional service providers on our judging panel.</p>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\n" +
                        "\t\t\t\t\t\t\t\t\t\t</div>",null, new MyTagHandler()));
                break;
            case 4:
                ((TextView) rootView.findViewById(R.id.city_name)).setText(Html.fromHtml("<div class=\"col-md-4\" style=\"color:#fff;\">\n" +
                        "\t\t\t\t\t\t\t\t<h4 style=\"color:#fff;\">Gaurav Choudhary </h4>\n" +
                        "\t\t\t\t\t\t\t\tSenior Manager, Competitions & Associations<br>\n" +
                        "\t\t\t\t\t\t\t\tgaurav@ecell-iitkgp.org<br>\n" +
                        "\t\t\t\t\t\t\t\t+91 839-1030-839\n" +
                        "\t\t\t\t\t\t\t</div>\n" +
                        "\t\t\t\t\t\t\t<div class=\"col-md-4\" style=\"color:#fff;\">\n" +
                        "\t\t\t\t\t\t\t\t<h4 style=\"color:#fff;\">Krishna Vadera </h4>\n" +
                        "\t\t\t\t\t\t\t\tSenior Manager, Competitions & Associations<br>\n" +
                        "\t\t\t\t\t\t\t\tkrishna@ecell-iitkgp.org<br>\n" +
                        "\t\t\t\t\t\t\t\t+91 9800-129-405\n" +
                        "\t\t\t\t\t\t\t</div>",null, new MyTagHandler()));
                break;

        }

        CardView card = (CardView) rootView.findViewById(R.id.card_view_list);
        card.setCardBackgroundColor(Color.parseColor("#292929"));
        return rootView;
    }
}
