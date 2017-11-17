package com.example.joelwasserman.androidbleconnectexample;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class PayActivity extends Activity implements View.OnClickListener{
    //設定HTTP Get & Post要連線的Url
    private String postUrl = "http://163.18.2.157:8880";


    private Button postBtn;

    private String msg = null;  //存放要Post的訊息
    private String result;  //存放Post回傳值

    Http_Post HP;

    static Handler handler; //宣告成static讓service可以直接使用

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HP = new Http_Post();

        postBtn = (Button) findViewById(R.id.sendButton);

        //讓多個Button共用一個Listener，在Listener中再去設定各按鈕要做的事
        postBtn.setOnClickListener(this);

        //接收service傳出Post的到的回傳訊息，並透過Toast顯示出來
        handler = new Handler(){
            public void handleMessage(Message msg){
                switch (msg.what){
                    case 123:
                        break;
                }
            }
        };
    }
    //依照按下的按鈕去做相對應的任務
    public void onClick(View v){
        switch (v.getId()){

            case R.id.sendButton:

                //    HP.Post(,postUrl);

                break;
        }
    }
}