package com.example.sp20_bse_033_a2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_01, btn_02, btn_03, btn_04, btn_05, btn_06, btn_07, btn_08, btn_09, btn_00, btn_back, btn_open;
    TextView text;
    int x,y,z, n = 3;
    int firstDigit;
    int a, b, c, d, e,  f,  g;int r=5;
    int se; String h , j ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_01 = findViewById(R.id.btn_01);
        btn_02 = findViewById(R.id.btn_02);
        btn_03 = findViewById(R.id.btn_03);
        btn_04 = findViewById(R.id.btn_04);
        btn_05 = findViewById(R.id.btn_05);
        btn_06 = findViewById(R.id.btn_06);
        btn_07 = findViewById(R.id.btn_07);
        btn_08 = findViewById(R.id.btn_08);
        btn_09 = findViewById(R.id.btn_09);
        btn_00 = findViewById(R.id.btn_00);
        btn_back = findViewById(R.id.btn_back);
        btn_open = findViewById(R.id.btn_open);
        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f < 4) {
                    if (r == 5) {
                        text.setText("" + 1);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                        r++;
                    } else {
                        text.setText(e  + "" + 1);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                    }
                }
            }
        });
        btn_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f < 4) {
                    if (r == 5) {
                        text.setText("" + 2);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                        r++;
                    } else {
                        text.setText(e + "" + 2);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                    }
                }
            }
        });
        btn_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f < 4) {
                    if (r == 5) {
                        text.setText("" + 3);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                        r++;
                    } else {
                        text.setText(e + "" + 3);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                    }
                }
            }
        });
        btn_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f < 4) {
                    if (r == 5) {
                        text.setText("" + 4);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                        r++;
                    } else {
                        text.setText(e + "" + 4);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                    }
                }
            }
        });
        btn_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f < 4) {
                    if (r == 5) {
                        text.setText("" + 5);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                        r++;
                    } else {
                        text.setText(e + "" + 5);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                    }
                }
            }
        });
        btn_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f < 4) {
                    if (r == 5) {
                        text.setText("" + 6);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                        r++;
                    } else {
                        text.setText(e + "" + 6);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                    }
                }
            }
        });
        btn_07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f < 4) {
                    if (r == 5) {
                        text.setText("" + 7);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                        r++;
                    } else {
                        text.setText(e + "" + 7);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                    }
                }
            }
        });
        btn_08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f < 4) {
                    if (r == 5) {
                        text.setText("" + 8);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                        r++;
                    } else {
                        text.setText(e + "" + 8);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                    }
                }
            }
        });
        btn_09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f < 4) {
                    if (r == 5) {
                        text.setText("" + 9);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                        r++;
                    } else {
                        text.setText(e + "" + 9);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                    }
                }
            }
        });
        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f < 4) {
                    if (r == 5) {
                        text.setText("" + 0);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                        r++;
                    } else {
                        text.setText(e + "" + 0);
                        f++;
                        e = Integer.parseInt(text.getText().toString());
                    }
                }
            }
        });
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (e== 1111) {
                    Intent a = new Intent(MainActivity.this, act.class);
                    se=0;
                    n=3;
                    startActivity(a);
                } else {
                    se++;
                    Toast.makeText(MainActivity.this, "wrong password " +n+ " chances left", Toast.LENGTH_SHORT).show();
                    n--;
                }
                if (se == 5) {
                    MainActivity.this.finish();
                    System.exit(0);
                }
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(f!=0) {
                    if (f == 1){
                        text.setText("");
                        r=5;
                    }
                    if (e ==2){
                        z=Integer.parseInt(String.valueOf(String.valueOf(e).charAt(0)));
                        text.setText(""+y);
                        e= Integer.parseInt(text.getText().toString());
                    }
                    if(f==3){
                        y=Integer.parseInt(String.valueOf(String.valueOf(e).charAt(0)));
                        y=Integer.parseInt(String.valueOf(String.valueOf(e).charAt(1)));
                        text.setText(""+z+""+y);
                        e =Integer.parseInt(text.getText().toString());
                    }
                    if(f==4){
                        y=Integer.parseInt(String.valueOf(String.valueOf(e).charAt(0)));
                        y=Integer.parseInt(String.valueOf(String.valueOf(e).charAt(1)));
                        z=Integer.parseInt(String.valueOf(String.valueOf(e).charAt(2)));
                        text.setText(""+z+""+y+""+x);
                        e = Integer.parseInt(text.getText().toString());
                    }
                    f--;
                }

            }
        });
    }
}





