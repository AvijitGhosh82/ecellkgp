package com.ecellkgp.updates;

import java.util.Date;

/**
 * Created by Avijit Ghosh on 17 Jul 2015.
 */
public class PhotoInfo {
    String url;
    Date date;

    PhotoInfo(String url, Date date)
    {
        this.url=url;
        this.date=date;
    }
    String getUrl()
    {
        return url;
    }
    Date getDate()
    {
        return date;
    }
}
