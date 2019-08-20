package org.luthfi.yamahamusicstore;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewYamaha extends RecyclerView.Adapter<CardViewYamaha.ViewHolder> {
    private ArrayList<Guitar> listGuitar;

    public CardViewYamaha(ArrayList<Guitar> listGuitar){
        this.listGuitar = listGuitar;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_yamaha, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int i) {

        final Guitar guitar = listGuitar.get(i);
        Glide.with(holder.itemView.getContext())
                .load(guitar.getPhoto())
                .apply(new RequestOptions().override(800,800))
                .into(holder.imgPhoto);

        holder.tvBrand.setText(guitar.getBrand());
        holder.tvDeskripsi.setText(guitar.getDeskripsi());

        holder.card_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), YamahaDetail.class);
                YamahaDetail detail = new YamahaDetail();
                intent.putExtra(detail.EXTRA_GAMBAR, guitar.getPhoto());
                intent.putExtra(detail.EXTRA_BRAND, guitar.getBrand());
                intent.putExtra(detail.EXTRA_PRICE, guitar.getPrice());
                intent.putExtra(detail.EXTRA_DESKRIPSI, guitar.getDeskripsi());

                holder.itemView.getContext().startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return listGuitar.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView card_View;
        ImageView imgPhoto;
        TextView tvBrand, tvDeskripsi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvBrand = itemView.findViewById(R.id.tv_item_name);
            tvDeskripsi = itemView.findViewById(R.id.tv_desc);
            card_View = itemView.findViewById(R.id.card_view);
        }
    }
}
