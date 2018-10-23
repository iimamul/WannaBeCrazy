package com.example.nayeem.wannabecrazy;

import android.app.Activity;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by nAyeem on 03-Jun-15.
 */
public class BaseActivity extends Activity {

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {

            case R.id.crazy:
                Toast.makeText(getApplicationContext(), "crazy clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.crazier:
                Toast.makeText(getApplicationContext(), "crazier clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.craziest:
                Toast.makeText(getApplicationContext(), "craziest clicked", Toast.LENGTH_SHORT).show();
                break;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_mode) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
