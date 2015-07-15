package com.ecellkgp.updates;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.astuetz.PagerSlidingTabStrip;
import com.etsy.android.grid.StaggeredGridView;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.sromku.simple.fb.SimpleFacebook;
import com.sromku.simple.fb.actions.Cursor;
import com.sromku.simple.fb.entities.Photo;
import com.sromku.simple.fb.entities.Post;
import com.sromku.simple.fb.listeners.OnPhotosListener;
import com.sromku.simple.fb.listeners.OnPostsListener;
import com.sromku.simple.fb.utils.Utils;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Vector;


//import android.support.v7.internal.widget.AdapterViewCompat;


public class MainActivity extends ActionBarActivity {

    private Toolbar toolbar;
    private PagerAdapter mPagerAdapter;
    private ListView listView;
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private ListView drawerlistView;
    private MyDrawerAdapter adapter1;
    CallbackManager callbackManager;
    TextView lblMessage;
    private SimpleFacebook mSimpleFacebook;

    // Asyntask
    AsyncTask<Void, Void, Void> mRegisterTask;

    public static String name;
    public static String email;

    @Override
    protected void onResume() {
        super.onResume();
        mSimpleFacebook = SimpleFacebook.getInstance(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mSimpleFacebook.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FacebookSdk.sdkInitialize(getApplicationContext());

        mSimpleFacebook = SimpleFacebook.getInstance(this);

        // test local language
        //Utils.updateLanguage(getApplicationContext(), "en");
        //Utils.printHashKey(getApplicationContext());


        toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name, R.string.app_name);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        drawerlistView = (ListView) findViewById(R.id.list_view_drawer);

        // String[] items = { "Dashboard", "Mail", "Project", "Share", "Update sheet" ,"E attendance"};

        // ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
        //       android.R.layout.simple_list_item_1, items);

        adapter1 = new MyDrawerAdapter(this);


        drawerlistView.setAdapter(adapter1);

        drawerlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> av, View v, int position, long id) {
                //Get your item here with the position
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this , About.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(MainActivity.this ,Rmsoee.class);
                    startActivity(intent);
                }

