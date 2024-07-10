package com.example.spacechickens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.spacechickens.Fragments.FragmentListUsers;
import com.example.spacechickens.Fragments.FragmentMap;
import com.example.spacechickens.Interface.CallBackList;
import com.google.android.material.button.MaterialButton;

public class ScoreMapActivity extends AppCompatActivity {
    private FragmentListUsers listFragment;
    private FragmentMap mapFragment;
    private MaterialButton menu_BTN_return;
    private AppCompatImageView score_background;
    CallBackList callBack_list = new CallBackList() {

        @Override
        public void setMapLocation(double lat, double lon, String playerName) {
            mapFragment.setMapLocation(lat, lon, playerName);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_map);
        initView();
        listFragment = new FragmentListUsers();
        mapFragment = new FragmentMap();
        listFragment.setCallBack_list(callBack_list);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_list,listFragment).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_map,mapFragment).commit();
        menu_BTN_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreMapActivity.this , MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void initView() {
        menu_BTN_return = findViewById(R.id.menu_BTN_return);
        score_background = findViewById(R.id.score_background);
    }
}