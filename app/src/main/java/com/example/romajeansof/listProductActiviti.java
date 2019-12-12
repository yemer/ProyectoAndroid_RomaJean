package com.example.romajeansof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.romajeansof.models.products;

public class listProductActiviti extends AppCompatActivity {
    ListView productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product_activiti);
        productList=findViewById(R.id.ListaPropductos);

        productos adapter = new productos(
                contex:this, products.getdata();
        )


    }
}