                if (position == 2) {
                    Intent intent = new Intent(MainActivity.this ,SSP.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(MainActivity.this , RegisterActivity.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(MainActivity.this, Contact.class);
                    startActivity(intent);
                }

            }
        });

        SpannableString s = new SpannableString("Ecell IIT KGP");

        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(s);
        }

        this.initialisePaging();



    }


    private void initialisePaging() {

        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this, Fragment1.class.getName()));
        fragments.add(Fragment.instantiate(this, Fragment2.class.getName()));
        this.mPagerAdapter = new PagerAdapter(super.getSupportFragmentManager(), fragments);
        //
        ViewPager pager = (ViewPager) super.findViewById(R.id.viewpager);
        pager.setAdapter(this.mPagerAdapter);

        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        tabs.setViewPager(pager);
    }



    /*@Override
    public boolean onSearchRequested() {
        startSearch(null,false,null,false);
        return super.onSearchRequested();
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        //MenuInflater inflater = new MenuInflater(this);

       // inflater.inflate(R.menu.menu_main, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {


        }

        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(Gravity.START | Gravity.LEFT)) {
            mDrawerLayout.closeDrawers();
            return;
        }
        super.onBackPressed();
    }

    /*public static class Fragment1 extends Fragment {

        private FeatureCoverFlow mCoverFlow;
        private CoverFlowAdapter mAdapter;
        private ArrayList<GameEntity> mData = new ArrayList<>(0);
        private TextSwitcher mTitle;

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            
            


        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View v= inflater.inflate(R.layout.frag_2, container, false);
            mData.add(new GameEntity(R.drawable.image_1, R.string.title_1));
            mData.add(new GameEntity(R.drawable.image_2, R.string.title_2));
            mData.add(new GameEntity(R.drawable.image_3, R.string.title_3));
            mData.add(new GameEntity(R.drawable.image_4, R.string.title_4));
            mData.add(new GameEntity(R.drawable.image_5, R.string.title_5));


            mTitle = (TextSwitcher) v.findViewById(R.id.title);
            mTitle.setFactory(new ViewSwitcher.ViewFactory() {
                @Override
                public View makeView() {
                    LayoutInflater inflater = LayoutInflater.from(getActivity());
                    TextView textView = (TextView) inflater.inflate(R.layout.item_title, null);
                    return textView;
                }
            });
            Animation in = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_in_top);
            Animation out = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_out_bottom);
            mTitle.setInAnimation(in);
            mTitle.setOutAnimation(out);

            mAdapter = new CoverFlowAdapter(getActivity());
            mAdapter.setData(mData);
            mCoverFlow = (FeatureCoverFlow) v.findViewById(R.id.coverflow);
            mCoverFlow.setAdapter(mAdapter);

            mCoverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(getActivity(),
                            getResources().getString(mData.get(position).titleResId),
                            Toast.LENGTH_SHORT).show();
                }
            });

            mCoverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
                @Override
                public void onScrolledToPosition(int position) {
                    mTitle.setText(getResources().getString(mData.get(position).titleResId));
                }

                @Override
                public void onScrolling() {
                    mTitle.setText("");
                }
            });
            return v;
        }


    }*/

    public static class Fragment2 extends Fragment {

        private CallbackManager callbackManager;

        private final static String EXAMPLE = "Get posts";

        private TextView mResult;
        private Button mGetButton;
        private TextView mMore;
        private String mAllPages = "";
        private Button btnLoadMore;
        private ArrayAdapter<String> arrayAdapter;
        private StaggeredGridView lv;
        PhotoAdapter mAdapter = null;

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);


        }

        @Override
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            callbackManager.onActivityResult(requestCode, resultCode, data);
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View view= inflater.inflate(R.layout.frag_2, container, false);
            callbackManager = CallbackManager.Factory.create();

           /* LoginButton loginButton = (LoginButton) view.findViewById(R.id.login_button);
            loginButton.setReadPermissions("user_friends");
            // If using in a fragment
            loginButton.setFragment(this);
            // Other app specific specialization

            // Callback registration
            loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
                @Override
                public void onSuccess(LoginResult loginResult) {
                    // App code

                    GraphRequest request = GraphRequest.newMeRequest(
                            AccessToken.getCurrentAccessToken(),
                            new GraphRequest.GraphJSONObjectCallback() {
                                @Override
                                public void onCompleted(JSONObject jsonObject, GraphResponse response) {
                                    Log.d("ECELL", "onCompleted jsonObject: " + jsonObject);
                                    Log.d("ECELL", "onCompleted response: " + response);
                                    // Application code
                                }
                            });
                    Bundle parameters = new Bundle();
                    parameters.putString("fields", "id,name,link,cover,email");
                    request.setParameters(parameters);
                    request.executeAsync();

                    //Profile user;
                    //userPicture.setProfileId(user.getId());

                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        getActivity().recreate();
                    }

                }

                @Override
                public void onCancel() {
                    // App code
                }

                @Override
                public void onError(FacebookException exception) {
                    // App code
                }
            });*/

            lv = (StaggeredGridView) view.findViewById(R.id.grid_view);

            // Getting listview from xml
           // final ListView lv = (ListView) view.findViewById(R.id.list);
            final ArrayList<String> playerList = new ArrayList<String>();

// Creating a button - Load More

            btnLoadMore = new Button(getActivity());
            btnLoadMore.setText("Load More");

