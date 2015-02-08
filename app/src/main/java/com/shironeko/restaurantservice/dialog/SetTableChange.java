package com.shironeko.restaurantservice.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.shironeko.restaurantservice.data.Data;
import com.shironeko.restaurantservice.data.Order;
import com.shironeko.restaurantservice.reference.Reference;

/**
 * Created by Ukrit on 8/2/2558.
 */
public class SetTableChange extends Dialog {
    EditText editTextTable = null;
    Button buttonTable = null;
    int orderId;
    public SetTableChange(Context context,int orderId) {
        super(context);
        this.orderId = orderId;
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
        setTitle("Change Table");

        buttonTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int newTable = Reference.INT_NULL;

                try{
                    newTable = Integer.parseInt(editTextTable.getText().toString());
                    if(newTable > 0) {
                        for (int i = 0; i < Data.Data_Order.size(); i++) {
                            if (Data.Data_Order.get(i).getOrderId() == orderId) {
                                Data.Data_Order.get(i).setOrderTable(newTable);
                                Toast.makeText(getContext(), "changeTable "+Data.Data_Order.get(i).getOrderTable(), Toast.LENGTH_SHORT).show();
                                hide();
                                break;
                            }
                        }

                    }
                    else
                        Toast.makeText(getContext(), "set number more than 0", Toast.LENGTH_SHORT).show();
                }catch(Exception e){
                    Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }

}
