package com.mtw.caballero.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtCountA = (TextView) findViewById(R.id.txtCountA);
    private TextView txtCountB = (TextView) findViewById(R.id.txtCountB);
    private Team teamA = new Team("Team A", 0);
    private Team teamB = new Team("Team B", 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTxtA();
        setTxtB();

    }


    public void resetCount(View view) {
        teamA.setTotalPoints(0);
        teamB.setTotalPoints(0);
        setTxtA();
        setTxtB();
    }

    public void addPoint(View view) {
        switch(view.getId())
        {
            case R.id.btoAdd1A:
                teamA.setTotalPoints( teamA.getTotalPoints() + 1 );
                setTxtA();
                break;
            case R.id.btoAdd1B:
                teamB.setTotalPoints( teamB.getTotalPoints() + 1 );
                setTxtB();
                break;
            default:
                throw new RuntimeException("Unknow button ID");
        }
    }

    private void setTxtA (){
        txtCountA.setText( Integer.toString(teamA.getTotalPoints())  );
    }

    private void setTxtB (){
        txtCountB.setText( Integer.toString(teamB.getTotalPoints())  );
    }

}//End Class
