package com.example.recycleviewimplementation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomContactAdapter extends RecyclerView.Adapter{
    private ArrayList<ContactPOJO> arrayList = new ArrayList<>();


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Log.v("BindViewHolder", "in onBindViewHolder");
        ContactPOJO contact = arrayList.get(position);
        holder.name1.setText(contact.getmName());
        holder.number1.setText(contact.getmNumber());
        holder.addedOn1.setText(contact.getmAddedOn());

    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name1, number1, addedOn1;
        public MyViewHolder(View itemView) {
            super(itemView);
            Log.v("ViewHolder","in View Holder");
            name1 = itemView.findViewById(R.id.textView);
            number1 = itemView.findViewById(R.id.textView2);
            addedOn1 = itemView.findViewById(R.id.textView3);
        }
    }


    public CustomContactAdapter(ArrayList<ContactPOJO> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.v("CreateViewHolder", "in onCreateViewHolder");
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contactlistlayout,parent,false);

        return new MyViewHolder(itemView);

    }

   

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
