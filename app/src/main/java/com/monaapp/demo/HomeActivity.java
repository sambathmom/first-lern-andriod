package com.monaapp.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.monaapp.demo.adapter.ProductAdapter;
import com.monaapp.demo.model.Product;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
   // private String[] mDataset = {"234234", "324823"};
    private List<Product> productList = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        productList = new ArrayList<>();
        productList.add(new Product(1, "Pro1", 12.00, "Pro1 desc"));
        productList.add(new Product(2, "Pro1", 12.00, "Pro1 desc"));
        productList.add(new Product(3, "Pro1", 12.00, "Pro1 desc"));
        productList.add(new Product(4, "Pro1", 12.00, "Pro1 desc"));
        recyclerView = (RecyclerView) findViewById(R.id.home_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        mAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(mAdapter);
    }
}
