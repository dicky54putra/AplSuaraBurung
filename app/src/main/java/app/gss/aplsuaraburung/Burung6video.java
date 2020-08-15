package app.gss.aplsuaraburung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import app.gss.aplsuaraburung.R;

public class Burung6video extends AppCompatActivity {

    ImageButton btnPlay1, btnPlay2, btnPlay3, btnPlay4, btnPlay5, btnPlay6, btnPlay7, btnPlay8, btnPlay9, btnPlay10, btnPlay11, btnPlay12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burung6video);
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

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=IJQ8Lmay0ts"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eReC9vq7P5Q"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=abye7Iwttf4"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=w_aDGB3jGCs"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=c1cmsUrqNlM"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=E1wTapI1YrU"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=5ljkRCGAJO4"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=HjrAZTOpwxg"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=qQxBaJEbQxo"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=vruzFqaS8lM"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

    }

    public void onBackPressed() {
        startActivity(new Intent(Burung6video.this, Burung6.class));
        finish();
    }
}