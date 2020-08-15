package app.gss.aplsuaraburung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import app.gss.aplsuaraburung.R;

public class Burung9video extends AppCompatActivity {

    ImageButton btnPlay1, btnPlay2, btnPlay3, btnPlay4, btnPlay5, btnPlay6, btnPlay7, btnPlay8, btnPlay9, btnPlay10, btnPlay11, btnPlay12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burung9video);
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

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=68ep6cdjvE8"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=LqhK8_Qziy4"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6IHktswVZ_o"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=4HvYkNu_5zE"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=TJBG8jfOUPg"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=8eNRfy7XtPo"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=CKViJZUs4vI"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=rhQIT0vK7SY"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7b6igPZ5U_s"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=vo25BtbqMiI"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=adGmmr6IPss"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });

        btnPlay12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=wVMIfammjo0"));
                intent1.putExtra("force_fullscreen",true);
                startActivityForResult(intent1, 0);

            }
        });
    }

    public void onBackPressed() {
        startActivity(new Intent(Burung9video.this, Burung9.class));
        finish();
    }
}
