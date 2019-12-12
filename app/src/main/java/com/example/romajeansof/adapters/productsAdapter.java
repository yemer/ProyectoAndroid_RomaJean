package com.example.romajeansof.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.romajeansof.R;
import  com.example.romajeansof.models.products;
import java.util.List;
import  android.widget.TextView;

import androidx.annotation.NonNull;

public class productsAdapter {


    public class ProductAdapter extends ArrayAdapter<products>

        Context context {
        public ProductAdapter(@NonNull Context context, int resource) {
            super(context, resource);
        }
    }

    ;
       // ImageLoader queue;
        private class ViewHolder {

        }
           // NetworkImageView image;
            TextView name;
            TextView price;
            TextView description;
            TextView category;
            ImageButton btnAddToBag;

            private productsAdapter() {
            }
        }
    public ProductAdapter(Context context, List<products> items) {
        super(context, 0, items);
        this.context = context;
        public View getView(final int position, View android.view.View convertView;
        convertView, ViewGroup parent) {
            ViewHolder holder;
            final Product rowItem = (products) getItem(position);
            LayoutInflater mInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            if (convertView == null) {
                convertView = mInflater.inflate(R.layout.adapter_produtc_item, null);
                holder = new ViewHolder();
//            holder.image = (ImageView) convertView.findViewById(R.id.image);
               // holder.image = (NetworkImageView)convertView.findViewById(R.id.image);
                holder.name = (TextView) convertView.findViewById(R.id.name);
                //holder.price = (TextView) convertView.findViewById(R.id.price);
                holder.description = (TextView) convertView.findViewById(R.id.description);
             //   holder.category = (TextView) convertView.findViewById(R.id.category);
              //  holder.btnAddToBag = (ImageButton) convertView.findViewById(R.id.btnAddToBag);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.name.setText(rowItem.name);
           // holder.price.setText(rowItem.getPriceText());
            ///holder.description.setText(rowItem.getDescription());
            //holder.category.setText(rowItem.getCategory());
///
            if ( rowItem.getSmallImage() != null ) {
                holder.image.setImageUrl(
                        rowItem.getSmallImage(), queue);
            }
       // this.queue = _queue;
    }
}
