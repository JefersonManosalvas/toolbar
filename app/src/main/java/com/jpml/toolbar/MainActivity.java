package com.jpml.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
  private Toolbar toolbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar1=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.opc1) {
            Toast.makeText(this,"A SELECCIONADO LA OPCION 1",Toast.LENGTH_LONG).show();

        } else if (item.getItemId()==R.id.opc2) {
            Toast.makeText(this,"A SELECCIONADO LA OPCION 2",Toast.LENGTH_LONG).show();
            
        } else if (item.getItemId()==R.id.opc3) {
            Toast.makeText(this,"A SELECCIONADO LA OPCION 3",Toast.LENGTH_LONG).show();
            
        }
        return true;
    }





}
