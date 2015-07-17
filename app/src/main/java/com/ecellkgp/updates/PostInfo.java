package com.ecellkgp.updates;

import java.util.Date;

/**
 * Created by Avijit Ghosh on 17 Jul 2015.
 */
public class PostInfo {
    String url;
    Date date;

    PostInfo(String url, Date date)
    {
        this.url=url;
        this.date=date;
    }
    String getText()
    {
        return url;
    }
    Date getDate()
    {
        return date;
    }
}
