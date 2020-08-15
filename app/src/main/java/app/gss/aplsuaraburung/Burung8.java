package app.gss.aplsuaraburung;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import app.gss.aplsuaraburung.R;

import java.io.IOException;

public class Burung8 extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer mp1, mp2, mp3, mp4, mp5, mp6, mp7, mp8, mp9, mp10, mp11, mp12, mp13, mp14, mp15, mp16;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burung8);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btn1= (Button) findViewById(R.id.video);
        Button btn2= (Button) findViewById(R.id.mp3);
        Button bt_suara1= (Button) findViewById(R.id.suara1);
        Button bt_suara2= (Button) findViewById(R.id.suara2);
        Button bt_suara3= (Button) findViewById(R.id.suara3);
        Button bt_suara4= (Button) findViewById(R.id.suara4);
        Button bt_suara5= (Button) findViewById(R.id.suara5);
        Button bt_suara6= (Button) findViewById(R.id.suara6);
        Button bt_suara7= (Button) findViewById(R.id.suara7);
        Button bt_suara8= (Button) findViewById(R.id.suara8);
        Button bt_suara9= (Button) findViewById(R.id.suara9);
        Button bt_suara10= (Button) findViewById(R.id.suara10);
        Button bt_suara11= (Button) findViewById(R.id.suara11);
        Button bt_suara12= (Button) findViewById(R.id.suara12);
        Button bt_suara13= (Button) findViewById(R.id.suara13);
        Button bt_suara14= (Button) findViewById(R.id.suara14);
//        Button bt_suara15= (Button) findViewById(R.id.suara15);
//        Button bt_suara16= (Button) findViewById(R.id.suara16);
        Button stop= (Button) findViewById(R.id.stop);

        mp1 =  MediaPlayer.create(this, R.raw.anis1);
        mp2 =  MediaPlayer.create(this, R.raw.anis2);
        mp3 =  MediaPlayer.create(this, R.raw.anis3);
        mp4 =  MediaPlayer.create(this, R.raw.anis4);
        mp5 =  MediaPlayer.create(this, R.raw.anis5);
        mp6 =  MediaPlayer.create(this, R.raw.anis6);
        mp7 =  MediaPlayer.create(this, R.raw.anis7);
        mp8 =  MediaPlayer.create(this, R.raw.anis8);
        mp9 =  MediaPlayer.create(this, R.raw.anis9);
        mp10 =  MediaPlayer.create(this, R.raw.anis10);
        mp11 =  MediaPlayer.create(this, R.raw.anis11);
        mp12 =  MediaPlayer.create(this, R.raw.anis12);
        mp13 =  MediaPlayer.create(this, R.raw.anis13);
        mp14 =  MediaPlayer.create(this, R.raw.anis14);
//        mp15 =  MediaPlayer.create(this, R.raw.anis10);
//        mp16 =  MediaPlayer.create(this, R.raw.anis12);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        bt_suara1.setOnClickListener(this);
        bt_suara2.setOnClickListener(this);
        bt_suara3.setOnClickListener(this);
        bt_suara4.setOnClickListener(this);
        bt_suara5.setOnClickListener(this);
        bt_suara6.setOnClickListener(this);
        bt_suara7.setOnClickListener(this);
        bt_suara8.setOnClickListener(this);
        bt_suara9.setOnClickListener(this);
        bt_suara10.setOnClickListener(this);
        bt_suara11.setOnClickListener(this);
        bt_suara12.setOnClickListener(this);
        bt_suara13.setOnClickListener(this);
        bt_suara14.setOnClickListener(this);
