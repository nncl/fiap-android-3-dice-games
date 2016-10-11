package com.fiap.mob.dicegames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgPlayer, imgPC;
    private int[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPlayer = (ImageView) findViewById(R.id.imgPlayer);
        imgPC = (ImageView) findViewById(R.id.imgPC);
        images = new int[6];

        // TODO: implement it
        /*for (int i = 0; i < 6; i++) {
            images[i] = R.drawable.dado + i;
        }*/

        // instead of this one
        images[0] = R.drawable.dado1;
        images[1] = R.drawable.dado2;
        images[2] = R.drawable.dado3;
        images[3] = R.drawable.dado4;
        images[4] = R.drawable.dado5;
        images[5] = R.drawable.dado6;
    }

    /**
     * Play the dices randomly - between 0 and 5, by index
     */

    public void play(View v) {
        String res = "Empate EN";

        // sorting
        Random rPlayer = new Random();
        int sPlayer = rPlayer.nextInt(5);

        Random rPC = new Random();
        int sPC = rPC.nextInt(5);

        // setting new images into the view
        imgPlayer.setImageResource(images[sPlayer]);
        imgPC.setImageResource(images[sPC]);

        // check which one won
        if (sPlayer < sPC) {
            res = "PC Won bro";
        } else if (sPlayer > sPC) {
            res = "Humanbeing RULES bitch";
        }

        Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
    }
}
