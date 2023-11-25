package com.example.homework9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
        et=findViewById(R.id.editTextText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /**
         * The function creates the Menu Option in MainActivity
         * @return: return true
         */
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;
    }


    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        /**
         * The function starts when you click a item in OptionMenu
         * @param: the function get the item that pressed
         * @return: the function should return true
         */
        String st = item.getTitle().toString();
        if (st.equals("credits")) {
            Intent si = new Intent(this,MainActivity2.class);
            startActivity(si);
        }
        return super.onOptionsItemSelected(item);
    }






}