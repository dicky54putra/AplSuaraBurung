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

public class Burung2mp3 extends AppCompatActivity implements View.OnClickListener{

    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6, mediaPlayer7, mediaPlayer8, mediaPlayer9, mediaPlayer10;
    MediaPlayer mediaPlayer11, mediaPlayer12, mediaPlayer13, mediaPlayer14, mediaPlayer15, mediaPlayer16;

    private ImageButton btnPlay1, btnPlay2, btnPlay3, btnPlay4, btnPlay5, btnPlay6, btnPlay7, btnPlay8, btnPlay9, btnPlay10, btnPlay11, btnPlay12, btnPlay13, btnPlay14, btnPlay15, btnPlay16;
    private ImageButton btnPause1, btnPause2, btnPause3, btnPause4, btnPause5, btnPause6, btnPause7, btnPause8, btnPause9, btnPause10, btnPause11, btnPause12, btnPause13, btnPause14, btnPause15, btnPause16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burung2mp3);
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
    }

    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.play1) {
            mediaPlayer1 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3trucuk1.mp3?alt=media&token=64400f9d-7c42-4c99-9ad8-5f9a872014a9"));
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
            Toast.makeText(Burung2mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay1.setVisibility(View.GONE);
            btnPause1.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop1) {
            if (mediaPlayer1.isPlaying()) {
                mediaPlayer1.pause();
                mediaPlayer1.seekTo(0);
                Toast.makeText(Burung2mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay1.setVisibility(View.VISIBLE);
                btnPause1.setVisibility(View.GONE);
            }
        } else if (id == R.id.play2) {
            mediaPlayer2 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3trucuk2.mp3?alt=media&token=57ea0681-7503-447b-93b8-47583d3ad538"));
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
            Toast.makeText(Burung2mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay2.setVisibility(View.GONE);
            btnPause2.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop2) {
            if (mediaPlayer2.isPlaying()) {
                mediaPlayer2.pause();
                mediaPlayer2.seekTo(0);
                Toast.makeText(Burung2mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay2.setVisibility(View.VISIBLE);
                btnPause2.setVisibility(View.GONE);
            }
        } else if (id == R.id.play3) {
            mediaPlayer3 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3trucuk3.mp3?alt=media&token=ac746978-1d97-4167-8617-7837f86d09df"));
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
            Toast.makeText(Burung2mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay3.setVisibility(View.GONE);
            btnPause3.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop3) {
            if (mediaPlayer3.isPlaying()) {
                mediaPlayer3.pause();
                mediaPlayer3.seekTo(0);
                Toast.makeText(Burung2mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay3.setVisibility(View.VISIBLE);
                btnPause3.setVisibility(View.GONE);
            }
        } else if (id == R.id.play4) {
            mediaPlayer4 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3trucuk4.mp3?alt=media&token=969bfc5e-cd65-4cf0-9604-8ff7fc43fad9"));
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
            Toast.makeText(Burung2mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay4.setVisibility(View.GONE);
            btnPause4.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop4) {
            if (mediaPlayer4.isPlaying()) {
                mediaPlayer4.pause();
                mediaPlayer4.seekTo(0);
                Toast.makeText(Burung2mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay4.setVisibility(View.VISIBLE);
                btnPause4.setVisibility(View.GONE);
            }
        } else if (id == R.id.play5) {
            mediaPlayer5 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3trucuk5.mp3?alt=media&token=bfc8b14a-15ec-4275-ba59-2f2f61ff5e6c"));
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
            Toast.makeText(Burung2mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay5.setVisibility(View.GONE);
            btnPause5.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop5) {
            if (mediaPlayer5.isPlaying()) {
                mediaPlayer5.pause();
                mediaPlayer5.seekTo(0);
                Toast.makeText(Burung2mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay5.setVisibility(View.VISIBLE);
                btnPause5.setVisibility(View.GONE);
            }
        } else if (id == R.id.play6) {
            mediaPlayer6 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3trucuk6.mp3?alt=media&token=2dfcf6e3-d4ff-436a-a7a9-9bceed784cd4"));
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
            Toast.makeText(Burung2mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay6.setVisibility(View.GONE);
            btnPause6.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop6) {
            if (mediaPlayer6.isPlaying()) {
                mediaPlayer6.pause();
                mediaPlayer6.seekTo(0);
                Toast.makeText(Burung2mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay6.setVisibility(View.VISIBLE);
                btnPause6.setVisibility(View.GONE);
            }
        } else if (id == R.id.play7) {
            mediaPlayer7 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3trucuk7.mp3?alt=media&token=e1acfc76-94e4-4460-b5cd-b87acaf3222f"));
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
            Toast.makeText(Burung2mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay7.setVisibility(View.GONE);
            btnPause7.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop7) {
            if (mediaPlayer7.isPlaying()) {
                mediaPlayer7.pause();
                mediaPlayer7.seekTo(0);
                Toast.makeText(Burung2mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay7.setVisibility(View.VISIBLE);
                btnPause7.setVisibility(View.GONE);
            }
        } else if (id == R.id.play8) {
            mediaPlayer8 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3trucuk8.mp3?alt=media&token=c888e071-65b0-4194-893f-9d8b06c05b52"));
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
            Toast.makeText(Burung2mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay8.setVisibility(View.GONE);
            btnPause8.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop8) {
            if (mediaPlayer8.isPlaying()) {
                mediaPlayer8.pause();
                mediaPlayer8.seekTo(0);
                Toast.makeText(Burung2mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay8.setVisibility(View.VISIBLE);
                btnPause8.setVisibility(View.GONE);
            }
        } else if (id == R.id.play9) {
            mediaPlayer9 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3trucuk9.mp3?alt=media&token=4e3253dd-9a8a-4881-80eb-38f265233933"));
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
            Toast.makeText(Burung2mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay9.setVisibility(View.GONE);
            btnPause9.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop9) {
            if (mediaPlayer9.isPlaying()) {
                mediaPlayer9.pause();
                mediaPlayer9.seekTo(0);
                Toast.makeText(Burung2mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay9.setVisibility(View.VISIBLE);
                btnPause9.setVisibility(View.GONE);
            }
        } else if (id == R.id.play10) {
            mediaPlayer10 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3trucuk10.mp3?alt=media&token=59f8221d-f997-488d-9358-30d0ab27b09c"));
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
            Toast.makeText(Burung2mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay10.setVisibility(View.GONE);
            btnPause10.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop10) {
            if (mediaPlayer10.isPlaying()) {
                mediaPlayer10.pause();
                mediaPlayer10.seekTo(0);
                Toast.makeText(Burung2mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay10.setVisibility(View.VISIBLE);
                btnPause10.setVisibility(View.GONE);
            }
        } else if (id == R.id.play11) {
            mediaPlayer11 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3trucuk11.mp3?alt=media&token=0862f463-b8e3-4331-9b47-e02e13f97334"));
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
            Toast.makeText(Burung2mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay11.setVisibility(View.GONE);
            btnPause11.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop11) {
            if (mediaPlayer11.isPlaying()) {
                mediaPlayer11.pause();
                mediaPlayer11.seekTo(0);
                Toast.makeText(Burung2mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay11.setVisibility(View.VISIBLE);
                btnPause11.setVisibility(View.GONE);
            }
        } else if (id == R.id.play12) {
            mediaPlayer12 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3trucuk12.mp3?alt=media&token=4f72ce09-2d9d-45cb-820e-1485d09e8998"));
            if (mediaPlayer12.isPlaying()) {
                mediaPlayer11.pause();
                mediaPlayer11.seekTo(0);
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
            Toast.makeText(Burung2mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay12.setVisibility(View.GONE);
            btnPause12.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop12) {
            if (mediaPlayer12.isPlaying()) {
                mediaPlayer12.pause();
                mediaPlayer12.seekTo(0);
                Toast.makeText(Burung2mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay12.setVisibility(View.VISIBLE);
                btnPause12.setVisibility(View.GONE);
            }
        }

    }

    public void onBackPressed() {
        startActivity(new Intent(Burung2mp3.this, Burung2.class));
        finish();
    }
}
