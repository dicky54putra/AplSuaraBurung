package app.gss.aplsuaraburung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import app.gss.aplsuaraburung.R;

import java.io.IOException;

public class Burung6mp3 extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6, mediaPlayer7, mediaPlayer8, mediaPlayer9, mediaPlayer10;
    MediaPlayer mediaPlayer11, mediaPlayer12, mediaPlayer13, mediaPlayer14, mediaPlayer15, mediaPlayer16, mediaPlayer17;

    private ImageButton btnPlay1, btnPlay2, btnPlay3, btnPlay4, btnPlay5, btnPlay6, btnPlay7, btnPlay8, btnPlay9, btnPlay10, btnPlay11, btnPlay12, btnPlay13, btnPlay14, btnPlay15, btnPlay16, btnPlay17;
    private ImageButton btnPause1, btnPause2, btnPause3, btnPause4, btnPause5, btnPause6, btnPause7, btnPause8, btnPause9, btnPause10, btnPause11, btnPause12, btnPause13, btnPause14, btnPause15, btnPause16, btnPause17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burung6mp3);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Perintah menunculkan button dan meng hidden
        btnPlay1 = (ImageButton) findViewById(R.id.play1);
        btnPause1 = (ImageButton) findViewById(R.id.pause1);
        btnPlay2 = (ImageButton) findViewById(R.id.play2);
        btnPause2 = (ImageButton) findViewById(R.id.pause2);
        btnPlay3 = (ImageButton) findViewById(R.id.play3);
        btnPause3 = (ImageButton) findViewById(R.id.pause3);
        btnPlay4 = (ImageButton) findViewById(R.id.play4);
        btnPause4 = (ImageButton) findViewById(R.id.pause4);
        btnPlay5 = (ImageButton) findViewById(R.id.play5);
        btnPause5 = (ImageButton) findViewById(R.id.pause5);
        btnPlay6 = (ImageButton) findViewById(R.id.play6);
        btnPause6 = (ImageButton) findViewById(R.id.pause6);
        btnPlay7 = (ImageButton) findViewById(R.id.play7);
        btnPause7 = (ImageButton) findViewById(R.id.pause7);
        btnPlay8 = (ImageButton) findViewById(R.id.play8);
        btnPause8 = (ImageButton) findViewById(R.id.pause8);
        btnPlay9 = (ImageButton) findViewById(R.id.play9);
        btnPause9 = (ImageButton) findViewById(R.id.pause9);
        btnPlay10 = (ImageButton) findViewById(R.id.play10);
        btnPause10 = (ImageButton) findViewById(R.id.pause10);
        btnPlay11 = (ImageButton) findViewById(R.id.play11);
        btnPause11 = (ImageButton) findViewById(R.id.pause11);
        btnPlay12 = (ImageButton) findViewById(R.id.play12);
        btnPause12 = (ImageButton) findViewById(R.id.pause12);
        btnPlay13 = (ImageButton) findViewById(R.id.play13);
        btnPause13 = (ImageButton) findViewById(R.id.pause13);
        btnPlay14 = (ImageButton) findViewById(R.id.play14);
        btnPause14 = (ImageButton) findViewById(R.id.pause14);
        btnPlay15 = (ImageButton) findViewById(R.id.play15);
        btnPause15 = (ImageButton) findViewById(R.id.pause15);
        btnPlay16 = (ImageButton) findViewById(R.id.play16);
        btnPause16 = (ImageButton) findViewById(R.id.pause16);
        btnPlay17 = (ImageButton) findViewById(R.id.play17);
        btnPause17 = (ImageButton) findViewById(R.id.pause17);

        btnPlay1.setVisibility(View.VISIBLE);
        btnPause1.setVisibility(View.GONE);
        btnPlay2.setVisibility(View.VISIBLE);
        btnPause2.setVisibility(View.GONE);
        btnPlay3.setVisibility(View.VISIBLE);
        btnPause3.setVisibility(View.GONE);
        btnPlay4.setVisibility(View.VISIBLE);
        btnPause4.setVisibility(View.GONE);
        btnPlay5.setVisibility(View.VISIBLE);
        btnPause5.setVisibility(View.GONE);
        btnPlay6.setVisibility(View.VISIBLE);
        btnPause6.setVisibility(View.GONE);
        btnPlay7.setVisibility(View.VISIBLE);
        btnPause7.setVisibility(View.GONE);
        btnPlay8.setVisibility(View.VISIBLE);
        btnPause8.setVisibility(View.GONE);
        btnPlay9.setVisibility(View.VISIBLE);
        btnPause9.setVisibility(View.GONE);
        btnPlay10.setVisibility(View.VISIBLE);
        btnPause10.setVisibility(View.GONE);
        btnPlay11.setVisibility(View.VISIBLE);
        btnPause11.setVisibility(View.GONE);
        btnPlay12.setVisibility(View.VISIBLE);
        btnPause12.setVisibility(View.GONE);
        btnPlay13.setVisibility(View.VISIBLE);
        btnPause13.setVisibility(View.GONE);
        btnPlay14.setVisibility(View.VISIBLE);
        btnPause14.setVisibility(View.GONE);
        btnPlay15.setVisibility(View.VISIBLE);
        btnPause15.setVisibility(View.GONE);
        btnPlay16.setVisibility(View.VISIBLE);
        btnPause16.setVisibility(View.GONE);
        btnPlay17.setVisibility(View.VISIBLE);
        btnPause17.setVisibility(View.GONE);

        ImageView play1 = (ImageView) findViewById(R.id.play1);
        ImageView stop1 = (ImageView) findViewById(R.id.stop1);
        ImageView play2 = (ImageView) findViewById(R.id.play2);
        ImageView stop2 = (ImageView) findViewById(R.id.stop2);
        ImageView play3 = (ImageView) findViewById(R.id.play3);
        ImageView stop3 = (ImageView) findViewById(R.id.stop3);
        ImageView play4 = (ImageView) findViewById(R.id.play4);
        ImageView stop4 = (ImageView) findViewById(R.id.stop4);
        ImageView play5 = (ImageView) findViewById(R.id.play5);
        ImageView stop5 = (ImageView) findViewById(R.id.stop5);
        ImageView play6 = (ImageView) findViewById(R.id.play6);
        ImageView stop6 = (ImageView) findViewById(R.id.stop6);
        ImageView play7 = (ImageView) findViewById(R.id.play7);
        ImageView stop7 = (ImageView) findViewById(R.id.stop7);
        ImageView play8 = (ImageView) findViewById(R.id.play8);
        ImageView stop8 = (ImageView) findViewById(R.id.stop8);
        ImageView play9 = (ImageView) findViewById(R.id.play9);
        ImageView stop9 = (ImageView) findViewById(R.id.stop9);
        ImageView play10 = (ImageView) findViewById(R.id.play10);
        ImageView stop10 = (ImageView) findViewById(R.id.stop10);
        ImageView play11 = (ImageView) findViewById(R.id.play11);
        ImageView stop11 = (ImageView) findViewById(R.id.stop11);
        ImageView play12 = (ImageView) findViewById(R.id.play12);
        ImageView stop12 = (ImageView) findViewById(R.id.stop12);
        ImageView play13 = (ImageView) findViewById(R.id.play13);
        ImageView stop13 = (ImageView) findViewById(R.id.stop13);
        ImageView play14 = (ImageView) findViewById(R.id.play14);
        ImageView stop14 = (ImageView) findViewById(R.id.stop14);
        ImageView play15 = (ImageView) findViewById(R.id.play15);
        ImageView stop15 = (ImageView) findViewById(R.id.stop15);
        ImageView play16 = (ImageView) findViewById(R.id.play16);
        ImageView stop16 = (ImageView) findViewById(R.id.stop16);
        ImageView play17 = (ImageView) findViewById(R.id.play17);
        ImageView stop17 = (ImageView) findViewById(R.id.stop17);

        play1.setOnClickListener(this);
        stop1.setOnClickListener(this);
        play2.setOnClickListener(this);
        stop2.setOnClickListener(this);
        play3.setOnClickListener(this);
        stop3.setOnClickListener(this);
        play4.setOnClickListener(this);
        stop4.setOnClickListener(this);
        play5.setOnClickListener(this);
        stop5.setOnClickListener(this);
        play6.setOnClickListener(this);
        stop6.setOnClickListener(this);
        play7.setOnClickListener(this);
        stop7.setOnClickListener(this);
        play8.setOnClickListener(this);
        stop8.setOnClickListener(this);
        play9.setOnClickListener(this);
        stop9.setOnClickListener(this);
        play10.setOnClickListener(this);
        stop10.setOnClickListener(this);
        play11.setOnClickListener(this);
        stop11.setOnClickListener(this);
        play12.setOnClickListener(this);
        stop12.setOnClickListener(this);
        play13.setOnClickListener(this);
        stop13.setOnClickListener(this);
        play14.setOnClickListener(this);
        stop14.setOnClickListener(this);
        play15.setOnClickListener(this);
        stop15.setOnClickListener(this);
        play16.setOnClickListener(this);
        stop16.setOnClickListener(this);
        play17.setOnClickListener(this);
        stop17.setOnClickListener(this);

    }

    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.play1) {
            mediaPlayer1 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt1.mp3?alt=media&token=1a18d585-729a-49ff-b859-ea3911ef3c48"));
            if (mediaPlayer1.isPlaying()) {
                mediaPlayer2.pause();
                mediaPlayer2.seekTo(0);
            }

            try {
                mediaPlayer1.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer1.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay1.setVisibility(View.GONE);
            btnPause1.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop1) {
            if (mediaPlayer1.isPlaying()) {
                mediaPlayer1.pause();
                mediaPlayer1.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay1.setVisibility(View.VISIBLE);
                btnPause1.setVisibility(View.GONE);
            }
        } else if (id == R.id.play2) {
            mediaPlayer2 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt2.mp3?alt=media&token=be18fb35-fbc1-4233-92d0-a721f526cf33"));
            if (mediaPlayer2.isPlaying()) {
                mediaPlayer3.pause();
                mediaPlayer3.seekTo(0);
            }

            try {
                mediaPlayer2.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer2.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay2.setVisibility(View.GONE);
            btnPause2.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop2) {
            if (mediaPlayer2.isPlaying()) {
                mediaPlayer2.pause();
                mediaPlayer2.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay2.setVisibility(View.VISIBLE);
                btnPause2.setVisibility(View.GONE);
            }
        } else if (id == R.id.play3) {
            mediaPlayer3 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt3.mp3?alt=media&token=b7fd2b74-856d-497f-9cc1-98b7f325f74d"));
            if (mediaPlayer3.isPlaying()) {
                mediaPlayer4.pause();
                mediaPlayer4.seekTo(0);
            }

            try {
                mediaPlayer3.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer3.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay3.setVisibility(View.GONE);
            btnPause3.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop3) {
            if (mediaPlayer3.isPlaying()) {
                mediaPlayer3.pause();
                mediaPlayer3.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay3.setVisibility(View.VISIBLE);
                btnPause3.setVisibility(View.GONE);
            }
        } else if (id == R.id.play4) {
            mediaPlayer4 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt4.mp3?alt=media&token=06a6b66f-d59b-41fe-953b-816966e2d66b"));
            if (mediaPlayer4.isPlaying()) {
                mediaPlayer5.pause();
                mediaPlayer5.seekTo(0);
            }

            try {
                mediaPlayer4.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer4.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay4.setVisibility(View.GONE);
            btnPause4.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop4) {
            if (mediaPlayer4.isPlaying()) {
                mediaPlayer4.pause();
                mediaPlayer4.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay4.setVisibility(View.VISIBLE);
                btnPause4.setVisibility(View.GONE);
            }
        } else if (id == R.id.play5) {
            mediaPlayer5 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt5.mp3?alt=media&token=5fce2ac0-57a8-4c70-88a5-f7429ef78925"));
            if (mediaPlayer5.isPlaying()) {
                mediaPlayer6.pause();
                mediaPlayer6.seekTo(0);
            }

            try {
                mediaPlayer5.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer5.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay5.setVisibility(View.GONE);
            btnPause5.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop5) {
            if (mediaPlayer5.isPlaying()) {
                mediaPlayer5.pause();
                mediaPlayer5.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay5.setVisibility(View.VISIBLE);
                btnPause5.setVisibility(View.GONE);
            }
        } else if (id == R.id.play6) {
            mediaPlayer6 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt6.mp3?alt=media&token=4b7695cd-27a6-447d-bc36-1ab16f73c10e"));
            if (mediaPlayer6.isPlaying()) {
                mediaPlayer7.pause();
                mediaPlayer7.seekTo(0);
            }

            try {
                mediaPlayer6.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer6.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay6.setVisibility(View.GONE);
            btnPause6.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop6) {
            if (mediaPlayer6.isPlaying()) {
                mediaPlayer6.pause();
                mediaPlayer6.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay6.setVisibility(View.VISIBLE);
                btnPause6.setVisibility(View.GONE);
            }
        } else if (id == R.id.play7) {
            mediaPlayer7 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt7.mp3?alt=media&token=ea3f49bc-cfca-4dae-8f21-6bee4721dc63"));
            if (mediaPlayer7.isPlaying()) {
                mediaPlayer8.pause();
                mediaPlayer8.seekTo(0);
            }

            try {
                mediaPlayer7.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer7.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay7.setVisibility(View.GONE);
            btnPause7.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop7) {
            if (mediaPlayer7.isPlaying()) {
                mediaPlayer7.pause();
                mediaPlayer7.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay7.setVisibility(View.VISIBLE);
                btnPause7.setVisibility(View.GONE);
            }
        } else if (id == R.id.play8) {
            mediaPlayer8 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt8.mp3?alt=media&token=c31c56a1-ebce-4f71-b8ee-1eddc12ab645"));
            if (mediaPlayer8.isPlaying()) {
                mediaPlayer9.pause();
                mediaPlayer9.seekTo(0);
            }

            try {
                mediaPlayer8.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer8.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay8.setVisibility(View.GONE);
            btnPause8.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop8) {
            if (mediaPlayer8.isPlaying()) {
                mediaPlayer8.pause();
                mediaPlayer8.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay8.setVisibility(View.VISIBLE);
                btnPause8.setVisibility(View.GONE);
            }
        } else if (id == R.id.play9) {
            mediaPlayer9 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt9.mp3?alt=media&token=8cb43d3e-dd7e-4109-9a46-3f0babf353df"));
            if (mediaPlayer9.isPlaying()) {
                mediaPlayer10.pause();
                mediaPlayer10.seekTo(0);
            }

            try {
                mediaPlayer9.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer9.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay9.setVisibility(View.GONE);
            btnPause9.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop9) {
            if (mediaPlayer9.isPlaying()) {
                mediaPlayer9.pause();
                mediaPlayer9.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay9.setVisibility(View.VISIBLE);
                btnPause9.setVisibility(View.GONE);
            }
        } else if (id == R.id.play10) {
            mediaPlayer10 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt10.mp3?alt=media&token=8efb1fb7-5095-4199-aa70-9d24dbe807d2"));
            if (mediaPlayer10.isPlaying()) {
                mediaPlayer11.pause();
                mediaPlayer11.seekTo(0);
            }

            try {
                mediaPlayer10.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer10.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay10.setVisibility(View.GONE);
            btnPause10.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop10) {
            if (mediaPlayer10.isPlaying()) {
                mediaPlayer10.pause();
                mediaPlayer10.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay10.setVisibility(View.VISIBLE);
                btnPause10.setVisibility(View.GONE);
            }
        } else if (id == R.id.play11) {
            mediaPlayer11 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt11.mp3?alt=media&token=2cfce551-37ea-4533-9171-2e20ba2199be"));
            if (mediaPlayer11.isPlaying()) {
                mediaPlayer12.pause();
                mediaPlayer12.seekTo(0);
            }

            try {
                mediaPlayer11.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer11.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay11.setVisibility(View.GONE);
            btnPause11.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop11) {
            if (mediaPlayer11.isPlaying()) {
                mediaPlayer11.pause();
                mediaPlayer11.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay11.setVisibility(View.VISIBLE);
                btnPause11.setVisibility(View.GONE);
            }
        } else if (id == R.id.play12) {
            mediaPlayer12 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt12.mp3?alt=media&token=a3ace0fb-a1ad-40a4-b292-f95ae5b5ac32"));
            if (mediaPlayer12.isPlaying()) {
                mediaPlayer13.pause();
                mediaPlayer13.seekTo(0);
            }

            try {
                mediaPlayer12.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer12.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay12.setVisibility(View.GONE);
            btnPause12.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop12) {
            if (mediaPlayer12.isPlaying()) {
                mediaPlayer12.pause();
                mediaPlayer12.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay12.setVisibility(View.VISIBLE);
                btnPause12.setVisibility(View.GONE);
            }
        } else if (id == R.id.play13) {
            mediaPlayer13 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt13.mp3?alt=media&token=e3f52b6d-dcf9-4d46-aa04-4f8fca4d6556"));
            if (mediaPlayer13.isPlaying()) {
                mediaPlayer14.pause();
                mediaPlayer14.seekTo(0);
            }

            try {
                mediaPlayer13.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer13.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay13.setVisibility(View.GONE);
            btnPause13.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop13) {
            if (mediaPlayer13.isPlaying()) {
                mediaPlayer13.pause();
                mediaPlayer13.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay13.setVisibility(View.VISIBLE);
                btnPause13.setVisibility(View.GONE);
            }
        } else if (id == R.id.play14) {
            mediaPlayer14 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt14.mp3?alt=media&token=f5a21920-c2fe-4fb8-9b7a-023b89ceb8b8"));
            if (mediaPlayer14.isPlaying()) {
                mediaPlayer15.pause();
                mediaPlayer15.seekTo(0);
            }

            try {
                mediaPlayer14.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer14.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay14.setVisibility(View.GONE);
            btnPause14.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop14) {
            if (mediaPlayer14.isPlaying()) {
                mediaPlayer14.pause();
                mediaPlayer14.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay14.setVisibility(View.VISIBLE);
                btnPause14.setVisibility(View.GONE);
            }
        } else if (id == R.id.play15) {
            mediaPlayer15 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt15.mp3?alt=media&token=1e54cd90-99b4-4387-b6fa-509b87e5af1c"));
            if (mediaPlayer15.isPlaying()) {
                mediaPlayer16.pause();
                mediaPlayer16.seekTo(0);
            }

            try {
                mediaPlayer15.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer15.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay15.setVisibility(View.GONE);
            btnPause15.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop15) {
            if (mediaPlayer15.isPlaying()) {
                mediaPlayer15.pause();
                mediaPlayer15.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay15.setVisibility(View.VISIBLE);
                btnPause15.setVisibility(View.GONE);
            }
        } else if (id == R.id.play16) {
            mediaPlayer16 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt16.mp3?alt=media&token=92963c78-efef-4575-99e7-9ad9f8972b55"));
            if (mediaPlayer16.isPlaying()) {
                mediaPlayer17.pause();
                mediaPlayer17.seekTo(0);
            }

            try {
                mediaPlayer16.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer16.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay16.setVisibility(View.GONE);
            btnPause16.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop16) {
            if (mediaPlayer16.isPlaying()) {
                mediaPlayer16.pause();
                mediaPlayer16.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay16.setVisibility(View.VISIBLE);
                btnPause16.setVisibility(View.GONE);
            }
        } else if (id == R.id.play17) {
            mediaPlayer17 = MediaPlayer.create(this, Uri.parse("17.https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3ktt17.mp3?alt=media&token=4c5ee9b8-2b34-4d82-9144-f87b15ecb1f2"));
            if (mediaPlayer17.isPlaying()) {
                mediaPlayer16.pause();
                mediaPlayer16.seekTo(0);
            }

            try {
                mediaPlayer17.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer17.start();
            Toast.makeText(Burung6mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay16.setVisibility(View.GONE);
            btnPause16.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop17) {
            if (mediaPlayer17.isPlaying()) {
                mediaPlayer17.pause();
                mediaPlayer17.seekTo(0);
                Toast.makeText(Burung6mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay17.setVisibility(View.VISIBLE);
                btnPause17.setVisibility(View.GONE);
            }
        }

    }

    public void onBackPressed() {
        startActivity(new Intent(Burung6mp3.this, Burung6.class));
        finish();
    }
}
