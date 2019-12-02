package com.example.sofittask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Product> productList;

    //getting the context and product list with constructor
    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_products, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the product of the specified position
        Product product = productList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewTitle2.setText(product.getTitle());
        holder.textViewTitle3.setText(product.getTitle());
        holder.textViewTitle4.setText(product.getTitle());
        holder.textViewTitle11.setText(product.getTitle());
        holder.textViewTitle22.setText(product.getTitle());
        holder.textViewTitle33.setText(product.getTitle());
        holder.textViewTitle44.setText(product.getTitle());

        holder.textViewTitle111.setText(product.getTitle());
        holder.textViewTitle222.setText(product.getTitle());
        holder.textViewShortDesc.setText(product.getShortdesc());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
        holder.gp2.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

        holder.gp3.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

        holder.gp4.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
        holder.imageView11.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
        holder.gp22.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

        holder.gp33.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

        holder.gp44.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

        holder.imageView111.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
        holder.gp222.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));


    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle,textViewTitle2,textViewTitle3,textViewTitle4,textViewTitle11,textViewTitle22,textViewTitle33,textViewTitle44,textViewTitle111,textViewTitle222, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView ,gp2,gp3,gp4,imageView11 ,gp22,gp33,gp44,imageView111 ,gp222;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewTitle2 = itemView.findViewById(R.id.textViewTitle2);
            textViewTitle3 = itemView.findViewById(R.id.textViewTitle3);
            textViewTitle4 = itemView.findViewById(R.id.textViewTitle4);
            textViewTitle11 = itemView.findViewById(R.id.textViewTitle11);
            textViewTitle22 = itemView.findViewById(R.id.textViewTitle22);
            textViewTitle33 = itemView.findViewById(R.id.textViewTitle33);
            textViewTitle44 = itemView.findViewById(R.id.textViewTitle44);
            textViewTitle111 = itemView.findViewById(R.id.textViewTitle111);
            textViewTitle222 = itemView.findViewById(R.id.textViewTitle222);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);
            gp2 = itemView.findViewById(R.id.gp2);
            gp3 = itemView.findViewById(R.id.gp3);
            gp4 = itemView.findViewById(R.id.gp4);
            imageView11 = itemView.findViewById(R.id.imageView11);
            gp22 = itemView.findViewById(R.id.gp22);
            gp33 = itemView.findViewById(R.id.gp33);
            gp44 = itemView.findViewById(R.id.gp44);
            imageView111 = itemView.findViewById(R.id.imageView111);
            gp222 = itemView.findViewById(R.id.gp222);
        }
    }
}