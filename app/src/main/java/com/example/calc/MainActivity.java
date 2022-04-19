package com.example.calc;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bm,ba,bd,bs,beq,bdel,bpt,bac;
    TextView text;
    String tview="",sign="";
    double sum=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=(Button) findViewById(R.id.bt0);
        b1=(Button) findViewById(R.id.bt1);
        b2=(Button) findViewById(R.id.bt2);
        b3=(Button) findViewById(R.id.bt3);
        b4=(Button) findViewById(R.id.bt4);
        b5=(Button) findViewById(R.id.bt5);
        b6=(Button) findViewById(R.id.bt6);
        b7=(Button) findViewById(R.id.bt7);
        b8=(Button) findViewById(R.id.bt8);
        b9=(Button) findViewById(R.id.bt9);
        bm=(Button) findViewById(R.id.mul);
        ba=(Button) findViewById(R.id.add);
        bd=(Button) findViewById(R.id.dev);
        bs=(Button) findViewById(R.id.sub);
        beq=(Button) findViewById(R.id.eql);
        bdel=(Button) findViewById(R.id.del);
        bpt=(Button) findViewById(R.id.point);
        bac=(Button) findViewById(R.id.ac);
        text= findViewById(R.id.txt);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tview+="0";
                text.setText(tview);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tview+="1";
                text.setText(tview);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tview+="2";
                text.setText(tview);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tview+="3";
                text.setText(tview);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tview+="4";
                text.setText(tview);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tview+="5";
                text.setText(tview);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tview+="6";
                text.setText(tview);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tview+="7";
                text.setText(tview);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tview+="8";
                text.setText(tview);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tview+="9";
                text.setText(tview);
            }
        });
        bpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tview+=".";
                text.setText(tview);
            }
        });
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tview.length()>0)
                    tview=tview.substring(0,tview.length()-1);
                text.setText(tview);
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tview.length()>0) {
                    tview += "+";
                    sign = "+";
                    text.setText(tview);
                }
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tview.length()>0) {
                    tview += "*";
                    sign = "*";
                    text.setText(tview);
                }
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tview.length()>0) {
                    tview += "/";
                    sign = "/";
                    text.setText(tview);
                }
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tview.length()>0) {
                    tview += "-";
                    sign = "-";
                    text.setText(tview);
                }
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tview="";
                text.setText(tview);
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tview.length()>0 && tview.indexOf(sign)>0) {
                    int indx=tview.indexOf(sign);
                    String a="",b="";
                    a=tview.substring(0,indx);
                    if(tview.charAt(tview.length()-1)=='+' || tview.charAt(tview.length()-1)=='-' || tview.charAt(tview.length()-1)=='/' || tview.charAt(tview.length()-1)=='*')
                        tview=tview.substring(0,tview.length()-1);
                    else {
                        b = tview.substring(indx + 1, tview.length());
                        sum = Double.parseDouble(a);
                        if (sign.equals("+"))
                            sum += Double.parseDouble(b);
                        else if (sign.equals("-"))
                            sum -= Double.parseDouble(b);
                        else if (sign.equals("/"))
                            sum /= Double.parseDouble(b);
                        else
                            sum *= Double.parseDouble(b);
                        int indpoint = tview.indexOf(".");
                        if (indpoint > 0)
                            tview = Double.toString(sum);
                        else {
                            int s = (int) sum;
                            tview = Integer.toString(s);
                        }
                        text.setText(tview);
                    }
                }
            }
        });
    }
}