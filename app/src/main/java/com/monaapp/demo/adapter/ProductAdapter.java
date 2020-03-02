package com.monaapp.demo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.monaapp.demo.R;
import com.monaapp.demo.model.Product;
import com.monaapp.demo.viewholder.ProductViewHolder;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder>{
    private List<Product> productList = new ArrayList<>();

    // Provide a suitable constructor (depends on the kind of dataset)
    public ProductAdapter(List<Product> productList) {
        this.productList = productList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_product_item, parent, false);

        ProductViewHolder vh = new ProductViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.tv_proName.setText(productList.get(position).getName());
        holder.tv_proDescription.setText(productList.get(position).getDescription());
        holder.tv_proPrice.setText(productList.get(position).getPrice().toString());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return productList.size();
    }
}
