package com.seunghyo.sunshine_b;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SeungHyo on 2015-07-17.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<ForecastItem> forecastItem = new ArrayList<>();
    private int itemLayout;

    public RecyclerAdapter(ArrayList<ForecastItem> items, int itemLayout) {

        this.forecastItem = items;
        this.itemLayout = itemLayout;
    }


    @Override
    public int getItemCount() {
        return forecastItem.size();
    }



    public void add(ArrayList list, ForecastItem Item, String forecast_Text) {
        Item.setForecast_text(forecast_Text);
        list.add(Item);
    }

    public void clear() {
        ForecastItem item = new ForecastItem();
        item.setForecast_text("");
        item.setImage(R.mipmap.ic_launcher);
        forecastItem.add(item);
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(itemLayout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder viewHolder, int position) {
        ForecastItem item = forecastItem.get(position);
        viewHolder.forecast_text.setText(item.getForecast_text());
        viewHolder.img.setBackgroundResource(item.getImage());
        viewHolder.itemView.setTag(item);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView img;
        public TextView forecast_text;

        public ViewHolder(View itemView) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.forecast_img);
            forecast_text = (TextView) itemView.findViewById(R.id.forecast_text);
        }
    }
}

