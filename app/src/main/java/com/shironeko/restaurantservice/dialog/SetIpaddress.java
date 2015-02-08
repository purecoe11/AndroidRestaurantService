package com.shironeko.restaurantservice.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.shironeko.restaurantservice.data.Data;

/**
 * Created by Ukrit on 8/2/2558.
 */
public class SetIpaddress extends Dialog{
    EditText editTextIp = null;
    Button buttonIp = null;

    public SetIpaddress(Context context) {
        super(context);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(getContext());
        editTextIp = new EditText(getContext());
        buttonIp = new Button(getContext());
        editTextIp.setHint("Old IP Address : " + Data.IpAddress);
        buttonIp.setText("OK");
        linearLayout.addView(editTextIp);
        linearLayout.addView(buttonIp);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);
        setTitle("Set Ip Address");

        buttonIp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editIp = editTextIp.getText().toString();
                if(editIp.equals(""))
                    hide();
                else
                    Data.IpAddress = editIp;

                hide();
            }
        });
    }

}
