package com.example.yuri.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yuri on 2018. 5. 12..
 */

public class MyAdpater extends RecyclerView.Adapter {

    private Context mContext;
    private List<CardData> cardList;

    MyAdpater(Context mContext, List cardList){
        this.mContext = mContext;
        this.cardList = cardList;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mycardview, parent, false);
        return new CardViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CardViewHolder myCardHolder = (CardViewHolder) holder;
        myCardHolder.image.setImageResource(cardList.get(position).getImage());
        myCardHolder.name.setText(cardList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }
}

class CardViewHolder extends RecyclerView.ViewHolder{


    ImageView image;
    TextView name;

    public CardViewHolder(View itemView) {
        super(itemView);

        image = itemView.findViewById(R.id.card_image);
        name = itemView.findViewById(R.id.card_name);
    }
}