//        bt_suara15.setOnClickListener(this);
//        bt_suara16.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.suara1) {
            if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            }

            try {
                mp1.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp1.start();

        } else if (id == R.id.suara2) {
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            }

            try {

                mp2.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp2.start();
        } else if (id == R.id.suara3) {
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            }

            try {

                mp3.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp3.start();
        } else if (id == R.id.suara4) {
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            }

            try {

                mp4.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp4.start();
        } else if (id == R.id.suara5) {
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            } 

            try {

                mp5.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp5.start();
        } else if (id == R.id.suara6) {
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            }

            try {

                mp6.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp6.start();
        } else if (id == R.id.suara7) {
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            } 

            try {

                mp7.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp7.start();
        } else if (id == R.id.suara8) {
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            }

            try {

                mp8.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp8.start();
        } else if (id == R.id.suara9) {
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            }

            try {

                mp9.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp9.start();
        } else if (id == R.id.suara10) {
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            }

            try {

                mp10.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp10.start();
        } else if (id == R.id.suara11) {
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            } 

            try {

                mp11.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp11.start();
        } else if (id == R.id.suara12) {
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            }

            try {

                mp12.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp12.start();
        } else if (id == R.id.suara13) {
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            }

            try {

                mp13.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp13.start();
        } else if (id == R.id.suara14) {
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            }

            try {

                mp14.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mp14.start();
        }else if(id == R.id.stop){
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            }
        }else if(id == R.id.mp3){
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            } 
            startActivity(new Intent(Burung8.this, Burung8mp3.class));
            finish();
        }
        else if(id == R.id.video){
            if (mp1.isPlaying()) {
                mp1.pause();
                mp1.seekTo(0);
            } else if (mp2.isPlaying()) {
                mp2.pause();
                mp2.seekTo(0);
            } else if (mp3.isPlaying()) {
                mp3.pause();
                mp3.seekTo(0);
            } else if (mp4.isPlaying()) {
                mp4.pause();
                mp4.seekTo(0);
            } else if (mp5.isPlaying()) {
                mp5.pause();
                mp5.seekTo(0);
            } else if (mp6.isPlaying()) {
                mp6.pause();
                mp6.seekTo(0);
            } else if (mp7.isPlaying()) {
                mp7.pause();
                mp7.seekTo(0);
            } else if (mp8.isPlaying()) {
                mp8.pause();
                mp8.seekTo(0);
            } else if (mp9.isPlaying()) {
                mp9.pause();
                mp9.seekTo(0);
            } else if (mp10.isPlaying()) {
                mp10.pause();
                mp10.seekTo(0);
            } else if (mp11.isPlaying()) {
                mp11.pause();
                mp11.seekTo(0);
            } else if (mp12.isPlaying()) {
                mp12.pause();
                mp12.seekTo(0);
            } else if (mp13.isPlaying()) {
                mp13.pause();
                mp13.seekTo(0);
            } else if (mp14.isPlaying()) {
                mp14.pause();
                mp14.seekTo(0);
            }
            startActivity(new Intent(Burung8.this, Burung8video.class));
            finish();
        }
    }

    public void onBackPressed() {
        if (mp1.isPlaying()) {
            mp1.pause();
            mp1.seekTo(0);
        } else if (mp2.isPlaying()) {
            mp2.pause();
            mp2.seekTo(0);
        } else if (mp3.isPlaying()) {
            mp3.pause();
            mp3.seekTo(0);
        } else if (mp4.isPlaying()) {
            mp4.pause();
            mp4.seekTo(0);
        } else if (mp5.isPlaying()) {
            mp5.pause();
            mp5.seekTo(0);
        } else if (mp6.isPlaying()) {
            mp6.pause();
            mp6.seekTo(0);
        } else if (mp7.isPlaying()) {
            mp7.pause();
            mp7.seekTo(0);
        } else if (mp8.isPlaying()) {
            mp8.pause();
            mp8.seekTo(0);
        } else if (mp9.isPlaying()) {
            mp9.pause();
            mp9.seekTo(0);
        } else if (mp10.isPlaying()) {
            mp10.pause();
            mp10.seekTo(0);
        } else if (mp11.isPlaying()) {
            mp11.pause();
            mp11.seekTo(0);
        } else if (mp12.isPlaying()) {
            mp12.pause();
            mp12.seekTo(0);
        } else if (mp13.isPlaying()) {
            mp13.pause();
            mp13.seekTo(0);
        } else if (mp14.isPlaying()) {
            mp14.pause();
            mp14.seekTo(0);
        }

        startActivity(new Intent(Burung8.this, HalamanUtama.class));
        finish();
    }
}
