package com.example.recyclerviewww;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> sh;

    RecyclerContactAdapter(Context context, ArrayList<ContactModel> sh){
        this.context=context;
        this.sh=sh;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v =LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image.setImageResource(sh.get(position).imagee);
        holder.Contact.setText(sh.get(position).name);
        holder.contact_nu.setText(sh.get(position).number);

    }

    @Override
    public int getItemCount() {
        return sh.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView Contact ,contact_nu;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.image);
            Contact=itemView.findViewById(R.id.Contact);
            contact_nu=itemView.findViewById(R.id.contact_nu);





        }
    }

}

