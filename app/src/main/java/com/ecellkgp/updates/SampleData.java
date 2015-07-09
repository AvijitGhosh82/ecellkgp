package com.ecellkgp.updates;

import com.sromku.simple.fb.SimpleFacebook;
import com.sromku.simple.fb.actions.Cursor;
import com.sromku.simple.fb.entities.Photo;
import com.sromku.simple.fb.listeners.OnPhotosListener;
import com.sromku.simple.fb.utils.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Avijit Ghosh on 30 Jun 2015.
 */
public class SampleData {

    public static final int SAMPLE_DATA_ITEM_COUNT = 30;
    public static boolean MORE;

    public static ArrayList<String> generateSampleData() {
        final ArrayList<String> data = new ArrayList<String>();


        String entityId="ecell.iitkgp";
        SimpleFacebook.getInstance().getPhotos(entityId, new OnPhotosListener() {

            @Override
            public void onThinking() {
                //dialog.show();
            }

            @Override
            public void onException(Throwable throwable) {
                // dialog.dismiss();
                //  mResult.setText(throwable.getMessage());
            }

            @Override
            public void onFail(String reason) {
                // dialog.dismiss();
                //mResult.setText(reason);
            }

            @Override
            public void onComplete(List<Photo> response) {
                //dialog.dismiss();
                // make the result more readable.
                //mAllPages += "<u>\u25B7\u25B7\u25B7 (paging) #" + getPageNum() + " \u25C1\u25C1\u25C1</u><br>";
                String mAllPages = Utils.join(response.iterator(), "<br>", new Utils.Process<Photo>() {
                    @Override
                    public String process(Photo photo) {
                        data.add(photo.getSource());
                        return "\u25CF " + photo.getSource() + " \u25CF";
                    }
                });

                //playerList.add(name);
                // mAllPages += "<br>";
                // mResult.setText(Html.fromHtml(mAllPages));


                // check if more pages exist
                if (hasNext()) {
                    enableLoadMore(getCursor());
                    MORE=true;
                } else {
                    MORE=false;
                    disableLoadMore();
                }
            }
        });

        return data;
    }


    private static void enableLoadMore(final Cursor<List<Photo>> cursor) {

                cursor.next();


    }

    private static void disableLoadMore() {

    }

}