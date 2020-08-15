package app.gss.aplsuaraburung;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import app.gss.aplsuaraburung.R;

public class HalamanUtama extends AppCompatActivity implements View.OnClickListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1= (Button) findViewById(R.id.burung1);
        Button btn2= (Button) findViewById(R.id.burung2);
        Button btn3= (Button) findViewById(R.id.burung3);
        Button btn4= (Button) findViewById(R.id.burung4);
        Button btn5= (Button) findViewById(R.id.burung5);
        Button btn6= (Button) findViewById(R.id.burung6);
        Button btn7= (Button) findViewById(R.id.burung7);
        Button btn8= (Button) findViewById(R.id.burung8);
        Button btn9= (Button) findViewById(R.id.burung9);
        Button btn10= (Button) findViewById(R.id.burung10);
        Button btn11= (Button) findViewById(R.id.keluar);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HalamanUtama.this, Burung1.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HalamanUtama.this, Burung2.class));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HalamanUtama.this, Burung3.class));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HalamanUtama.this, Burung4.class));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HalamanUtama.this, Burung5.class));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HalamanUtama.this, Burung6.class));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HalamanUtama.this, Burung7.class));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HalamanUtama.this, Burung8.class));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HalamanUtama.this, Burung9.class));
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HalamanUtama.this, Burung10.class));
            }
        });
        btn11.setOnClickListener(this);
    }

    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.burung1) {
            startActivity(new Intent(this, Burung1.class));
            finish();
        } else if (id == R.id.burung2) {
            startActivity(new Intent(this, Burung2.class));
            finish();
        } else if (id == R.id.burung3) {
            startActivity(new Intent(this, Burung3.class));
            finish();
        } else if (id == R.id.burung4) {
            startActivity(new Intent(this, Burung4.class));
            finish();
        } else if (id == R.id.burung5) {
            startActivity(new Intent(this, Burung5.class));
            finish();
        } else if (id == R.id.burung6) {
            startActivity(new Intent(this, Burung6.class));
            finish();
        } else if (id == R.id.burung7) {
            startActivity(new Intent(this, Burung7.class));
            finish();
        } else if (id == R.id.burung8) {
            startActivity(new Intent(this, Burung8.class));
            finish();
        } else if (id == R.id.burung9) {
            startActivity(new Intent(this, Burung9.class));
            finish();
        } else if (id == R.id.burung10) {
            startActivity(new Intent(   this, Burung10.class));
            finish();
        } else if (id == R.id.keluar) {
            AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
            alt_bld.setMessage("Anda yakin ingin keluar?").setCancelable(false)
                    .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id)
                        {
                            // Action for 'Yes' Button

                            Intent intent = new Intent(Intent.ACTION_MAIN);
                            intent.addCategory(Intent.CATEGORY_HOME);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);


                        }
                    }).setNegativeButton("TIDAK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            //Action for 'NO' Button
                        }
                    });
            AlertDialog alert = alt_bld.create();
            alert.show();
        }
    }
    public void onBackPressed() {
        AlertDialog.Builder alt_bld = new AlertDialog.Builder(this);
        alt_bld.setMessage("Anda yakin ingin keluar?").setCancelable(false)
                .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        // Action for 'Yes' Button

                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);


                    }
                }).setNegativeButton("TIDAK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        //Action for 'NO' Button
                    }
                });
        AlertDialog alert = alt_bld.create();
        alert.show();
    }
}