// Adding button to listview at footer




           // mResult = (TextView) view.findViewById(R.id.result);
            //mMore = (TextView) view.findViewById(R.id.load_more);
            //mMore.setPaintFlags(mMore.getPaint().getFlags() | Paint.UNDERLINE_TEXT_FLAG);
            /*mGetButton = (Button) view.findViewById(R.id.button);
            mGetButton.setText(EXAMPLE);
            mGetButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mAllPages = "";
                    mResult.setText(mAllPages);*/




            final ProgressDialog dialog = new ProgressDialog(getActivity());
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dialog.setMessage("Loading. Please wait...");
            dialog.setIndeterminate(true);
            dialog.setCanceledOnTouchOutside(false);

            //lv.setEmptyView(view.findViewById(R.id.emptyview));

            String entityId="137744623265";
            SimpleFacebook.getInstance().getPhotos(entityId, new OnPhotosListener() {

                @Override
                public void onThinking() {
                    dialog.show();
                }

                @Override
                public void onException(Throwable throwable) {
                    dialog.dismiss();
                    //mResult.setText(throwable.getMessage());
                }

                @Override
                public void onFail(String reason) {
                    dialog.dismiss();
                   // mResult.setText(reason);
                }

                @Override
                public void onComplete(List<Photo> response) {
                    dialog.dismiss();
                    // make the result more readable.
                    //mAllPages += "<u>\u25B7\u25B7\u25B7 (paging) #" + getPageNum() + " \u25C1\u25C1\u25C1</u><br>";
                    mAllPages += Utils.join(response.iterator(), "<br>", new Utils.Process<Photo>() {
                        @Override
                        public String process(Photo photo) {
                            playerList.add(photo.getSource());
                            return "\u25CF " + photo.getSource() + " \u25CF";
                        }
                    });

                    //playerList.add(name);
                    // mAllPages += "<br>";
                    // mResult.setText(Html.fromHtml(mAllPages));

                    /*arrayAdapter = new ArrayAdapter<String>(
                            getActivity(),
                            android.R.layout.simple_list_item_1,
                            playerList );

                    lv.setAdapter(arrayAdapter);*/

                    ArrayList<String> mData = null;
                    if (mData == null) {
                        mData = new ArrayList<String>(new LinkedHashSet<String>(playerList));
                        //mData = playerList;
                    }

                    if (mAdapter == null) {
                        mAdapter = new PhotoAdapter(getActivity(), R.id.textView1);
                    }

                    mData = new ArrayList<String>(new LinkedHashSet<String>(mData));

                    for (String data : mData) {
                        mAdapter.add(data);
                    }

                    lv.addFooterView(btnLoadMore);

                    lv.setAdapter(mAdapter);


                    // check if more pages exist
                    if (hasNext()) {
                        enableLoadMore(getCursor());
                    } else {
                        disableLoadMore();
                    }
                }
            });
            //}
            //});

            return view;
        }


        private void enableLoadMore(final Cursor<List<Photo>> cursor) {
            btnLoadMore.setVisibility(View.VISIBLE);
            btnLoadMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    mAllPages += "<br>";
                    cursor.next();
                    mAdapter.notifyDataSetChanged();
                }
            });
        }

        private void disableLoadMore() {
            btnLoadMore.setOnClickListener(null);
            btnLoadMore.setVisibility(View.INVISIBLE);
        }




    }



    public static class Fragment1 extends Fragment {

        private CallbackManager callbackManager;

        private final static String EXAMPLE = "Get posts";

        private TextView mResult;
        private Button mGetButton;
        private TextView mMore;
        private String mAllPages = "";
        private Button btnLoadMore;
        private ArrayAdapter<String> arrayAdapter;

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);


        }

        @Override
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            callbackManager.onActivityResult(requestCode, resultCode, data);
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View view= inflater.inflate(R.layout.frag_1, container, false);
            callbackManager = CallbackManager.Factory.create();

            LoginButton loginButton = (LoginButton) view.findViewById(R.id.login_button);
            loginButton.setReadPermissions("user_friends");
            // If using in a fragment
            loginButton.setFragment(this);
            // Other app specific specialization

            // Callback registration
            loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
                @Override
                public void onSuccess(LoginResult loginResult) {
                    // App code

                    GraphRequest request = GraphRequest.newMeRequest(
                            AccessToken.getCurrentAccessToken(),
                            new GraphRequest.GraphJSONObjectCallback() {
                                @Override
                                public void onCompleted(JSONObject jsonObject, GraphResponse response) {
                                    Log.d("ECELL", "onCompleted jsonObject: " + jsonObject);
                                    Log.d("ECELL", "onCompleted response: " + response);
                                    // Application code
                                }
                            });
                    Bundle parameters = new Bundle();
                    parameters.putString("fields", "id,name,link,cover,email");
                    request.setParameters(parameters);
                    request.executeAsync();

                    //Profile user;
                    //userPicture.setProfileId(user.getId());

                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        getActivity().recreate();
                    }
                }

                @Override
                public void onCancel() {
                    // App code
                }

                @Override
                public void onError(FacebookException exception) {
                    // App code
                }
            });


            // Getting listview from xml
            final ListView lv = (ListView) view.findViewById(R.id.list);
            final List<String> playerList = new ArrayList<String>();

