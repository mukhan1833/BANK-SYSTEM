package com.internship.bank_sparks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class signin extends AppCompatActivity {
    ImageView customer,transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customer=findViewById(R.id.customer);
        transaction=findViewById(R.id.Transactions);

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(signin.this,user_list.class));
            }
        });
        transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(signin.this,history_list.class));
            }
        });
    }
}