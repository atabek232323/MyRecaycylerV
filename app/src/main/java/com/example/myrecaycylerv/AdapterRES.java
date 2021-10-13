package com.example.myrecaycylerv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterRES extends RecyclerView.Adapter<AdapterRES.MyVievHolder> {
    private final LayoutInflater inflater;
    private final List<State> states;
    AdapterRES(Context context, List<State> states1){

        this.inflater = LayoutInflater.from(context);
        this.states = states1;
    }

    @NonNull
    @Override
    public AdapterRES.MyVievHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent,false);

        return new MyVievHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRES.MyVievHolder holder, int position) {
            State state = states.get(position);
            holder.flagView.setImageResource(state.getFlagResurs());
            holder.nameView.setText(state.getName());
            holder.capitalView.setText(state.getCapital());
        }


    @Override
    public int getItemCount() {
        return states.size();
    }
    public static class MyVievHolder extends RecyclerView.ViewHolder{

        public ImageView flagView;
        final TextView nameView,capitalView;

        public MyVievHolder(@NonNull View itemView) {
            super(itemView);
            flagView = (ImageView) itemView.findViewById(R.id.imageV_Flag);
            nameView  = (TextView) itemView.findViewById(R.id.textV_name);
            capitalView = (TextView) itemView.findViewById(R.id.textV_Capital);

        }
    }
}
