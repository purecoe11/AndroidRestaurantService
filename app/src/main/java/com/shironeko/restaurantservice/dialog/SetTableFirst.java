package com.shironeko.restaurantservice.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.preference.Preference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.shironeko.restaurantservice.data.Data;
import com.shironeko.restaurantservice.reference.Reference;

import java.util.InputMismatchException;

/**
 * Created by Ukrit on 8/2/2558.
 */
public class SetTableFirst extends Dialog {
    EditText editTextTable = null;
    Button buttonTable = null;

    public SetTableFirst(Context context) {
        super(context);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(getContext());
        editTextTable = new EditText(getContext());
        buttonTable = new Button(getContext());
        editTextTable.setHint("Number of Table");
        buttonTable.setText("OK");
        linearLayout.addView(editTextTable);
        linearLayout.addView(buttonTable);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);
        setTitle("Set Table");

        buttonTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int table = 0;
                try {
                    table = Integer.parseInt(editTextTable.getText().toString());
                }catch (Exception e){
                    Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    return;
                }
                if(table <= 0)
                    Toast.makeText(getContext(), "set number more than 0", Toast.LENGTH_SHORT).show();
                else {
                    Data.table = table;
                    hide();
                }

            }
        });



    }
}
