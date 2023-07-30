package com.example.new_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t0,plus,minus,div,mul,per,ac,c,btxt,stxt,equal;
    int i=0,cnt=0,n1=0,n2=0,ans;
    String s1="",s2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t0 = findViewById(R.id.t0);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
        t9 = findViewById(R.id.t9);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        per = findViewById(R.id.per);
        ac = findViewById(R.id.ac);
        c = findViewById(R.id.c);
        btxt = findViewById(R.id.btxt);
        stxt = findViewById(R.id.stxt);
        equal = findViewById(R.id.equal);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1==0) {
                    s1 += "1";
                    stxt.setText("" + s1);
                }else {
                    s2 += "1";
                    stxt.setText(""+s1+s2);
                }
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1==0) {
                    s1 += "2";
                    stxt.setText(""+s1);
                }else {
                    s2 += "2";
                    stxt.setText(""+s1+s2);
                }
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1==0) {
                    s1 += "3";
                    stxt.setText("" + s1);
                }else {
                    s2 += "3";
                    stxt.setText(""+s1+s2);
                }
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1==0) {
                    s1 += "4";
                    stxt.setText("" + s1);
                }else {
                    s2 += "4";
                    stxt.setText(""+s1+s2);
                }
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1==0) {
                    s1 += "5";
                    stxt.setText("" + s1);
                }else {
                    s2 += "5";
                    stxt.setText(""+s1+s2);
                }
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1==0) {
                    s1 += "6";
                    stxt.setText("" + s1);
                }else {
                    s2 += "6";
                    stxt.setText(""+s1+s2);
                }
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1==0) {
                    s1 += "7";
                    stxt.setText("" + s1);
                }else {
                    s2 += "7";
                    stxt.setText(""+s1+s2);
                }
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1==0) {
                    s1 += "8";
                    stxt.setText("" + s1);
                }else {
                    s2 += "8";
                    stxt.setText(""+s1+s2);
                }
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1==0) {
                    s1 += "9";
                    stxt.setText("" + s1);
                }else {
                    s2 += "9";
                    stxt.setText(""+s1+s2);
                }
            }
        });
        t0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1==0) {
                    s1 += "0";
                    stxt.setText("" + s1);
                }else {
                    s2 += "0";
                    stxt.setText(""+s1+s2);
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(s1.toString());
                s1+="+";
                stxt.setText(""+s1);
                cnt=1;
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(s1.toString());
                s1+="-";
                stxt.setText(""+s1);
                cnt=2;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(s1.toString());
                s1+="÷";
                stxt.setText(""+s1);
                cnt=3;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(s1.toString());
                s1+="×";
                stxt.setText(""+s1);
                cnt=4;
            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(s1.toString());
                s1+="%";
                stxt.setText(""+s1);
                cnt=5;
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2 = Integer.parseInt(s2.toString());
                if(cnt==1){
                    ans=n1+n2;
                    btxt.setText(""+ans);
                } else if (cnt==2) {
                    ans=n1-n2;
                    btxt.setText(""+ans);
                } else if (cnt==3) {
                    ans=n1/n2;
                    btxt.setText(""+ans);
                } else if (cnt==4) {
                    ans=n1*n2;
                    btxt.setText(""+ans);
                } else if (cnt==5) {
                    ans=(n1*n2)/100;
                    btxt.setText(""+ans);
                }

                s1="";s2="";n1=0;n2=0;ans=0;
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1="";
                s2="";
                stxt.setText(""+s1+s2);
                btxt.setText("");
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(s2=="") {
                    s1 = s1.substring(0, stxt.getText().length() - 1);
                    stxt.setText("" + s1);
                }else {
                    s2 = stxt.getText().toString();
                    String s[]=s2.split("X");
//                    for(int i=0;i<s.length;i++)
//                    {
//                        System.out.println("Split="+s[i]);
//                    }
                    System.out.println("Split="+s[0]);
                    stxt.setText("" + s1+s2);
                }
            }
        });
    }
}