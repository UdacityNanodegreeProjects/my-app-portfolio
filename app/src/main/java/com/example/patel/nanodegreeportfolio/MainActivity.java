package com.example.patel.nanodegreeportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Context context;
    CharSequence text;
    int duration = Toast.LENGTH_SHORT;

    /* TODO:
     * Add shadow to the buttons.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
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

    /** Called when the user touches the Spotify Streamer button */
    public void displayStreamerToast(View view) {
        text = "This button will launch my Spotify Streamer App!";
        showToastMessage(text);
    }

    /** Called when the user touches the Football Scores App button */
    public void displayFootballToast(View view) {
        text = "This button will launch my Football Scores App!";
        showToastMessage(text);
    }

    /** Called when the user touches the Library App button */
    public void displayLibraryToast(View view) {
        text = "This button will launch my Library App!";
        showToastMessage(text);
    }

    /** Called when the user touches the Build It Bigger button */
    public void displayBIBToast(View view) {
        text = "This button will launch my Build It Bigger App!";
        showToastMessage(text);
    }

    /** Called when the user touches the XYZ Reader button */
    public void displayReaderToast(View view) {
        text = "This button will launch my XYZ Reader App!";
        showToastMessage(text);
    }

    /** Called when the user touches the Capstone  button */
    public void displayCapstoneToast(View view) {
//        int int1 = view.getId();
//        String srt;
//        srt = getString(int1);
//        System.out.println("id  " + view.getId()); //2131492949
        text = "This button will launch my Capstone App!";
        showToastMessage(text);
    }

    //Show the toast message.
    public void showToastMessage(CharSequence message) {
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

}
