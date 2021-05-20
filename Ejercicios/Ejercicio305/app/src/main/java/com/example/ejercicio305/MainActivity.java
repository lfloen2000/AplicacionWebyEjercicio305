package com.example.ejercicio305;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void web(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(i);
    }
    public void tel(View view){
        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:223456789"));
        startActivity(i);
    }
    public void maps(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("37.411213442325185, -4.477851423695635"));
        startActivity(i);
    }
    public void foto(View view){
        Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(i);
    }
    public void correo(View view){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT, "Android");
        i.putExtra(Intent.EXTRA_TEXT, "probando");
        i.putExtra(Intent.EXTRA_EMAIL, new String[] {"l.flores.encabo@iesmarquesdecomares.com" });
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
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