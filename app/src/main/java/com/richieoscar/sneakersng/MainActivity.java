package com.richieoscar.sneakersng;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.editText_email);






    }


    public void addToMailingList(View view) {
        if (!email.getText().toString().isEmpty()){
            email.setText("");
        Toast.makeText(this, "Subscribed", Toast.LENGTH_SHORT).show();
        }
    }
}