package com.example.orderpeerandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity implements OnMessageListener{

    private UDPConnection udp;

    private ImageView imgPizza;
    private ImageView imgFrenchFries;
    private ImageView imgNachos;
    private ImageView imgCocacola;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgPizza=findViewById(R.id.imgPizza);
        imgFrenchFries=findViewById(R.id.imgFrenchFries);
        imgNachos=findViewById(R.id.imgNachos);
        imgCocacola=findViewById(R.id.imgCocacola);

        udp= new UDPConnection();
        udp.setObserver(this);
        udp.start();

        imgPizza.setOnClickListener((view)->{
            //String item, int number, String hour, int x, int y)
            Calendar now = Calendar.getInstance();
            String hour= now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE);
            udp.sendMessage("Pizza",0, hour, 100,0);
        });

        imgFrenchFries.setOnClickListener((view)->{
            Calendar now = Calendar.getInstance();
            String hour= now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE);
            udp.sendMessage("Fries",0, hour, 100,0);
        });

        imgNachos.setOnClickListener((view)->{
            Calendar now = Calendar.getInstance();
            String hour= now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE);
            udp.sendMessage("Nachos",0, hour, 100,0);
        });

        imgCocacola.setOnClickListener((view)->{
            Calendar now = Calendar.getInstance();
            String hour= now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE);
            udp.sendMessage("Coca-cola",0, hour, 100,0);
        });

    }


    @Override
    public void onMsg(String msg) {
        runOnUiThread(()->{
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        });
    }
}