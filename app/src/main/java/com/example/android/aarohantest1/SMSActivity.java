package com.example.android.aarohantest1;

import android.app.PendingIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class SMSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
    }

    public void smsSendMessage(View view) {
        EditText editText=(EditText)findViewById(R.id.editText_main);
        String destinationAddress=editText.getText().toString();
        EditText smsEditText=(EditText)findViewById(R.id.sms_message);
        String smsMessage=smsEditText.getText().toString();

        String scAddress=null;
        PendingIntent sentIntent=null, deliveryIntent=null;
        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage(destinationAddress,scAddress,smsMessage,sentIntent,deliveryIntent);

    }
}
