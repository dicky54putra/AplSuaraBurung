package app.gss.aplsuaraburung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import app.gss.aplsuaraburung.R;

public class Burung3video extends AppCompatActivity {

    ImageButton btnPlay1, btnPlay2, btnPlay3, btnPlay4, btnPlay5, btnPlay6, btnPlay7, btnPlay8, btnPlay9, btnPlay10, btnPlay11, btnPlay12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burung3video);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        btnPlay1 = findViewById(R.id.play1);
        btnPlay2 = findViewById(R.id.play2);
        btnPlay3 = findViewById(R.id.play3);
        btnPlay4 = findViewById(R.id.play4);
        btnPlay5 = findViewById(R.id.play5);
        btnPlay6 = findViewById(R.id.play6);
        btnPlay7 = findViewById(R.id.play7);
        btnPlay8 = findViewById(R.id.play8);
        btnPlay9 = findViewById(R.id.play9);
        btnPlay10 = findViewById(R.id.play10);
        btnPlay11 = findViewById(R.id.play11);
        btnPlay12 = findViewById(R.id.play12);

        btnPlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=h_9aO8yb9hE"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=58dNrT3morU"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=knQexA5Zja8"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=QLwg0meHgXY"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=8owWNFiGyGU"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=TzONruC4o5c"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=rAj9ExuLICg"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=onazkS6ppb4"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Oyf8aEdqvgA"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=vjc7cjsxcL4"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=v0Kmtsdw-zM"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RtfIslp32Kg"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });
    }

    public void onBackPressed() {
        startActivity(new Intent(Burung3video.this, Burung3.class));
        finish();
    }
}