package com.zzxhdzj.douban.api;

import android.content.Context;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

/**
 * Created with IntelliJ IDEA.
 * User: yangning.roy
 * Date: 12/11/13
 * Time: 10:54 AM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(RobolectricTestRunner.class)
public abstract class BaseAuthApiRequestTestCase {
    protected Context context = Robolectric.application.getApplicationContext();

}
