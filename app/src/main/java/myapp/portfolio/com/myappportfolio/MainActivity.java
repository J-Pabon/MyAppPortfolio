package myapp.portfolio.com.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openApp(View view) {
        CharSequence text = "";

        switch  (view.getId()) {
            case R.id.btnStreamer:
                text = "This button will launch the Spotify Streamer App";
                break;

            case R.id.btnScores:
                text = "This button will launch the Scores App";
                break;

            case R.id.btnLibrary:
                text = "This button will launch the Library App";
                break;

            case R.id.btnBigger:
                text = "This button will launch the Built It Bigger App";
                break;

            case R.id.btnReader:
                text = "This button will launch the XYZ Reader App";
                break;

            case R.id.btnOwn:
                text = "This button will launch the Capstone: My Own App";
                break;
        }


        Toast.makeText(this.getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
