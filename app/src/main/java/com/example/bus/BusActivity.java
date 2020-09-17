package com.example.bus;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

import com.example.bus.Contactbus.Contactbus;

import com.example.bus.MyDbhandlerbus.MyDbhandlerbus;



public class BusActivity extends AppCompatActivity {

    EditText pick;
    EditText dest;
    EditText date;
    EditText time;
    EditText type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

    }
    public void nextactivity3(View view)
    {
        Intent intent = new Intent(this,Seatselection.class);
        pick = findViewById(R.id.pick);
        dest = findViewById(R.id.dest);
        date = findViewById(R.id.date);
        time = findViewById(R.id.time);
        type = findViewById(R.id.type);
        String pickstr = pick.getText().toString();
        String destStr = dest.getText().toString();
        String datestr = date.getText().toString();
        String timestr = time.getText().toString();
        String typestr = type.getText().toString();
        MyDbhandlerbus db = new MyDbhandlerbus(BusActivity.this);
        Contactbus bus = new Contactbus(pickstr,destStr,datestr,timestr,typestr);
        Log.d("run",pickstr+" "+destStr+" "+datestr+" "+timestr);
        db.addContactbus(bus);
        startActivity(intent);
    }

}
