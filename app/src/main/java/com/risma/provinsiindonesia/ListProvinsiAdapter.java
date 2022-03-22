package com.risma.provinsiindonesia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListProvinsiAdapter extends RecyclerView.Adapter<ListProvinsiAdapter.listViewHolder> {
    private ArrayList<Provinsi> listProvinsi;

    public ListProvinsiAdapter(ArrayList<Provinsi> list) {
        this.listProvinsi = list;
    }
    @NonNull
    @Override
    public listViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_provinsi, parent, false );
        return new listViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listViewHolder holder, int position) {
        Provinsi provinsi = listProvinsi.get(position);
        Glide.with(holder.itemView.getContext())
                .load(provinsi.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(provinsi.getName());
        holder.tvDetail.setText(provinsi.getDetail());
    }

    @Override
    public int getItemCount() {
        return listProvinsi.size();
    }

    class listViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvDetail;

        listViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_provinsi);
            tvName = itemview.findViewById(R.id.tv_item_name);
            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }
}

