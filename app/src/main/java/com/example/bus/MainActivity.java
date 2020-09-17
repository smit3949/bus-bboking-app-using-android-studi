package com.example.bus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.bus.data.MyDbHandler;
import com.example.bus.model.Contact;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText address;
    EditText phone;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void nextactivity2(View view)
    {
        Intent intent = new Intent(this,BusActivity.class);
        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        String namestr = name.getText().toString();
        String addressStr = address.getText().toString();
        String phonestr = phone.getText().toString();
        String emailstr = email.getText().toString();
        MyDbHandler db = new MyDbHandler(MainActivity.this);
        Contact person = new Contact(namestr,phonestr,addressStr,emailstr);
        db.addContact(person);
        startActivity(intent);
        Log.d("run",namestr+" "+addressStr+" "+phonestr+" "+emailstr);


    }
}
