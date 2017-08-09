package com.example.moandroidapps.customlistview;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.List;


public class ProductListAdapter extends ArrayAdapter<Product> {

    private List<Product> products;

    public ProductListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Product> objects) {
        super(context, resource, objects);
        products = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Product product = products.get(position);

        TextView nameText = convertView.findViewById(R.id.nameText);
        nameText.setText(product.getName());

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String price = formatter.format(product.getPrice());
        TextView priceText = convertView.findViewById(R.id.priceText);
        priceText.setText(price);

        ImageView iv = convertView.findViewById(R.id.imageView);
        Bitmap bitmap = getBitmapFromAsset(product.getProductID());
        iv.setImageBitmap(bitmap);

        return convertView;
    }

    private Bitmap getBitmapFromAsset(String productID){
        AssetManager assetManager = getContext().getAssets();
        InputStream stream = null;
        try {
            stream = assetManager.open(productID);
            return BitmapFactory.decodeStream(stream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
