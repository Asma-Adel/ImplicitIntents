package com.example.implicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button face , mail , call , web , map ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        face = findViewById(R.id.face);
        mail = findViewById(R.id.mail);
        web = findViewById(R.id.web);
        call = findViewById(R.id.call);
        map = findViewById(R.id.map);

        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    try {
                        Intent face = new Intent(Intent.ACTION_VIEW,Uri.parse("fb://page/" + "333461320630618"));
                        if(face.resolveActivity(getPackageManager()) != null){
                            startActivity(face);}
                        }catch (ActivityNotFoundException e){
                        Intent face = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com" + "333461320630618"));
                        if(face.resolveActivity(getPackageManager()) != null){
                            startActivity(face);}                    }

            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mail = new Intent(Intent.ACTION_SEND);
                mail.setType("text/plain");
                mail.putExtra(Intent.EXTRA_EMAIL,new String[] {"errorteam55@gmail.com"});
                mail.putExtra(Intent.EXTRA_SUBJECT,"FROM ANDROID");
                mail.putExtra(Intent.EXTRA_TEXT,"Control Code ; Control World ;");
                if(mail.resolveActivity(getPackageManager()) != null) {
                    startActivity(mail);
                }

            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent web = new Intent();
                web.setAction(Intent.ACTION_VIEW);
                web.setData(Uri.parse("https://ao41866.wixsite.com/errorteam"));
                if(web.resolveActivity(getPackageManager()) != null){
                    startActivity(web);
                }
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:01119816157"));
                if(call.resolveActivity(getPackageManager()) != null){
                    startActivity(call);
                }
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:30.470106,31.196216"));
                if(map.resolveActivity(getPackageManager()) != null){
                    startActivity(map);
                }
            }
        });
    }

}
