package com.manuelleung.myfitlist;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by manuel on 10/21/2015.
 *
 * Inflates a universal action bar across activities
 *
 */
public class BaseActivity extends AppCompatActivity {

    private final String TAG = "Base Activity";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {
            case R.id.action_settings:
                Log.i(TAG, "Action Settings clicked");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
