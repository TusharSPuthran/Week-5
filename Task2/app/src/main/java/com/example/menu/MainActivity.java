package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menuoptions,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        int id = item.getItemId();
        if (id == R.id.search)
        {
            Toast.makeText(this, "Selected Item : " + item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id==R.id.download)
        {
            Toast.makeText(this, "Selected Item : " + item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }

        else if(id==R.id.president)
        {
            Intent intent = new Intent(getApplicationContext(),listview_act.class);
            Toast.makeText(this, "Selected Item : " + item.getTitle(), Toast.LENGTH_SHORT).show();
            startActivity(intent);
            return true;

        } else if (id==R.id.exit) {
            MainActivity.this.finish();
            System.exit(0);
            return true;
        }
        return false;
    }

}