package app.gss.aplsuaraburung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import app.gss.aplsuaraburung.R;

public class Splash extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this, HalamanUtama.class));
                finish();
            }
        },2000);
    }
}