// Creating a button - Load More

            btnLoadMore = new Button(getActivity());
            btnLoadMore.setText("Load More");

// Adding button to listview at footer




            mResult = (TextView) view.findViewById(R.id.result);
            //mMore = (TextView) view.findViewById(R.id.load_more);
            //mMore.setPaintFlags(mMore.getPaint().getFlags() | Paint.UNDERLINE_TEXT_FLAG);
            /*mGetButton = (Button) view.findViewById(R.id.button);
            mGetButton.setText(EXAMPLE);
            mGetButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mAllPages = "";
                    mResult.setText(mAllPages);*/




                    final ProgressDialog dialog = new ProgressDialog(getActivity());
                    dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                    dialog.setMessage("Loading. Please wait...");
                    dialog.setIndeterminate(true);
                    dialog.setCanceledOnTouchOutside(false);

                    lv.setEmptyView(view.findViewById(R.id.emptyview));


                    String entityId="ecell.iitkgp";
                    SimpleFacebook.getInstance().getPosts(entityId,new OnPostsListener() {

                        @Override
                        public void onThinking() {
                            dialog.show();
                        }

                        @Override
                        public void onException(Throwable throwable) {
                            dialog.dismiss();
                            mResult.setText(throwable.getMessage());
                        }

                        @Override
                        public void onFail(String reason) {
                            dialog.dismiss();
                            mResult.setText(reason);
                        }

                        @Override
                        public void onComplete(List<Post> response) {
                            dialog.dismiss();
                            // make the result more readable.
                            //mAllPages += "<u>\u25B7\u25B7\u25B7 (paging) #" + getPageNum() + " \u25C1\u25C1\u25C1</u><br>";
                            mAllPages += Utils.join(response.iterator(), "<br>", new Utils.Process<Post>() {
                                @Override
                                public String process(Post post) {
                                    playerList.add(post.getMessage());
                                    return "\u25CF " + post.getMessage() == null || "null".equalsIgnoreCase(post.getMessage()) ? post.getId() : post.getMessage() + " \u25CF";
                                }
                            });

                            //playerList.add(name);
                           // mAllPages += "<br>";
                           // mResult.setText(Html.fromHtml(mAllPages));

                            arrayAdapter = new TimeLineAdapter(getActivity(), (ArrayList<String>) playerList);

                            lv.setAdapter(arrayAdapter);

                            lv.addFooterView(btnLoadMore);

                            // check if more pages exist
                            if (hasNext()) {
                                enableLoadMore(getCursor());
                            } else {
                                disableLoadMore();
                            }
                        }
                    });
                //}
            //});

            return view;
        }


        private void enableLoadMore(final Cursor<List<Post>> cursor) {
            btnLoadMore.setVisibility(View.VISIBLE);
            btnLoadMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    mAllPages += "<br>";
                    cursor.next();
                    arrayAdapter.notifyDataSetChanged();
                }
            });
        }

        private void disableLoadMore() {
            btnLoadMore.setOnClickListener(null);
            btnLoadMore.setVisibility(View.INVISIBLE);
        }




    }


    class MyDrawerAdapter extends BaseAdapter {

        String[] options;
        String[] items = {"About us", "RMSOEE", "SSP", "EAD", "Empresario", "Announcements", "Contacts"};
        int[] images = {R.drawable.info, R.drawable.addr, R.drawable.quot, R.drawable.bt, R.drawable.pgn, R.drawable.announcement, R.drawable.contact};
        private Context context;


        MyDrawerAdapter(Context context) {
            this.context = context;
            options = items;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return options.length;
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return options[position];
        }

        @Override
        public long getItemId(int arg0) {
            // TODO Auto-generated method stub
            return arg0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            View row = null;


            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(R.layout.drawer_list_item, parent, false);
            } else {
                row = convertView;
            }
            TextView tv1 = (TextView) row.findViewById(R.id.text1);
            ImageView iv1 = (ImageView) row.findViewById(R.id.image1);
            RelativeLayout lLayout = (RelativeLayout) row.findViewById(R.id.parentLayout);

            tv1.setText(options[position]);
            iv1.setImageResource(images[position]);
            lLayout.setVisibility(View.VISIBLE);


            return row;
        }

    }
}



