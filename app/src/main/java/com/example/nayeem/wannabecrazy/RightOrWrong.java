package com.example.nayeem.wannabecrazy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;


public class RightOrWrong extends Activity {
    int result,rightRndm,lftRndm;
    static int scoreCount=0;
    Random Rndm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_or_wrong);

        TextView lftTxt=(TextView)findViewById(R.id.leftTextView);
        TextView midTxt=(TextView)findViewById(R.id.middleTextView);
        TextView rightTxt=(TextView)findViewById(R.id.rightTextView);
        TextView btmTxt=(TextView)findViewById(R.id.bottomTextView);
        final TextView scrTxt=(TextView)findViewById(R.id.scoreTextView);

        ImageButton rightbtn=(ImageButton)findViewById(R.id.rightButton);
        ImageButton wrongbtn=(ImageButton)findViewById(R.id.wrongButton);


        Rndm= new Random();

        lftRndm=Rndm.nextInt(10);
        lftTxt.setText(""+lftRndm);

        midTxt.setText("+");

        rightRndm=Rndm.nextInt(15);
        rightTxt.setText(""+rightRndm);


        if(lftRndm%2==0&&rightRndm%2==0)
            result=lftRndm+rightRndm;
        else
            result=Rndm.nextInt(lftRndm+2)+rightRndm;

        btmTxt.setText("="+result);
        scrTxt.setText("Score: "+scoreCount);

        rightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==lftRndm+rightRndm){
                    startActivity(getIntent());
                    scoreCount++;
                }
                else{
                    Intent returnMn = new Intent(getApplicationContext(), MainActivity.class);
                    scoreCount=0;
                    startActivity(returnMn);
                    finish();
                    System.exit(0);
                }

            }
        });

        wrongbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result!=lftRndm+rightRndm){
                    startActivity(getIntent());
                    scoreCount++;
                    scrTxt.setText("Score: "+scoreCount);
                }
                else{
                    Intent returnMn = new Intent(getApplicationContext(),MainActivity.class);
                    scoreCount=0;
                    startActivity(returnMn);
                    finish();
                    System.exit(0);

                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_right_or_wrong, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
