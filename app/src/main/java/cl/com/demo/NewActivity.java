package cl.com.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


/**
 * Created by admin on 2018-9-10.
 */

public class NewActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("TAG","修改");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
