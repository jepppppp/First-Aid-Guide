package com.example.firstaidkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;

import pl.droidsonroids.gif.GifImageButton;

public class MainActivity extends AppCompatActivity {

    private GifImageButton mUsefulstuff;
    private GifImageButton mAnywhereEvents;
    private GifImageButton mOutdoorEvents;
    private GifImageButton mFirstAidMyths;
    private GifImageButton mFirstAidBasics;
    private GifImageButton mSeriousIncidents;
    private GifImageButton mPreventiveMeasures;
    private GifImageButton mCommonInHome;

//    private ImageButton mProfile;
    private ImageButton mCall;
    private ImageButton logout;

//    //content of icons
//
//    ListView listView;
//    private Object ListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsefulstuff        = findViewById(R.id.usefulstuff);
        mAnywhereEvents     = findViewById(R.id.anywhereevents);
        mOutdoorEvents      = findViewById(R.id.outdoor);
        mFirstAidMyths      = findViewById(R.id.firstaidmyths);
        mFirstAidBasics     = findViewById(R.id.firstaidbasics);
        mSeriousIncidents   = findViewById(R.id.seriousincidents);
        mPreventiveMeasures = findViewById(R.id.preventivemeasures);
        mCommonInHome       = findViewById(R.id.commoninhome);

//        mProfile = findViewById(R.id.profile);
        mCall = findViewById(R.id.emergencycall);
        logout = findViewById(R.id.logoutbtn);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });



//        //content of icons
//        ListView = findViewById(R.id.listview);
//        String[] values = new String[]{
//
//                "First Aid Basics"
//
//        };
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_list_item_1,
//                android.R.id.text1, values);
//
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                //first item listview
//                if (position == 0) {
//                    Intent intent = new Intent(view.getContext(), FirstAidBasics.class);
//                    startActivity(intent);
//                }
//            };
//        });




        mUsefulstuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Usefulstuff.class));
            }
        });

        mAnywhereEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AnywhereEvents.class));
            }
        });

        mOutdoorEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),OutdoorEvents.class));
            }
        });

        mFirstAidMyths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FirstAidMyths.class));
            }
        });

        mFirstAidBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FirstAidBasics.class));
            }
        });

        mSeriousIncidents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SeriousIncidents.class));
            }
        });

        mPreventiveMeasures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PreventiveMeasures.class));
            }
        });

        mCommonInHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),CommonInHome.class));
            }
        });

//        mProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getApplicationContext(),contentofprofile.class));
//            }
//        });

        mCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),emergencyhotlines.class));
            }
        });

    }


}