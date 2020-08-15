package app.gss.aplsuaraburung;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import app.gss.aplsuaraburung.R;

import java.io.IOException;

public class Burung10 extends AppCompatActivity implements View.OnClickListener{
    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6, mediaPlayer7, mediaPlayer8, mediaPlayer9, mediaPlayer10;
    MediaPlayer mediaPlayer11, mediaPlayer12, mediaPlayer13, mediaPlayer14, mediaPlayer15, mediaPlayer16, mediaPlayer17, mediaPlayer18, mediaPlayer19, mediaPlayer20;
    MediaPlayer mediaPlayer21, mediaPlayer22, mediaPlayer23, mediaPlayer24, mediaPlayer25, mediaPlayer26, mediaPlayer27, mediaPlayer28, mediaPlayer29, mediaPlayer30;
    MediaPlayer mediaPlayer31, mediaPlayer32, mediaPlayer33, mediaPlayer34, mediaPlayer35, mediaPlayer36, mediaPlayer37, mediaPlayer38, mediaPlayer39;

    private ImageButton btnPlay1, btnPlay2, btnPlay3, btnPlay4, btnPlay5, btnPlay6, btnPlay7, btnPlay8, btnPlay9, btnPlay10, btnPlay11, btnPlay12, btnPlay13, btnPlay14, btnPlay15, btnPlay16, btnPlay17, btnPlay18, btnPlay19, btnPlay20, btnPlay21, btnPlay22, btnPlay23, btnPlay24, btnPlay25, btnPlay26, btnPlay27, btnPlay28, btnPlay29, btnPlay30, btnPlay31, btnPlay32, btnPlay33, btnPlay34, btnPlay35, btnPlay36, btnPlay37, btnPlay38, btnPlay39;
    private ImageButton btnPause1, btnPause2, btnPause3, btnPause4, btnPause5, btnPause6, btnPause7, btnPause8, btnPause9, btnPause10, btnPause11, btnPause12, btnPause13, btnPause14, btnPause15, btnPause16, btnPause17, btnPause18, btnPause19, btnPause20, btnPause21, btnPause22, btnPause23, btnPause24, btnPause25, btnPause26, btnPause27, btnPause28, btnPause29, btnPause30, btnPause31, btnPause32, btnPause33, btnPause34, btnPause35, btnPause36, btnPause37, btnPause38, btnPause39;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burung10);
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
        btnPlay18 = (ImageButton) findViewById(R.id.play18);
        btnPause18 = (ImageButton) findViewById(R.id.pause18);
        btnPlay19 = (ImageButton) findViewById(R.id.play19);
        btnPause19 = (ImageButton) findViewById(R.id.pause19);
        btnPlay20 = (ImageButton) findViewById(R.id.play20);
        btnPause20 = (ImageButton) findViewById(R.id.pause20);
        btnPlay21 = (ImageButton) findViewById(R.id.play21);
        btnPause21 = (ImageButton) findViewById(R.id.pause21);
        btnPlay22 = (ImageButton) findViewById(R.id.play22);
        btnPause22 = (ImageButton) findViewById(R.id.pause22);
        btnPlay23 = (ImageButton) findViewById(R.id.play23);
        btnPause23 = (ImageButton) findViewById(R.id.pause23);
        btnPlay24 = (ImageButton) findViewById(R.id.play24);
        btnPause24 = (ImageButton) findViewById(R.id.pause24);
        btnPlay25 = (ImageButton) findViewById(R.id.play25);
        btnPause25 = (ImageButton) findViewById(R.id.pause25);
        btnPlay26 = (ImageButton) findViewById(R.id.play26);
        btnPause26 = (ImageButton) findViewById(R.id.pause26);
        btnPlay27 = (ImageButton) findViewById(R.id.play27);
        btnPause27 = (ImageButton) findViewById(R.id.pause27);
        btnPlay28 = (ImageButton) findViewById(R.id.play28);
        btnPause28 = (ImageButton) findViewById(R.id.pause28);
        btnPlay29 = (ImageButton) findViewById(R.id.play29);
        btnPause29 = (ImageButton) findViewById(R.id.pause29);
        btnPlay30 = (ImageButton) findViewById(R.id.play30);
        btnPause30 = (ImageButton) findViewById(R.id.pause30);
        btnPlay31 = (ImageButton) findViewById(R.id.play31);
        btnPause31 = (ImageButton) findViewById(R.id.pause31);
        btnPlay32 = (ImageButton) findViewById(R.id.play32);
        btnPause32 = (ImageButton) findViewById(R.id.pause32);
        btnPlay33 = (ImageButton) findViewById(R.id.play33);
        btnPause33 = (ImageButton) findViewById(R.id.pause33);
        btnPlay34 = (ImageButton) findViewById(R.id.play34);
        btnPause34 = (ImageButton) findViewById(R.id.pause34);
        btnPlay35 = (ImageButton) findViewById(R.id.play35);
        btnPause35 = (ImageButton) findViewById(R.id.pause35);
        btnPlay36 = (ImageButton) findViewById(R.id.play36);
        btnPause36 = (ImageButton) findViewById(R.id.pause36);
        btnPlay37 = (ImageButton) findViewById(R.id.play37);
        btnPause37 = (ImageButton) findViewById(R.id.pause37);
        btnPlay38 = (ImageButton) findViewById(R.id.play38);
        btnPause38 = (ImageButton) findViewById(R.id.pause38);
        btnPlay39 = (ImageButton) findViewById(R.id.play39);
        btnPause39 = (ImageButton) findViewById(R.id.pause39);

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
        btnPlay18.setVisibility(View.VISIBLE);
        btnPause18.setVisibility(View.GONE);
        btnPlay19.setVisibility(View.VISIBLE);
        btnPause19.setVisibility(View.GONE);
        btnPlay20.setVisibility(View.VISIBLE);
        btnPause20.setVisibility(View.GONE);
        btnPlay21.setVisibility(View.VISIBLE);
        btnPause21.setVisibility(View.GONE);
        btnPlay22.setVisibility(View.VISIBLE);
        btnPause22.setVisibility(View.GONE);
        btnPlay23.setVisibility(View.VISIBLE);
        btnPause23.setVisibility(View.GONE);
        btnPlay24.setVisibility(View.VISIBLE);
        btnPause24.setVisibility(View.GONE);
        btnPlay25.setVisibility(View.VISIBLE);
        btnPause25.setVisibility(View.GONE);
        btnPlay26.setVisibility(View.VISIBLE);
        btnPause26.setVisibility(View.GONE);
        btnPlay27.setVisibility(View.VISIBLE);
        btnPause27.setVisibility(View.GONE);
        btnPlay28.setVisibility(View.VISIBLE);
        btnPause28.setVisibility(View.GONE);
        btnPlay29.setVisibility(View.VISIBLE);
        btnPause29.setVisibility(View.GONE);
        btnPlay30.setVisibility(View.VISIBLE);
        btnPause30.setVisibility(View.GONE);
        btnPlay31.setVisibility(View.VISIBLE);
        btnPause31.setVisibility(View.GONE);
        btnPlay32.setVisibility(View.VISIBLE);
        btnPause32.setVisibility(View.GONE);
        btnPlay33.setVisibility(View.VISIBLE);
        btnPause33.setVisibility(View.GONE);
        btnPlay34.setVisibility(View.VISIBLE);
        btnPause34.setVisibility(View.GONE);
        btnPlay35.setVisibility(View.VISIBLE);
        btnPause35.setVisibility(View.GONE);
        btnPlay36.setVisibility(View.VISIBLE);
        btnPause36.setVisibility(View.GONE);
        btnPlay37.setVisibility(View.VISIBLE);
        btnPause37.setVisibility(View.GONE);
        btnPlay38.setVisibility(View.VISIBLE);
        btnPause38.setVisibility(View.GONE);
        btnPlay39.setVisibility(View.VISIBLE);
        btnPause39.setVisibility(View.GONE);
        // Sampai sini

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
        ImageView play18 = (ImageView) findViewById(R.id.play18);
        ImageView stop18 = (ImageView) findViewById(R.id.stop18);
        ImageView play19 = (ImageView) findViewById(R.id.play19);
        ImageView stop19 = (ImageView) findViewById(R.id.stop19);
        ImageView play20 = (ImageView) findViewById(R.id.play20);
        ImageView stop20 = (ImageView) findViewById(R.id.stop20);
        ImageView play21 = (ImageView) findViewById(R.id.play21);
        ImageView stop21 = (ImageView) findViewById(R.id.stop21);
        ImageView play22 = (ImageView) findViewById(R.id.play22);
        ImageView stop22 = (ImageView) findViewById(R.id.stop22);
        ImageView play23 = (ImageView) findViewById(R.id.play23);
        ImageView stop23 = (ImageView) findViewById(R.id.stop23);
        ImageView play24 = (ImageView) findViewById(R.id.play24);
        ImageView stop24 = (ImageView) findViewById(R.id.stop24);
        ImageView play25 = (ImageView) findViewById(R.id.play25);
        ImageView stop25 = (ImageView) findViewById(R.id.stop25);
        ImageView play26 = (ImageView) findViewById(R.id.play26);
        ImageView stop26 = (ImageView) findViewById(R.id.stop26);
        ImageView play27 = (ImageView) findViewById(R.id.play27);
        ImageView stop27 = (ImageView) findViewById(R.id.stop27);
        ImageView play28 = (ImageView) findViewById(R.id.play28);
        ImageView stop28 = (ImageView) findViewById(R.id.stop28);
        ImageView play29 = (ImageView) findViewById(R.id.play29);
        ImageView stop29 = (ImageView) findViewById(R.id.stop29);
        ImageView play30 = (ImageView) findViewById(R.id.play30);
        ImageView stop30 = (ImageView) findViewById(R.id.stop30);
        ImageView play31 = (ImageView) findViewById(R.id.play31);
        ImageView stop31 = (ImageView) findViewById(R.id.stop31);
        ImageView play32 = (ImageView) findViewById(R.id.play32);
        ImageView stop32 = (ImageView) findViewById(R.id.stop32);
        ImageView play33 = (ImageView) findViewById(R.id.play33);
        ImageView stop33 = (ImageView) findViewById(R.id.stop33);
        ImageView play34 = (ImageView) findViewById(R.id.play34);
        ImageView stop34 = (ImageView) findViewById(R.id.stop34);
        ImageView play35 = (ImageView) findViewById(R.id.play35);
        ImageView stop35 = (ImageView) findViewById(R.id.stop35);
        ImageView play36 = (ImageView) findViewById(R.id.play36);
        ImageView stop36 = (ImageView) findViewById(R.id.stop36);
        ImageView play37 = (ImageView) findViewById(R.id.play37);
        ImageView stop37 = (ImageView) findViewById(R.id.stop37);
        ImageView play38 = (ImageView) findViewById(R.id.play38);
        ImageView stop38 = (ImageView) findViewById(R.id.stop38);
        ImageView play39 = (ImageView) findViewById(R.id.play39);
        ImageView stop39 = (ImageView) findViewById(R.id.stop39);

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
        play18.setOnClickListener(this);
        stop18.setOnClickListener(this);
        play19.setOnClickListener(this);
        stop19.setOnClickListener(this);
        play20.setOnClickListener(this);
        stop20.setOnClickListener(this);
        play21.setOnClickListener(this);
        stop21.setOnClickListener(this);
        play22.setOnClickListener(this);
        stop22.setOnClickListener(this);
        play23.setOnClickListener(this);
        stop23.setOnClickListener(this);
        play24.setOnClickListener(this);
        stop24.setOnClickListener(this);
        play25.setOnClickListener(this);
        stop25.setOnClickListener(this);
        play26.setOnClickListener(this);
        stop26.setOnClickListener(this);
        play27.setOnClickListener(this);
        stop27.setOnClickListener(this);
        play28.setOnClickListener(this);
        stop28.setOnClickListener(this);
        play29.setOnClickListener(this);
        stop29.setOnClickListener(this);
        play30.setOnClickListener(this);
        stop30.setOnClickListener(this);
        play31.setOnClickListener(this);
        stop31.setOnClickListener(this);
        play32.setOnClickListener(this);
        stop32.setOnClickListener(this);
        play33.setOnClickListener(this);
        stop33.setOnClickListener(this);
        play34.setOnClickListener(this);
        stop34.setOnClickListener(this);
        play35.setOnClickListener(this);
        stop35.setOnClickListener(this);
        play36.setOnClickListener(this);
        stop36.setOnClickListener(this);
        play37.setOnClickListener(this);
        stop37.setOnClickListener(this);
        play38.setOnClickListener(this);
        stop38.setOnClickListener(this);
        play39.setOnClickListener(this);
        stop39.setOnClickListener(this);
    }

    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.play1) {
            mediaPlayer1 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara1.mp3?alt=media&token=624fe64f-49bc-4154-87d9-95fa530f205a"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay1.setVisibility(View.GONE);
            btnPause1.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop1) {
            if (mediaPlayer1.isPlaying()) {
                mediaPlayer1.pause();
                mediaPlayer1.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay1.setVisibility(View.VISIBLE);
                btnPause1.setVisibility(View.GONE);
            }
        } else if (id == R.id.play2) {
            mediaPlayer2 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara2.mp3?alt=media&token=c05e2d56-c775-4349-bcf8-a19653bcbb61"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay2.setVisibility(View.GONE);
            btnPause2.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop2) {
            if (mediaPlayer2.isPlaying()) {
                mediaPlayer2.pause();
                mediaPlayer2.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay2.setVisibility(View.VISIBLE);
                btnPause2.setVisibility(View.GONE);
            }
        } else if (id == R.id.play3) {
            mediaPlayer3 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara3.mp3?alt=media&token=4e752f09-2dcc-4a59-90b5-6704482aa2ce"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay3.setVisibility(View.GONE);
            btnPause3.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop3) {
            if (mediaPlayer3.isPlaying()) {
                mediaPlayer3.pause();
                mediaPlayer3.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay3.setVisibility(View.VISIBLE);
                btnPause3.setVisibility(View.GONE);
            }
        } else if (id == R.id.play4) {
            mediaPlayer4 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara4.mp3?alt=media&token=ae32d398-c0d2-409c-9dff-6f9a16e4c644"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay4.setVisibility(View.GONE);
            btnPause4.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop4) {
            if (mediaPlayer4.isPlaying()) {
                mediaPlayer4.pause();
                mediaPlayer4.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay4.setVisibility(View.VISIBLE);
                btnPause4.setVisibility(View.GONE);
            }
        } else if (id == R.id.play5) {
            mediaPlayer5 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara5.mp3?alt=media&token=cc3d1708-ab67-4ca3-9f9a-0b76a5cb773e"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay5.setVisibility(View.GONE);
            btnPause5.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop5) {
            if (mediaPlayer5.isPlaying()) {
                mediaPlayer5.pause();
                mediaPlayer5.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay5.setVisibility(View.VISIBLE);
                btnPause5.setVisibility(View.GONE);
            }
        }
        else if (id == R.id.play6) {
            mediaPlayer6 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara6.mp3?alt=media&token=6457db75-7df3-4162-a0d4-32ef18819b13"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay6.setVisibility(View.GONE);
            btnPause6.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop6) {
            if (mediaPlayer6.isPlaying()) {
                mediaPlayer6.pause();
                mediaPlayer6.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay6.setVisibility(View.VISIBLE);
                btnPause6.setVisibility(View.GONE);
            }
        }else if (id == R.id.play7) {
            mediaPlayer7 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara7.mp3?alt=media&token=c5664567-a0e9-4479-9bc6-86ef3a7e0e3a"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay7.setVisibility(View.GONE);
            btnPause7.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop7) {
            if (mediaPlayer7.isPlaying()) {
                mediaPlayer7.pause();
                mediaPlayer7.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay7.setVisibility(View.VISIBLE);
                btnPause7.setVisibility(View.GONE);
            }
        }else if (id == R.id.play8) {
            mediaPlayer8 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara8.mp3?alt=media&token=b5e67a69-940f-4c61-8861-a9176728b866"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay8.setVisibility(View.GONE);
            btnPause8.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop8) {
            if (mediaPlayer8.isPlaying()) {
                mediaPlayer8.pause();
                mediaPlayer8.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay8.setVisibility(View.VISIBLE);
                btnPause8.setVisibility(View.GONE);
            }
        } else if (id == R.id.play9) {
            mediaPlayer9 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara9.mp3?alt=media&token=d0cbcea9-6084-475c-941b-65ae71692842"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay9.setVisibility(View.GONE);
            btnPause9.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop9) {
            if (mediaPlayer9.isPlaying()) {
                mediaPlayer9.pause();
                mediaPlayer9.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay9.setVisibility(View.VISIBLE);
                btnPause9.setVisibility(View.GONE);
            }
        } else if (id == R.id.play10) {
            mediaPlayer10 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara10.mp3?alt=media&token=d3282a95-02a7-40ec-9588-65676dad40ab"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay10.setVisibility(View.GONE);
            btnPause10.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop10) {
            if (mediaPlayer10.isPlaying()) {
                mediaPlayer10.pause();
                mediaPlayer10.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay10.setVisibility(View.VISIBLE);
                btnPause10.setVisibility(View.GONE);
            }
        } else if (id == R.id.play11) {
            mediaPlayer11 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara11.mp3?alt=media&token=f75b08f7-3783-46ee-9fcb-92c2e638060e"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay11.setVisibility(View.GONE);
            btnPause11.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop11) {
            if (mediaPlayer11.isPlaying()) {
                mediaPlayer11.pause();
                mediaPlayer11.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay11.setVisibility(View.VISIBLE);
                btnPause11.setVisibility(View.GONE);
            }
        } else if (id == R.id.play12) {
            mediaPlayer12 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara12.mp3?alt=media&token=eff7cb81-4660-451c-8314-88372cbefd83"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay12.setVisibility(View.GONE);
            btnPause12.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop12) {
            if (mediaPlayer12.isPlaying()) {
                mediaPlayer12.pause();
                mediaPlayer12.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay12.setVisibility(View.VISIBLE);
                btnPause12.setVisibility(View.GONE);
            }
        } else if (id == R.id.play13) {
            mediaPlayer13 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara13.mp3?alt=media&token=01a52903-ba6a-41df-a96d-dad19ebc152a"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay13.setVisibility(View.GONE);
            btnPause13.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop13) {
            if (mediaPlayer13.isPlaying()) {
                mediaPlayer13.pause();
                mediaPlayer13.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay13.setVisibility(View.VISIBLE);
                btnPause13.setVisibility(View.GONE);
            }
        } else if (id == R.id.play14) {
            mediaPlayer14 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara14.mp3?alt=media&token=e61a4705-e84b-4dcd-967b-298e1c85454e"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay14.setVisibility(View.GONE);
            btnPause14.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop14) {
            if (mediaPlayer14.isPlaying()) {
                mediaPlayer14.pause();
                mediaPlayer14.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay14.setVisibility(View.VISIBLE);
                btnPause14.setVisibility(View.GONE);
            }
        } else if (id == R.id.play15) {
            mediaPlayer15 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara15.mp3?alt=media&token=14439a47-4724-4028-b4bc-43d12f66fdd9"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay15.setVisibility(View.GONE);
            btnPause15.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop15) {
            if (mediaPlayer15.isPlaying()) {
                mediaPlayer15.pause();
                mediaPlayer15.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay15.setVisibility(View.VISIBLE);
                btnPause15.setVisibility(View.GONE);
            }
        } else if (id == R.id.play16) {
            mediaPlayer16 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara16.mp3?alt=media&token=d5b7f5ff-fd0d-44a6-956d-89da8fc1068a"));
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay16.setVisibility(View.GONE);
            btnPause16.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop16) {
            if (mediaPlayer16.isPlaying()) {
                mediaPlayer16.pause();
                mediaPlayer16.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay16.setVisibility(View.VISIBLE);
                btnPause16.setVisibility(View.GONE);
            }
        } else if (id == R.id.play17) {
            mediaPlayer17 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara17.mp3?alt=media&token=568e1fce-14ad-4414-92b1-53a1a6bb37d6"));
            if (mediaPlayer17.isPlaying()) {
                mediaPlayer18.pause();
                mediaPlayer18.seekTo(0);
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
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay17.setVisibility(View.GONE);
            btnPause17.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop17) {
            if (mediaPlayer17.isPlaying()) {
                mediaPlayer17.pause();
                mediaPlayer17.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay17.setVisibility(View.VISIBLE);
                btnPause17.setVisibility(View.GONE);
            }
        } else if (id == R.id.play18) {
            mediaPlayer18 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara18.mp3?alt=media&token=eadf1135-4507-4f2f-ba7c-2275eb09ab94"));
            if (mediaPlayer18.isPlaying()) {
                mediaPlayer19.pause();
                mediaPlayer19.seekTo(0);
            }

            try {
                mediaPlayer18.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer18.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay18.setVisibility(View.GONE);
            btnPause18.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop18) {
            if (mediaPlayer18.isPlaying()) {
                mediaPlayer18.pause();
                mediaPlayer18.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay18.setVisibility(View.VISIBLE);
                btnPause18.setVisibility(View.GONE);
            }
        } else if (id == R.id.play19) {
            mediaPlayer19 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara19.mp3?alt=media&token=55249147-be28-4802-bd5d-c21b672906b3"));
            if (mediaPlayer19.isPlaying()) {
                mediaPlayer20.pause();
                mediaPlayer20.seekTo(0);
            }

            try {
                mediaPlayer19.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer19.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay19.setVisibility(View.GONE);
            btnPause19.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop19) {
            if (mediaPlayer19.isPlaying()) {
                mediaPlayer19.pause();
                mediaPlayer19.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay19.setVisibility(View.VISIBLE);
                btnPause19.setVisibility(View.GONE);
            }
        } else if (id == R.id.play20) {
            mediaPlayer20 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara20.mp3?alt=media&token=21621725-a377-4461-86b4-f1e2356fe47b"));
            if (mediaPlayer20.isPlaying()) {
                mediaPlayer21.pause();
                mediaPlayer21.seekTo(0);
            }

            try {
                mediaPlayer20.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer20.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay20.setVisibility(View.GONE);
            btnPause20.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop20) {
            if (mediaPlayer20.isPlaying()) {
                mediaPlayer20.pause();
                mediaPlayer20.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay20.setVisibility(View.VISIBLE);
                btnPause20.setVisibility(View.GONE);
            }
        } else if (id == R.id.play21) {
            mediaPlayer21 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara21.mp3?alt=media&token=83af7c8a-e0ff-4e87-a1df-db25b86d9b0e"));
            if (mediaPlayer21.isPlaying()) {
                mediaPlayer22.pause();
                mediaPlayer22.seekTo(0);
            }

            try {
                mediaPlayer21.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer21.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay21.setVisibility(View.GONE);
            btnPause21.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop21) {
            if (mediaPlayer21.isPlaying()) {
                mediaPlayer21.pause();
                mediaPlayer21.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay21.setVisibility(View.VISIBLE);
                btnPause21.setVisibility(View.GONE);
            }
        } else if (id == R.id.play22) {
            mediaPlayer22 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara22.mp3?alt=media&token=808314a2-5956-4ac3-9a6f-9d2c566128cb"));
            if (mediaPlayer22.isPlaying()) {
                mediaPlayer23.pause();
                mediaPlayer23.seekTo(0);
            }

            try {
                mediaPlayer22.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer22.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay22.setVisibility(View.GONE);
            btnPause22.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop22) {
            if (mediaPlayer22.isPlaying()) {
                mediaPlayer22.pause();
                mediaPlayer22.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay22.setVisibility(View.VISIBLE);
                btnPause22.setVisibility(View.GONE);
            }
        } else if (id == R.id.play23) {
            mediaPlayer23 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara23.mp3?alt=media&token=8750ba19-391e-449b-a839-3710f02c7b21"));
            if (mediaPlayer23.isPlaying()) {
                mediaPlayer24.pause();
                mediaPlayer24.seekTo(0);
            }

            try {
                mediaPlayer23.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer23.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay23.setVisibility(View.GONE);
            btnPause23.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop23) {
            if (mediaPlayer23.isPlaying()) {
                mediaPlayer23.pause();
                mediaPlayer23.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay23.setVisibility(View.VISIBLE);
                btnPause23.setVisibility(View.GONE);
            }
        } else if (id == R.id.play24) {
            mediaPlayer24 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara24.mp3?alt=media&token=22570597-405c-4bf3-a135-117ee6d82ceb"));
            if (mediaPlayer24.isPlaying()) {
                mediaPlayer25.pause();
                mediaPlayer25.seekTo(0);
            }

            try {
                mediaPlayer24.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer24.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay24.setVisibility(View.GONE);
            btnPause24.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop24) {
            if (mediaPlayer24.isPlaying()) {
                mediaPlayer24.pause();
                mediaPlayer24.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay24.setVisibility(View.VISIBLE);
                btnPause24.setVisibility(View.GONE);
            }
        } else if (id == R.id.play25) {
            mediaPlayer25 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara25.mp3?alt=media&token=3a97ebf9-0c6c-4a62-b4e6-e7aa891e14f5"));
            if (mediaPlayer25.isPlaying()) {
                mediaPlayer26.pause();
                mediaPlayer26.seekTo(0);
            }

            try {
                mediaPlayer25.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer25.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay25.setVisibility(View.GONE);
            btnPause25.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop25) {
            if (mediaPlayer25.isPlaying()) {
                mediaPlayer25.pause();
                mediaPlayer25.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay25.setVisibility(View.VISIBLE);
                btnPause25.setVisibility(View.GONE);
            }
        } else if (id == R.id.play26) {
            mediaPlayer26 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara26.mp3?alt=media&token=ce97f79f-49ff-4713-af58-08018cebe352"));
            if (mediaPlayer26.isPlaying()) {
                mediaPlayer27.pause();
                mediaPlayer27.seekTo(0);
            }

            try {
                mediaPlayer26.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer26.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay26.setVisibility(View.GONE);
            btnPause26.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop26) {
            if (mediaPlayer26.isPlaying()) {
                mediaPlayer26.pause();
                mediaPlayer26.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay26.setVisibility(View.VISIBLE);
                btnPause26.setVisibility(View.GONE);
            }
        } else if (id == R.id.play27) {
            mediaPlayer27 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara27.mp3?alt=media&token=0a6737c8-6d49-4f95-b7f2-d51b8df9f020"));
            if (mediaPlayer27.isPlaying()) {
                mediaPlayer28.pause();
                mediaPlayer28.seekTo(0);
            }

            try {
                mediaPlayer27.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer27.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay27.setVisibility(View.GONE);
            btnPause27.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop27) {
            if (mediaPlayer27.isPlaying()) {
                mediaPlayer27.pause();
                mediaPlayer27.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay27.setVisibility(View.VISIBLE);
                btnPause27.setVisibility(View.GONE);
            }
        } else if (id == R.id.play28) {
            mediaPlayer28 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara28.mp3?alt=media&token=f0941651-e18f-4b77-99e9-1a674c0c38d8"));
            if (mediaPlayer28.isPlaying()) {
                mediaPlayer29.pause();
                mediaPlayer29.seekTo(0);
            }

            try {
                mediaPlayer28.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer28.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay28.setVisibility(View.GONE);
            btnPause28.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop28) {
            if (mediaPlayer28.isPlaying()) {
                mediaPlayer28.pause();
                mediaPlayer28.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay28.setVisibility(View.VISIBLE);
                btnPause28.setVisibility(View.GONE);
            }
        } else if (id == R.id.play29) {
            mediaPlayer29 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara29.mp3?alt=media&token=5b336286-878e-4e5e-b534-03812d34f237"));
            if (mediaPlayer29.isPlaying()) {
                mediaPlayer30.pause();
                mediaPlayer30.seekTo(0);
            }

            try {
                mediaPlayer29.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer29.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay29.setVisibility(View.GONE);
            btnPause29.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop29) {
            if (mediaPlayer29.isPlaying()) {
                mediaPlayer29.pause();
                mediaPlayer29.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay29.setVisibility(View.VISIBLE);
                btnPause29.setVisibility(View.GONE);
            }
        } else if (id == R.id.play30) {
            mediaPlayer30 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara30.mp3?alt=media&token=f85c45d4-6451-46f5-9c3b-442386f09fc4"));
            if (mediaPlayer30.isPlaying()) {
                mediaPlayer31.pause();
                mediaPlayer31.seekTo(0);
            }

            try {
                mediaPlayer30.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer30.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay30.setVisibility(View.GONE);
            btnPause30.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop30) {
            if (mediaPlayer30.isPlaying()) {
                mediaPlayer30.pause();
                mediaPlayer30.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay30.setVisibility(View.VISIBLE);
                btnPause30.setVisibility(View.GONE);
            }
        } else if (id == R.id.play31) {
            mediaPlayer31 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara31.mp3?alt=media&token=3a83a690-fb02-4f7b-9df9-ca7a2572a3f0"));
            if (mediaPlayer31.isPlaying()) {
                mediaPlayer32.pause();
                mediaPlayer32.seekTo(0);
            }

            try {
                mediaPlayer31.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer31.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay31.setVisibility(View.GONE);
            btnPause31.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop31) {
            if (mediaPlayer31.isPlaying()) {
                mediaPlayer31.pause();
                mediaPlayer31.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay31.setVisibility(View.VISIBLE);
                btnPause31.setVisibility(View.GONE);
            }
        } else if (id == R.id.play32) {
            mediaPlayer32 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara40.mp3?alt=media&token=34279532-9cca-4803-b593-4eb06db13e85"));
            if (mediaPlayer32.isPlaying()) {
                mediaPlayer33.pause();
                mediaPlayer33.seekTo(0);
            }

            try {
                mediaPlayer32.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer32.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay32.setVisibility(View.GONE);
            btnPause32.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop32) {
            if (mediaPlayer32.isPlaying()) {
                mediaPlayer32.pause();
                mediaPlayer32.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay32.setVisibility(View.VISIBLE);
                btnPause32.setVisibility(View.GONE);
            }
        } else if (id == R.id.play33) {
            mediaPlayer33 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara33.mp3?alt=media&token=de00218a-3eab-46ec-ba54-10e3772917d8"));
            if (mediaPlayer33.isPlaying()) {
                mediaPlayer34.pause();
                mediaPlayer34.seekTo(0);
            }

            try {
                mediaPlayer33.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer33.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay33.setVisibility(View.GONE);
            btnPause33.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop33) {
            if (mediaPlayer33.isPlaying()) {
                mediaPlayer33.pause();
                mediaPlayer33.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay33.setVisibility(View.VISIBLE);
                btnPause33.setVisibility(View.GONE);
            }
        } else if (id == R.id.play34) {
            mediaPlayer34 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara34.mp3?alt=media&token=2d91718f-230b-4c10-923a-3f784c5cec98"));
            if (mediaPlayer34.isPlaying()) {
                mediaPlayer35.pause();
                mediaPlayer35.seekTo(0);
            }

            try {
                mediaPlayer34.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer34.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay34.setVisibility(View.GONE);
            btnPause34.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop34) {
            if (mediaPlayer34.isPlaying()) {
                mediaPlayer34.pause();
                mediaPlayer34.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay34.setVisibility(View.VISIBLE);
                btnPause34.setVisibility(View.GONE);
            }
        } else if (id == R.id.play35) {
            mediaPlayer35 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara35.mp3?alt=media&token=aefc2893-c0e9-4403-a653-96a46e96e924"));
            if (mediaPlayer35.isPlaying()) {
                mediaPlayer36.pause();
                mediaPlayer36.seekTo(0);
            }

            try {
                mediaPlayer35.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer35.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay35.setVisibility(View.GONE);
            btnPause35.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop35) {
            if (mediaPlayer35.isPlaying()) {
                mediaPlayer35.pause();
                mediaPlayer35.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay35.setVisibility(View.VISIBLE);
                btnPause35.setVisibility(View.GONE);
            }
        } else if (id == R.id.play36) {
            mediaPlayer36 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara36.mp3?alt=media&token=d98875b7-7d20-4a91-b0fe-70e1cd85156e"));
            if (mediaPlayer36.isPlaying()) {
                mediaPlayer37.pause();
                mediaPlayer37.seekTo(0);
            }

            try {
                mediaPlayer36.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer36.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay36.setVisibility(View.GONE);
            btnPause36.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop36) {
            if (mediaPlayer36.isPlaying()) {
                mediaPlayer36.pause();
                mediaPlayer36.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay36.setVisibility(View.VISIBLE);
                btnPause36.setVisibility(View.GONE);
            }
        } else if (id == R.id.play37) {
            mediaPlayer37 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara37.mp3?alt=media&token=5d9c1fbb-dbb6-4e87-b791-52cbc89ea577"));
            if (mediaPlayer37.isPlaying()) {
                mediaPlayer38.pause();
                mediaPlayer38.seekTo(0);
            }

            try {
                mediaPlayer37.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer37.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay37.setVisibility(View.GONE);
            btnPause37.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop37) {
            if (mediaPlayer37.isPlaying()) {
                mediaPlayer37.pause();
                mediaPlayer37.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay37.setVisibility(View.VISIBLE);
                btnPause37.setVisibility(View.GONE);
            }
        } else if (id == R.id.play38) {
            mediaPlayer38 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara38.mp3?alt=media&token=341928f9-76a8-49e1-a6d7-3fd931cb09e6"));
            if (mediaPlayer38.isPlaying()) {
                mediaPlayer39.pause();
                mediaPlayer39.seekTo(0);
            }

            try {
                mediaPlayer38.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer38.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay38.setVisibility(View.GONE);
            btnPause38.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop38) {
            if (mediaPlayer38.isPlaying()) {
                mediaPlayer38.pause();
                mediaPlayer38.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay38.setVisibility(View.VISIBLE);
                btnPause38.setVisibility(View.GONE);
            }
        } else if (id == R.id.play39) {
            mediaPlayer39 = MediaPlayer.create(this, Uri.parse("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsuara39.mp3?alt=media&token=73df7f17-1221-442a-9067-1636dcd2ccdf"));
            if (mediaPlayer39.isPlaying()) {
                mediaPlayer38.pause();
                mediaPlayer38.seekTo(0);
            }

            try {
                mediaPlayer39.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /** Menjalankan Audio */
            mediaPlayer39.start();
            Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
            btnPlay39.setVisibility(View.GONE);
            btnPause39.setVisibility(View.VISIBLE);
        } else if (id == R.id.stop39) {
            if (mediaPlayer39.isPlaying()) {
                mediaPlayer39.pause();
                mediaPlayer39.seekTo(0);
                Toast.makeText(Burung10.this, "Stop Audio", Toast.LENGTH_SHORT).show();
                btnPlay39.setVisibility(View.VISIBLE);
                btnPause39.setVisibility(View.GONE);
            }
        }



    }




//    public void play_song (View v) {
//        MediaPlayer mediaPlayer = new MediaPlayer();
//        try {
//            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/aplsuaraburung.appspot.com/o/burunglain%2Fsample.mp3?alt=media&token=52604cc8-9826-4c99-8fc5-df88fa2a3e1d");
//            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//                @Override
//                public void onPrepared(MediaPlayer mp) {
//                    mp.start();
//                    Toast.makeText(Burung10.this, "Playing Audio", Toast.LENGTH_SHORT).show();
//                }
//            });
//            mediaPlayer.prepare();
//        } catch (IOException e) {
//            e.printStackTrace();
//            Toast.makeText(this, "Error Occured", Toast.LENGTH_SHORT).show();
//        }
//    }

    public void onBackPressed() {
        startActivity(new Intent(Burung10.this, HalamanUtama.class));
    }
}
