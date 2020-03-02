package com.monaapp.demo.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.monaapp.demo.R;
import com.monaapp.demo.model.Product;

public class ProductViewHolder extends RecyclerView.ViewHolder {
    // each data item is just a string in this case
    public TextView tv_proName;
    public TextView tv_proDescription;
    public TextView tv_proPrice;

    public ProductViewHolder(View v) {
        super(v);
        tv_proName = v.findViewById(R.id.tv_pro_name);
        tv_proDescription = v.findViewById(R.id.tv_pro_description);
        tv_proPrice = v.findViewById(R.id.tv_pro_price);
    }
}
