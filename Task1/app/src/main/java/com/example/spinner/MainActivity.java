package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    Spinner sp;
    String bank[] = {"Select Bank","ICICI","SBI","BOB", "HDFC","IDFC"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = findViewById(R.id.spinner);
        ArrayAdapter banknames = new ArrayAdapter(this, android.R.layout.simple_spinner_item,bank);
        banknames.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(banknames);
        sp.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {

        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.custom_toast_layout));
        ImageView img = layout.findViewById(R.id.imageView);
        TextView tt = layout.findViewById(R.id.textView);
        if(i==1)
        {
            tt.setText("ICICI Bank");
            img.setBackground(getResources().getDrawable(R.drawable.icici));
        }
        else if(i==2)
        {
            tt.setText("SBI Bank");
            img.setBackground(getResources().getDrawable(R.drawable.sbi));
        }
        else if(i==3)
        {
            tt.setText("BOB Bank");
            img.setBackground(getResources().getDrawable(R.drawable.bob));
        }
        else if(i==4)
        {
            tt.setText("HDFC Bank");
            img.setBackground(getResources().getDrawable(R.drawable.hdfc));
        }
        else if(i==5)
        {
            tt.setText("IDFC Bank");
            img.setBackground(getResources().getDrawable(R.drawable.idfc));
        }
        else
        {
            tt.setText("");
        }
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}