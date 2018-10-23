package com.example.nayeem.wannabecrazy;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mageButton btnstngs=(ImageButton)findViewById(R.id.settingsButton);
        ImageButton btnply=(ImageButton)findViewById(R.id.playButton);
        //ImageButton btnscr=(ImageButton)findViewById(R.id.scoreButton);
        //TextView scr= (TextView) findViewById(R.id.scoreView);

       /* btnstngs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog;
                dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.settingsdialog);
                dialog.setTitle("Choose game mode");
                dialog.getWindow().setLayout(getWindowManager().getDefaultDisplay().getWidth(), getWindowManager().getDefaultDisplay().getHeight());

                //getWindow().setLayout(screenWidth, LayoutParams.WRAP_CONTENT);
                Button btn1=(Button)dialog.findViewById(R.id.rightwrongbtn);
                Button btn2=(Button)dialog.findViewById(R.id.multichoicebtn);

                dialog.show();
            }
        });*/

        btnply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RightOrWrong.class);
                startActivity(intent);
                finish();
                System.exit(0);

            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
