package com.ecellkgp.updates;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.astuetz.PagerSlidingTabStrip;

import java.util.List;
import java.util.Vector;


public class About extends ActionBarActivity {

    private Toolbar toolbar;
    private PagerAdapter2 mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);



        toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);


        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(new SpannableString("About"));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        }

        this.initialisePaging();



    }



    private void initialisePaging() {

        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this, Involve.class.getName()));
        fragments.add(Fragment.instantiate(this, History.class.getName()));
        fragments.add(Fragment.instantiate(this, Portfolio.class.getName()));
        fragments.add(Fragment.instantiate(this, Peoplee.class.getName()));
        fragments.add(Fragment.instantiate(this, Alumni.class.getName()));
        this.mPagerAdapter = new PagerAdapter2(super.getSupportFragmentManager(), fragments);
        //
        ViewPager pager = (ViewPager) super.findViewById(R.id.viewpager2);
        pager.setAdapter(this.mPagerAdapter);

        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs2);
        tabs.setViewPager(pager);
    }


    public static class Involve extends Fragment {



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View v= inflater.inflate(R.layout.frag_involve, container, false);
            TextView tv= (TextView) v.findViewById(R.id.alum);
            tv.setText(Html.fromHtml("<h3>For Corporates</h3><p>E-Cell strives to bring about a paradigm shift. IITs need to produce the next wave of entrepreneurs who will take strides towards fulfilling visions of India in 2020, and we here at E-Cell look forward to providing the right ecosystem.</p>\n" +
                    "                <br>\n" +
                    "                <h4>I. Sponsorship for events</h4>\n" +
                    "                <p><strong>Global Entrepreneurship Summit</strong> is one of the biggest platforms in India, for academicians, new-age entrepreneurs, eminent business personalities and the students to gather and share their entrepreneurial endeavors and experiences and to pledge to take entrepreneurship in India to greater scales. More than 1000 students from various colleges in India, 2000 students from IIT Kharagpur and eminent personalities from across the entrepreneurial spectrum of India will gather in Kharagpur to discuss and find solutions to problems plaguing India.</p>\n" +
                    "                <p><strong>Entrepreneurship Awareness Drive</strong> is a massive nationwide initiative to promote entrepreneurship among today's youth. With a footfall of over 20,000, EAD is the largest entrepreneurship drive in India and has been commented upon by personalities such as Dr. Sashi Tharoor and Dr. D. Subba Rao, Governor, RBI.</p>\n" +
                    "                <p>We at E-Cell, preach only what we practice. Hence, we have stuck to our motto of \"Dare to be different\" when it comes to our sponsors too. The advantages we provide to our sponsors are very unique:</p>\n" +
                    "                <ol>\n" +
                    "                  <li><b>Branding</b> Apart from the conventional branding methods such as banners and posters, we offer certain innovative branding methods such as a presentation slot, video advertisement during the event and live blogging and tweeting.</li>\n" +
                    "                  <li><b>Corporate Social Responsibility</b> When associating with E-Cell, the money invested has a direct social impact, as most of the participants in our events look to start up on their own, and when they do so, they help in economic and hence, social development. Besides, entrepreneurship is one of the core development areas of Vision 2020.</li>\n" +
                    "                  <li><b>Employer Opportunities</b> The main audience in our events includes not only college students but also young professionals. This results in very good employer opportunities.</li>\n" +
                    "                </ol>\n" +
                    "                <br>\n" +
                    "                <h4>II. Mentoring and Support</h4>\n" +
                    "                <p>Entrepreneurship Cell is on the lookout for corporates who can mentor the Business Plan that qualify in our competitions and the scores of other startups that look to us for connecting them with the right mentors. They can act as angel investors or as help with the technical aspects. Either way, a good return on investment is to be expected as most of the startups incubated through us have gone on to win various awards and are flourishing in their respective industries.</p>\n\n<h3>For Alumni</h3><p>Over the course of the last half-century, IIT Kharagpur has created a huge talent pool of illustrious alumni, who have established themselves in various fields that they have entered. This resource pool is the greatest wealth that IIT can provide to its students. Entrepreneurship Cell, IIT Kharagpur calls upon the alumni to help the student startups from their alma mater, in converting their nascent ideas into profitable ventures. They may do so by involving themselves in our various alumni programmes.</p>\n" +
                    "                <br>\n" +
                    "                <h4>Why should you get involved?</h4>\n" +
                    "                <p>IIT Kharagpur continues to be the cradle of technology, innovation and entrepreneurship in India. Every year, this hot-spot continues to brew up many innovative new ideas, which have the potential of creating huge economic returns. Entrepreneurship Cell invites business ideas from students through its various Business Plan Competitions, and the Innovation Platform. Most of these plans, however, are received in a very crude form and need a lot of expert guidance and support before they can face the competitiveness of the business world. For this, we look up to the alumni, who have years of experience as students of the institute and hence, can act as the best mentors.</p>\n" +
                    "\n" +
                    "                <br>\n" +
                    "                <h4>How can you help?</h4>\n" +
                    "                <p>There are various ways in which you get involved.<br>\n" +
                    "                (a) Mentoring: The B-plans we receive as entries need to be mentored and improved upon, before they can be established as profitable companies. You can act on the advisory board of the company and help with problems pertaining to your area of expertise.<br>\n" +
                    "                (b) Angel Investing The most common problem faced by nascent startups is the lack of funds. Many potentially great ideas fizzle out each year due to the sheer lack of funds. You can act as an angel investor by providing seed capital to these startups. (Refer to Fund-a-KGPian initiative). You can otherwise provide token funding for projects under Innovation Platform.</p>\n\n<h3>For Colleges</h3><p>Entrepreneurship Cell is searching for innovative and enterprising ideas through its Business Plan competitions. Our competitions provide a platform for students to get excellent professional mentorship from our experienced, varied and distinguished mentor pool, and to showcase their ideas in front of Venture Capitalists, Angel Investors and Industry Leaders. Students with business ideas about product design, social entrepreneurship, clean technology or web 2.0 and mobile based applications should submit their first round entries before November 15th, 2010. Click <a href=\"#\">here</a> for more details.</p>\n" +
                    "\n" +
                    "                <p><b>Global Entrepreneurship Summit</b> (GES) 2011 (from 14th  to 16th January, 2011) is one of the biggest entrepreneurial platforms for academicians, new-age entrepreneurs, eminent business personalities, venture capitalists and students to gather at one place and share their entrepreneurial endeavours and experiences, and to pledge to take entrepreneurship to greater scales. Colleges sending their delegates to GES can also get great help in opening their own E-Cells.</p>\n" +
                    "\n" +
                    "                <p><b>Global Entrepreneurship Summit</b> also plays host to Startup Camp which would serve as a platform that connects the best startups of the country to students and VCs. Startup Camp would witness participation of 20 of the best Startups in the country who would showcase their product/services to students and VCs. These startups would provide college students a unique opportunity to work with them as a full time employee or as an intern. In addition, the participating startups would get a chance to pitch their ideas to prominent VCs of the country, thus giving an impetus to their venture. Other benefits will be finding appropriate partners and networking. It also serves as a platform of motivation and valuable learning for aspiring entrepreneurs.</p>\n" +
                    "\n" +
                    "                <p><strong>Entrepreneurship Awareness Drive</strong> (EAD) is an initiative by E-Cell which includes workshops, indigenously termed as Entrepreneurship Awareness Camp (EAC) in 15 cities during the month of October. Colleges can play a major role as the venue in the selected cities. This gives them a chance to associate with us.</p>\n\n<h3>For Startups</h3><p>Entrepreneurship Cell has many offerings for newly started ventures as well as those in the pipeline:</p>\n" +
                    "                <p>Start-up Fair</p>\n" +
                    "                <p>The key event of our Global Entrepreneurship Summit. Start-up camp is a platform for start-ups from across India to</p>\n" +
                    "                <ol>\n" +
                    "                  <li>interact</li>\n" +
                    "                  <li>find prospective mentors for technical as well as business related guidance</li>\n" +
                    "                  <li>pitch to our prestigious VC Panel</li>\n" +
                    "                  <li>hire fresh recruits and interns</li>\n" +
                    "                </ol>",null, new MyTagHandler()));




            return v;
        }


    }

    public static class History extends Fragment {


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View v= inflater.inflate(R.layout.frag_hist, container, false);

            TextView tv= (TextView) v.findViewById(R.id.alum);
            tv.setText(Html.fromHtml("<p><b>Entrepreneurship Cell</b> is a student body of IIT Kharagpur, formed in 2006 solely with the purpose of inspiring and guiding start-ups in IIT Kharagpur and to foster an entrepreneurial culture in the campus of IIT Kharagpur. We now play that role on a national scale and have won acclaim across the world.</p>\n" +
                    "                <br>\n" +
                    "                <h5>E-cell has two flagship events :</h5>\n" +
                    "                <ol>\n" +
                    "                  <li>Global Entrepreneurship Summit (GES): This is our flagship event, started from 2007 as \"Entrepreneurship Summit\" but renamed due to international participation in our competitions and collaboration with universities world-over.</li>\n" +
                    "                  <li>Entrepreneurship Awareness Drive (EAD): The first EAD was held 5 years ago in 2009 and was a unique event that traveled to 10 major cities in India in 10 days promoting entrepreneurship and creating awareness about opportunities for entrepreneurs.</li>\n" +
                    "                </ol>\n" +
                    "                <br>\n" +
                    "                <p>E-Cell today has more than 50 members from within IIT Kharagpur, and several more outreach members from various other colleges in the city.</p>",null, new MyTagHandler()));
            return v;
        }


    }

    public static class Portfolio extends Fragment {


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View v= inflater.inflate(R.layout.frag_port, container, false);

            TextView tv= (TextView) v.findViewById(R.id.alum);
            tv.setText(Html.fromHtml("<h3><strong><a href=\"http://www.canopusindia.com/index.php\">Canopus</a></strong></h3><p>The company produces a bio-fuel cell based product LOCUS (Localised Operation of Bio-Cells Using  Sewage) which is able to reduce chemical oxygen demand in sewage water by  about 60-80 per cent. Locus can along with  sewage treatment systems can also generate electricity. It has been selected in Top 20 Innovations by MIT Technology Review Magazine.</p><h3><strong style=\"color: #0CADBE;\">Code Green</strong></h3><p>The carbon capture CODE is designed to  remove CO2 directly from industrial utility/power plants and aims to  achieve an enhanced efficiency of 97% of CO2 extraction as compared to  78% in present day technology. It also improvises the H2S (hydrogen  sulphide) extractability to 92% compared to current extraction  efficiency of 60% in an extremely cost effective manner.</p><h3><strong style=\"color: #0CADBE;\">Micromed</strong></h3><p>MicroMed uses microfluidics technology for precise handling of liquid sample volumes as low as microlitre, in contrast to millilitres of sample required for analysis using traditional techniques. Automation of the whole process increases the efficiency, reduces cost and can be used in bio-diagnostic platforms.  The technology can be implemented in all wet tests and as it is cost- effective.</p><p><strong><br></strong></p><p><strong></strong></p><h3><strong style=\"color: #0CADBE;\">Srapt</strong></h3><p>Srapt is a smart and real-time platform that is location aware and  intelligent. The platform is in the development stage and it can be used  for much more then buying and selling things.</p><h3><strong><a href=\"http://azuresys.com/\">Azure Software Pvt. Limited</a></strong></h3><p>The company develops multifunctional packaged medical instruments for diagnosis. The company possesses expertise in Embedded Systems, Driver and firmware development. It has existing clients in USA,  Japan, Germany and India. Azure is a highly technical group that is working in a challenging cutting edge technology.</p><h3><strong><a href=\"http://www.minekey.com/\">Minekey</a></strong></h3><p>The company develops Versatile Internet Recommendation Systems. It possess News centered personalized contents aggregated across various News sources, Blogs, Podcasts, Pics, RSS/Atom feeds. The organization has developed Private and public communities / discussion groups based on News words and provides community recommendations based on users interests and friends. The organization also provides personalized commerce recommendations on books, movies, music, auctions etc., based on user profile.</p><h3><strong><a href=\"http://antceramics.com/\">Ants Ceramics (P) Limited</a></strong></h3><p>The organization develops unique ceramic processes to create abrasion-resistant components. It is developed by a team of IIT engineers who are guided by IIT and IIM Ahmedabad professors and is supported by reputed industrial and business consultants from ceramic industries in India and abroad. ANTS Ceramics aims to offer products of uncompromising quality and become a Global Player in the area of advanced ceramics by constantly evolving technologies and products through market driven research</p><h3><strong><a href=\"http://p2power.com/\">P2 Power Solutions (P) Limited</a></strong></h3><p>P2 Power creates products that enhance power quality, and thus reduce operating costs of industries. P2 products improve power efficiency and eliminate failures caused by compromised power quality. The first major breakthrough achieved by this company was when it installed three units of p2-STAT of 100 kVA each, at the printing presses of Dainik Jagran, the most renowned Hindi newspaper of India.</p><h3><a href=\"http://intinno.com/\">Intinno</a></h3><p>Intinno is an exciting new Web 2.0 start-up by four final year dual degree students of the Department of Computer Science and Engineering, IIT Kharagpur. Intinno was born with the mission of providing a platform which extends the classroom experience beyond the threshold of the classroom into the all pervasive internet. Intinno's business focuses on developing applications using Data Mining and Information Retrieval techniques to harness the power of the web.</p><h3 style=\"color: #0CADBE;\">Cynq Network</h3><p>The company works in the domain of social networking technology. It develops innovative software that cultivates new ways of interaction and communication among its customers, across the domains of corporate social networks as well as consumer-oriented vertical social networks. The specialized vertical social networks would be created for certain targeted domains like finance, healthcare, education and consumer forums.</p><h3 style=\"color: #0CADBE;\">Powersys Pvt. Ltd.</h3><p>Deployment of the national grid requires software based optimization for efficient performance. Derivative software will also be developed for dynamic power management with respect to grid constants. The company gets approval from TIETS based on the proposal to form a Pvt. Ltd. company on June 22, 2007.</p><h3><strong><a href=\"http://xaneda.com/index.html\">Xaneda Technolgies India Private Limited</a></strong></h3><p>Xaneda has a big business potential since it addresses a burning problem in a fast growing domain like Analog and Mixed-Signal IC design. At present Analog IC segment is growing at more than 10% per annum compared to the overall Semiconductor industry which is growing at a mere 3.2%. Analog IP market is growing much faster (around 39% p.a.). Moreover, Xanedas EDA product will enable a whole new business in Analog Mixed Signal Design Service area in India which is limited till date due to lack of man-power.&nbsp;</p><h3><strong style=\"color: #0CADBE;\" >Aero-Xtremes</strong></h3><p>The company is based onReconfigurable Autonomous Air vehicles. Prototype contains the autonomous reconfigurable air vehicle which can autonomously navigate a given terrain once fed with commands and is able to reconfigure the control in the case of failures to make it fly safe to complete the mission or return back home safely. The product boasts of being unique in reconfiguration feature in the world which will make it less accident prone which till now hinders their wide acceptance.</p><h3><strong><a href=\"http://www.ivizsecurity.com/\" target=\"_blank\">iViZ Techno Solutions Pvt. Ltd.</a></strong></h3><p>Penetration testing based internet Security Company, funded by Singapore and Canadian venture partners for $2 Million. The total sales in current quarter is 0.5 Crore. The company has been selected among Top 2 Security Startups in Asia and Top 6 in the world by London Business School, Homeland Security and Pentagon. Also it has been selected among world's top 8 innovative startups by Intel and UC Berkeley.</p><h3><strong><a href=\"http://www.dataresolve.com/index.html\" target=\"_blank\">Data Resolve Technologies Pvt. Ltd.</a></strong></h3><p>The Company has a product based on advanced data leakage prevention and detection technologies to stop Data Leakage in a corporate network. Being the only company having this technology in our country, it is expecting to capture a market estimated at 11 Billion USD for 2008-09. The company was founded by five IIT, Kharagpur graduates and is currently based at IIT, Kharagpur. Company has already been incubated by IIT, Kharagpur. In order to scale up its operation and R &amp; D the company is looking after first round of investment.<strong><br></strong></p><h3><strong style=\"color: #0CADBE;\">Accuflex Biolab</strong></h3><p>This company is based for setting up of the recombinant antibody based immunodiagnostic research and development. The prototype is based on the diagnostic tests on the emerging infectious diseases that keep pace with the rate of evolution and their timely detection.</p><h3><strong><a href=\"http://taragana.com/\" target=\"_blank\">Taragana&nbsp;</a></strong></h3><p>They&nbsp;develop products targeted towards rapidly growing Web 2.0 market. Taragana's application development services help you address evolving business and technology challenges by defining, architecting, designing and developing applications tailored to meet your unique business requirements. They&nbsp;deliver high-quality, flexible applications that are easy to maintain; modular to facilitate enhancements and are reliable, secure and easy to deploy.</p><h3><strong><a href=\"http://www.capillary.co.in/capillary/\" target=\"_blank\">Capillary Technologies</a></strong></h3><p>They are an IIT Kharagpur incubated company and will enable mobile phones help people better reach out to their clients.&nbsp;They provide fully mobile based card free loyalty programs for&nbsp;the retail partners, and enable them to help increase their sales, and improve customer relationships.&nbsp;Their products provide cost-effective, effective, means to engage with end consumers, get to know their taste, understand their buying behavior, and target effective communication so that they feel happy to come back to your stores.</p><p><strong><br></strong></p>",null, new MyTagHandler()));
            return v;
        }


    }

    public static class Peoplee extends Fragment {



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View v= inflater.inflate(R.layout.frag_ppl, container, false);

            TextView tv= (TextView) v.findViewById(R.id.alum);
            tv.setText(Html.fromHtml("<h3>Monitoring Committee</h3>\n" +
                    "                <br>\n" +
                    "                <ul>\n" +
                    "                  <li><b>Prof. Partha Pratim Das (Patron)</b><br>Head, Rajendra Mishra School of Engineering Entrepreneurship (RMSoEE)<br><br></li>\n" +
                    "                  \n" +
                    "                  <li><b>Prof. Pranab Kumar Dan (Chairperson)</b><br>Professor, Rajendra Mishra School of Engineering Entrepreneurship (RMSoEE)<br><br></li>\n" +
                    "                  <li><b>Prof. Basab Chakraborty (Vice-Chairperson)</b><br>Professor, Rajendra Mishra School of Engineering Entrepreneurship (RMSoEE)<br><br></li>\n" +
                    "                  <li><b>Prof. Indranil Sengupta (Member)</b><br>Managing Director, Science & Technology Entrepreneurs Park (STEP)<br><br></li>\n" +
                    "                  <li><b>Prof. Prabha Bhola (Member)</b><br>Professor, Rajendra Mishra School of Engineering Entrepreneurship (RMSoEE)<br><br></li>\n" +
                    "                </ul>\n" +
                    "                <br>\n" +
                    "                <h4>Student Advisors</h4>\n" +
                    "\n" +
                    "                <ul>\n" +
                    "                  <li><strong>Harshi Bansal</strong></li>\n" +
                    "                  <li><strong>Karandeep Singh Gujral</strong></li>\n" +
                    "                  <li><strong>Kaushik Kumar Mahato</strong></li>\n" +
                    "                  <li><strong>Milind Tahalani</strong></li>\n" +
                    "                  <li><strong>Nipun Khemka</strong></li>\n" +
                    "                  <li><strong>Nishant Koul</strong></li>\n" +
                    "                  <li><strong>Rajesh Ranjan</strong></li>\n" +
                    "                  <li><strong>Rakesh Krishna</strong></li>\n" +
                    "                </ul>\n" +
                    "\n" +
                    "                <h4>Student Co-Ordinators</h4>\n" +
                    "\n" +
                    "                <ul>\n" +
                    "                  <li><strong>Rajat Suman</strong></li>\n" +
                    "                  <li><strong>Akash Kyal</strong></li>\n" +
                    "                  <li><strong>Palak Jain</strong></li>\n" +
                    "                  <li><strong>Ramkrishna Agrawal</strong></li>\n" +
                    "                  <li><strong>Rupak Kumar Thakur</strong></li>\n" +
                    "                  <li><strong>Sanchita Bamnote</strong></li>\n" +
                    "                  <li><strong>Kunal Desai</strong></li>\n" +
                    "                  <li><strong>Kavya Vidiyalaya</strong></li>\n" +
                    "                  <li><strong>Shubham Bisht</strong></li>\n" +
                    "                  <li><strong>Jaitharan Vikram Kumar</strong></li>\n" +
                    "                </ul>\n" +
                    "\n" +
                    "                <h4>Senior Managers</h4>\n" +
                    "\n" +
                    "                <ul>\n" +
                    "                  <li><strong>Abhishek Agarwal</strong></li>\n" +
                    "                  <li><strong>Amrut Rajkarne</strong></li>\n" +
                    "                  <li><strong>Anuj Menta</strong></li>\n" +
                    "                  <li><strong>Anush Gupta</strong></li>\n" +
                    "                  <li><strong>Anurag</strong></span></li>\n" +
                    "                  <li><strong>Chandan Routray</strong></li>\n" +
                    "                  <li><strong>Devanshu Mathur</strong></li>\n" +
                    "                  <!-- <li><strong>Gopi Arivalagan</strong></li> -->\n" +
                    "                  <li><strong>Himanshu Agarwal</strong></li>\n" +
                    "                  <li><strong>Prashant Kush</strong></li>\n" +
                    "                  <li><strong>Rahul Penti</strong></li>\n" +
                    "                  <!-- <li><strong>Sabyasachi Mishra</strong></li>-->\n" +
                    "                  <li><strong>Sharmila Appini</strong></li>\n" +
                    "                  <li><strong>Srivardhan Reddy</strong></li>\n" +
                    "                 <!--  <li><strong>Suraj Srivastava</strong></li>\n" +
                    "                 <li><strong>Tejaswini Venkatesh</strong></li> -->\n" +
                    "                </ul>",null, new MyTagHandler()));

            return v;        }


    }

    public static class Alumni extends Fragment {



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View v= inflater.inflate(R.layout.frag_alum, container, false);

            TextView tv= (TextView) v.findViewById(R.id.alum);
            tv.setText(Html.fromHtml("<p>Here are our distinguished alumni who were influential in establishing Entrepreneurship Cell, IIT Kharagpur and took it to greater heights. They not only were instrumental in organising the first Entrepreneurship Summit in 2006 but also took the initiative of starting the Deferred Placement Programme (DPP) in IIT Kharagpur. IIT Kharagpur is the only college in India to have DPP after IIM Ahmedabad.</p><p>Meet some of our past members who were the life and soul of E-cell:</p><p>&nbsp;</p><p><a title=\"Dawn Thomas|linkedIn\" href=\"http://www.linkedin.com/profile/view?id=9094397&amp;authType=NAME_SEARCH&amp;authToken=NJvi&amp;locale=en_US&amp;srchid=5191f53e-bd0c-4b5e-b8fa-10494c836de7-0&amp;srchindex=1&amp;srchtotal=777&amp;pvs=ps&amp;goback=.fps_dawn+thomas_*1_*1_*1_*1_*1_*1_*51_*1_Y_*1_*1_*1_false_1_R_true_G%2CN%2CI%2CCC%2CPC%2CED%2CL%2CFG%2CTE%2CFA%2CSE%2CP%2CCS%2CF%2CDR_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2\"><strong>Dawn Thomas</strong></a></p><p>Dawn was the founding convener of Entrepreneurship Cell at Kharagpur.  After 5 years of anchoritic IIT Kharagpur and a short sabbatical, Dawn, a  graduate of architecture, ended up in IIM Bangalore, where he is the secretary of the  entrepreneurship cell. Besides entrepreneurship, he is interested in Rock climbing, Physics, Violin and Theatre. His current short term  plans include wrapping up \"Great Books of Western World\" over the next 10 years and free soloing a 5.12 grade climb.</p><p>&nbsp;</p><p><a title=\"Alok Kothari|linkedIn\" href=\"http://www.linkedin.com/profile/view?id=16743642&amp;authType=NAME_SEARCH&amp;authToken=K_Ir&amp;locale=en_US&amp;srchid=9c763dad-8c6b-432a-b3aa-b4ca4b0b119b-0&amp;srchindex=1&amp;srchtotal=19&amp;pvs=ps&amp;goback=.fps_alok+kothari_*1_*1_*1_*1_*1_*1_*51_*1_Y_*1_*1_*1_false_1_R_true_G%2CN%2CI%2CCC%2CPC%2CED%2CL%2CFG%2CTE%2CFA%2CSE%2CP%2CCS%2CF%2CDR_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2\"><strong>Alok Kothari</strong></a></p>He was one of the founding members of E-Cell.&nbsp; A graduate of Mathematics and Computing , he is now a derivative trader at Futures First Info Services Pvt Ltd.</p><p>&nbsp;</p><p><a title=\"Lokesh Anand|linkedIn\" href=\"http://www.linkedin.com/profile/view?id=20833321&amp;authType=NAME_SEARCH&amp;authToken=W7WX&amp;locale=en_US&amp;srchid=8620458e-05f9-4a16-abfb-529e5ebda108-0&amp;srchindex=1&amp;srchtotal=24&amp;pvs=ps&amp;goback=.fps_lokesh+anand_*1_*1_*1_*1_*1_*1_*51_*1_Y_*1_*1_*1_false_1_R_true_G%2CN%2CI%2CCC%2CPC%2CED%2CL%2CFG%2CTE%2CFA%2CSE%2CP%2CCS%2CF%2CDR_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2\"><strong>Lokesh Anand</strong></a></p><p>He was also one of the founding members of E-Cell. He is a graduate from Electrical Engineering Department of the 2009 batch. He is now at Procter &amp; Gamble.</p><p>&nbsp;</p><p><strong style=\"color: #0CADBE;\">Mayur Rustagi</strong></p><p>Mayur Rustagi, one of the founding members of Entrepreneurship Cell, graduated in 2009 from Department of Computer Science &amp; Engineering is currently working in Adobe Systems.</p><p>&nbsp;</p><p><strong><a title=\"Subhendu Panigrahi|linkedIn\" href=\"http://www.linkedin.com/profile/view?id=19479208&amp;authType=name&amp;authToken=haGq\">Subhendu Panigrahi</a><br /><br /></strong>He graduated in 2010 from the Agricultural &amp; Food Engineering. He has taken the Deferred Placement Programme (DPP) and is working on his own start-up.</p><p>&nbsp;</p><p><a title=\"Anuj Gupta|linkedIn\" href=\"http://www.linkedin.com/profile/view?id=49699269&amp;authType=name&amp;authToken=vVWa\"><strong>Anuj Gupta</strong></a></p><p>He graduated <strong>&nbsp;</strong>in 2010 from the Department of Chemistry. He has taken the DPP and is the Co-Founder of Orgone Energy Pvt. Ltd. and Founder &amp; Managing Director at Lalaland.</p><p>&nbsp;</p><p><a title=\"Rashmit Ritam Das|linkedIn\" href=\"http://www.linkedin.com/profile/view?id=36028314&amp;authType=NAME_SEARCH&amp;authToken=e_Uw&amp;locale=en_US&amp;srchid=360a1326-c443-48d8-b395-1813684793e7-0&amp;srchindex=1&amp;srchtotal=1&amp;pvs=ps&amp;goback=.fps_rashmit+das_*1_*1_*1_*1_*1_*1_*51_*1_Y_*1_*1_*1_false_1_R_true_CC%2CN%2CI%2CG%2CPC%2CED%2CL%2CFG%2CTE%2CFA%2CSE%2CP%2CCS%2CF%2CDR_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2\"><strong>Rashmit Ritam Das</strong></a></p><p><br />He graduated in 2010 from the Department of Mathematics. He is currently working as Business Technology Analyst at Delloitte Consulting.</p><p>&nbsp;</p><p><a title=\"Asit Parija|linkedIn\" href=\"http://www.linkedin.com/profile/view?id=68628927&amp;authType=NAME_SEARCH&amp;authToken=K6s1&amp;locale=en_US&amp;srchid=6d61e5bb-e191-4af3-91b3-cfcc9c37e8ed-0&amp;srchindex=1&amp;srchtotal=3&amp;pvs=ps&amp;goback=.fps_asit+parija_*1_*1_*1_*1_*1_*1_*51_*1_Y_*1_*1_*1_false_1_R_true_CC%2CN%2CG%2CI%2CPC%2CED%2CL%2CFG%2CTE%2CFA%2CSE%2CP%2CCS%2CF%2CDR_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2\"><strong>Asit Parija</strong></a></p><p>He graduated in 2010 from the Department of Computer Science &amp; Engineering. He is currently placed at JP Morgan.</p><p>&nbsp;</p><p><a title=\"Vikram Bahure|linkedIn\" href=\"http://www.linkedin.com/profile/view?id=7403965&amp;authType=NAME_SEARCH&amp;authToken=ceNh&amp;locale=en_US&amp;srchid=74470e5b-c94e-4636-ac94-327065f44e6f-0&amp;srchindex=1&amp;srchtotal=1&amp;pvs=ps&amp;goback=.fps_vikram+bahure_*1_*1_*1_*1_*1_*1_*51_*1_Y_*1_*1_*1_false_1_R_true_CC%2CN%2CI%2CG%2CPC%2CED%2CL%2CFG%2CTE%2CFA%2CSE%2CP%2CCS%2CF%2CDR_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2\"><strong>Vikram Bahure</strong></a></p><p>He graduated in 2010 from the Department of Humanities &amp; Social Sciences. He is currently pursuing MBA from NCR, Singapore.</p><p>&nbsp;</p><p><a title=\"Mayank Yadav|linkedIn\" href=\"http://www.linkedin.com/profile/view?id=31214342&amp;authType=NAME_SEARCH&amp;authToken=7JPg&amp;locale=en_US&amp;srchid=75e6d767-5e7e-48db-89d5-badf46abdeb1-0&amp;srchindex=1&amp;srchtotal=39&amp;pvs=ps&amp;goback=.fps_mayank+yadav_*1_*1_*1_*1_*1_*1_*51_*1_Y_*1_*1_*1_false_1_R_true_G%2CN%2CI%2CCC%2CPC%2CED%2CL%2CFG%2CTE%2CFA%2CSE%2CP%2CCS%2CF%2CDR_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2\"><strong>Mayank Yadav</strong></a><br /><br />He graduated in 2010 from the Department of Agricultural &amp; Food Engineering, currently working as Management Trainee at Amazan Agro Products Ltd.</p><p>&nbsp;</p><p><a title=\"Anirban Pal|linkedIn\" href=\"http://in.linkedin.com/pub/anirban-pal/9/423/b52&amp;authType=NAME_SEARCH&amp;authToken=7JPg&amp;locale=en_US&amp;srchid=75e6d767-5e7e-48db-89d5-badf46abdeb1-0&amp;srchindex=1&amp;srchtotal=39&amp;pvs=ps&amp;goback=.fps_mayank+yadav_*1_*1_*1_*1_*1_*1_*51_*1_Y_*1_*1_*1_false_1_R_true_G%2CN%2CI%2CCC%2CPC%2CED%2CL%2CFG%2CTE%2CFA%2CSE%2CP%2CCS%2CF%2CDR_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2_*2\"><strong>Anirban Pal</strong></a><br /><br />Graduated in 2010 as a B.Tech. in Mechanical Engineering, Anirban is currently working as a research consultant at IIT Kharagpur.</p><p>&nbsp;</p><p><a title=\"Sankalan Prasad|Linkedin\" href=\"http://in.linkedin.com/pub/sankalan-prasad/5/459/376\"><strong>Sankalan Prasad</strong></a></p><p>He graduated in 2011 from the Department of Electronics &amp; Electrical Communication Engineering. He worked as Component Design Engineer at Intel for 2 years before joining IIM Bangalore.</p><p>&nbsp;</p><p><a title=\"Madhu Yalamarthi|Linkedin\" href=\"http://www.linkedin.com/in/madhuyalamarthi\"><strong>Madhu Yalamarthi</strong></a></p><p>He graduated in 2012 from the Department of Aerospace Engineering. He is currently working as an associate consultant at Dalberg Global Development Advisors.</p>",null, new MyTagHandler()));
            return v;        }


    }


}
