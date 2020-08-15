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

public class Burung8mp3 extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6, mediaPlayer7, mediaPlayer8, mediaPlayer9, mediaPlayer10;
    MediaPlayer mediaPlayer11, mediaPlayer12, mediaPlayer13, mediaPlayer14, mediaPlayer15, mediaPlayer16;

    private ImageButton btnPlay1, btnPlay2, btnPlay3, btnPlay4, btnPlay5, btnPlay6, btnPlay7, btnPlay8, btnPlay9, btnPlay10, btnPlay11, btnPlay12, btnPlay13, btnPlay14, btnPlay15, btnPlay16;
    private ImageButton btnPause1, btnPause2, btnPause3, btnPause4, btnPause5, btnPause6, btnPause7, btnPause8, btnPause9, btnPause10, btnPause11, btnPause12, btnPause13, btnPause14, btnPause15, btnPause16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burung8mp3);
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
            mediaPlayer1 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3anis1.mp3?alt=media&token=7c9a6516-e11b-4e6e-b086-1397db547244"));
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
            Toast.makeText(Burung8mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay1.setVisibility(View.GONE);
            btnPause1.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop1) {
            if (mediaPlayer1.isPlaying()) {
                mediaPlayer1.pause();
                mediaPlayer1.seekTo(0);
                Toast.makeText(Burung8mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay1.setVisibility(View.VISIBLE);
                btnPause1.setVisibility(View.GONE);
            }
        } else if (id == R.id.play2) {
            mediaPlayer2 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3anis2.mp3?alt=media&token=3af78feb-43fc-454e-ad7e-9ed673cfe134"));
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
            Toast.makeText(Burung8mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay2.setVisibility(View.GONE);
            btnPause2.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop2) {
            if (mediaPlayer2.isPlaying()) {
                mediaPlayer2.pause();
                mediaPlayer2.seekTo(0);
                Toast.makeText(Burung8mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay2.setVisibility(View.VISIBLE);
                btnPause2.setVisibility(View.GONE);
            }
        } else if (id == R.id.play3) {
            mediaPlayer3 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3anis3.mp3?alt=media&token=8455e105-c373-4935-ab36-e8d8ddc8c661"));
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
            Toast.makeText(Burung8mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay3.setVisibility(View.GONE);
            btnPause3.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop3) {
            if (mediaPlayer3.isPlaying()) {
                mediaPlayer3.pause();
                mediaPlayer3.seekTo(0);
                Toast.makeText(Burung8mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay3.setVisibility(View.VISIBLE);
                btnPause3.setVisibility(View.GONE);
            }
        } else if (id == R.id.play4) {
            mediaPlayer4 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3anis4.mp3?alt=media&token=bcd4bc5d-afa1-4ff2-8fc5-7e4918966186"));
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
            Toast.makeText(Burung8mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay4.setVisibility(View.GONE);
            btnPause4.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop4) {
            if (mediaPlayer4.isPlaying()) {
                mediaPlayer4.pause();
                mediaPlayer4.seekTo(0);
                Toast.makeText(Burung8mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay4.setVisibility(View.VISIBLE);
                btnPause4.setVisibility(View.GONE);
            }
        } else if (id == R.id.play5) {
            mediaPlayer5 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3anis5.mp3?alt=media&token=28627d59-d36c-43b9-9a43-b3308937f25f"));
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
            Toast.makeText(Burung8mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay5.setVisibility(View.GONE);
            btnPause5.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop5) {
            if (mediaPlayer5.isPlaying()) {
                mediaPlayer5.pause();
                mediaPlayer5.seekTo(0);
                Toast.makeText(Burung8mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay5.setVisibility(View.VISIBLE);
                btnPause5.setVisibility(View.GONE);
            }
        } else if (id == R.id.play6) {
            mediaPlayer6 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3anis6.mp3?alt=media&token=c730a3ec-1903-4b67-a2a3-5538c9ac1a08"));
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
            Toast.makeText(Burung8mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay6.setVisibility(View.GONE);
            btnPause6.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop6) {
            if (mediaPlayer6.isPlaying()) {
                mediaPlayer6.pause();
                mediaPlayer6.seekTo(0);
                Toast.makeText(Burung8mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay6.setVisibility(View.VISIBLE);
                btnPause6.setVisibility(View.GONE);
            }
        } else if (id == R.id.play7) {
            mediaPlayer7 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3anis7.mp3?alt=media&token=d647e1c8-76a9-47b9-9243-adab27246b80"));
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
            Toast.makeText(Burung8mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay7.setVisibility(View.GONE);
            btnPause7.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop7) {
            if (mediaPlayer7.isPlaying()) {
                mediaPlayer7.pause();
                mediaPlayer7.seekTo(0);
                Toast.makeText(Burung8mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay7.setVisibility(View.VISIBLE);
                btnPause7.setVisibility(View.GONE);
            }
        } else if (id == R.id.play8) {
            mediaPlayer8 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3anis8.mp3?alt=media&token=f60e7287-da94-4ff2-981e-45a04ec0daf0"));
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
            Toast.makeText(Burung8mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay8.setVisibility(View.GONE);
            btnPause8.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop8) {
            if (mediaPlayer8.isPlaying()) {
                mediaPlayer8.pause();
                mediaPlayer8.seekTo(0);
                Toast.makeText(Burung8mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay8.setVisibility(View.VISIBLE);
                btnPause8.setVisibility(View.GONE);
            }
        } else if (id == R.id.play9) {
            mediaPlayer9 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3anis9.mp3?alt=media&token=10b70636-b66f-4dee-82d4-49178f237681"));
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
            Toast.makeText(Burung8mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay9.setVisibility(View.GONE);
            btnPause9.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop9) {
            if (mediaPlayer9.isPlaying()) {
                mediaPlayer9.pause();
                mediaPlayer9.seekTo(0);
                Toast.makeText(Burung8mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay9.setVisibility(View.VISIBLE);
                btnPause9.setVisibility(View.GONE);
            }
        } else if (id == R.id.play10) {
            mediaPlayer10 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3anis10.mp3?alt=media&token=0fb4a5e7-c840-4fd4-9af1-5b557f7bdbbc"));
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
            Toast.makeText(Burung8mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay10.setVisibility(View.GONE);
            btnPause10.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop10) {
            if (mediaPlayer10.isPlaying()) {
                mediaPlayer10.pause();
                mediaPlayer10.seekTo(0);
                Toast.makeText(Burung8mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay10.setVisibility(View.VISIBLE);
                btnPause10.setVisibility(View.GONE);
            }
        } else if (id == R.id.play11) {
            mediaPlayer11 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3anis11.mp3?alt=media&token=8cae2350-99fa-452c-b053-40dcac493588"));
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
            Toast.makeText(Burung8mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay11.setVisibility(View.GONE);
            btnPause11.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop11) {
            if (mediaPlayer11.isPlaying()) {
                mediaPlayer11.pause();
                mediaPlayer11.seekTo(0);
                Toast.makeText(Burung8mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay11.setVisibility(View.VISIBLE);
                btnPause11.setVisibility(View.GONE);
            }
        } else if (id == R.id.play12) {
            mediaPlayer12 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fmp3anis12.mp3?alt=media&token=a5863f83-09e7-47e6-852f-0f92a5199a17"));
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
            Toast.makeText(Burung8mp3.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay12.setVisibility(View.GONE);
            btnPause12.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop12) {
            if (mediaPlayer12.isPlaying()) {
                mediaPlayer12.pause();
                mediaPlayer12.seekTo(0);
                Toast.makeText(Burung8mp3.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay12.setVisibility(View.VISIBLE);
                btnPause12.setVisibility(View.GONE);
            }
        }

    }

    public void onBackPressed() {
        startActivity(new Intent(Burung8mp3.this, Burung8.class));
        finish();
    }
}