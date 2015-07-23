package com.seunghyo.sunshine_b;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
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

    public ForecastItem getItem(ArrayList<ForecastItem> forecastItem, int position) {
        ForecastItem s = forecastItem.get(position);
        return s;
    }

    @Override
    public int getItemCount() {
        return forecastItem.size();
    }



    public void add(ArrayList list, ForecastItem Item, String forecast_Text, ArrayList<String> description,int position) {

        String data = description.get(position);

        Item.setForecast_text(forecast_Text);

        Log.d("data", "dd"+ data);
        switch (data) {
            case "thunderstorm with light rain" :
                Item.setImage(R.drawable.thunder);
                break;
            case "thunderstorm with rain" :
                Item.setImage(R.drawable.thunder);
                break;
            case "thunderstorm with heavy rain" :
                Item.setImage(R.drawable.thunder);
                break;
            case "Rain" :
                Item.setImage(R.drawable.thunder);
                break;
            case "light thunderstorm" :
                Item.setImage(R.drawable.thunder);
                break;
            case "thunderstorm" :
                Item.setImage(R.drawable.thunder);
                break;
            case "heavy thunderstorm" :
                Item.setImage(R.drawable.thunder);
                break;
            case "ragged thunderstorm" :
                Item.setImage(R.drawable.thunder);
                break;
            case "thunderstorm with light drizzle" :
                Item.setImage(R.drawable.thunder);
                break;
            case "thunderstorm with drizzle" :
                Item.setImage(R.drawable.thunder);
                break;
            case "thunderstorm with heavy drizzle" :
                Item.setImage(R.drawable.thunder);
                break;
            case "light intensity drizzle" :
                Item.setImage(R.drawable.drizzle);
                break;
            case "heavy intensity drizzle" :
                Item.setImage(R.drawable.drizzle);
                break;
            case "light intensity drizzle rain" :
                Item.setImage(R.drawable.drizzle);
                break;
            case "Drizzle" :
                Item.setImage(R.drawable.drizzle);
                break;
            case "drizzle rain" :
                Item.setImage(R.drawable.drizzle);
                break;
            case "heavy intensity drizzle rain" :
                Item.setImage(R.drawable.drizzle);
                break;
            case "shower rain and drizzle" :
                Item.setImage(R.drawable.drizzle);
                break;
            case "Rain" :
                Item.setImage(R.drawable.drizzle);
                break;
            case "heavy shower rain and drizzle" :
                Item.setImage(R.drawable.drizzle);
                break;
            case "light rain" :
                Item.setImage(R.drawable.drizzle);
                break;
            case "moderate rain" :
                Item.setImage(R.drawable.rain);
                break;
            case "heavy intensity rain" :
                Item.setImage(R.drawable.rain);
                break;
            case "very heavy rain" :
                Item.setImage(R.drawable.rain);
                break;
            case "extreme rain" :
                Item.setImage(R.drawable.rain);
                break;
            case "freezing rain" :
                Item.setImage(R.drawable.rain);
                break;
            case "light intensity shower rain" :
                Item.setImage(R.drawable.rain);
                break;
            case "shower rain" :
                Item.setImage(R.drawable.rain);
                break;
            case "heavy intensity shower rain" :
                Item.setImage(R.drawable.rain);
                break;
            case "ragged shower rain" :
                Item.setImage(R.drawable.rain);
                break;
            case "light snow" :
                Item.setImage(R.drawable.snow);
                break;
            case "snow" :
                Item.setImage(R.drawable.snow);
                break;
            case "heavy snow" :
                Item.setImage(R.drawable.snow);
                break;
            case "sleet" :
                Item.setImage(R.drawable.snow);
                break;
            case "shower sleet" :
                Item.setImage(R.drawable.snow);
                break;
            case "light rain and snow" :
                Item.setImage(R.drawable.snow);
                break;
            case "rain and snow" :
                Item.setImage(R.drawable.snow);
                break;
            case "light shower snow" :
                Item.setImage(R.drawable.snow);
                break;
            case "shower snow" :
                Item.setImage(R.drawable.snow);
                break;
            case "heavy shower snow" :
                Item.setImage(R.drawable.snow);
                break;
            case "mist" :
                Item.setImage(R.drawable.atmosphere);
                break;
            case "smoke" :
                Item.setImage(R.drawable.atmosphere);
                break;
            case "haze" :
                Item.setImage(R.drawable.atmosphere);
                break;
            case "sand, dust whirls" :
                Item.setImage(R.drawable.atmosphere);
                break;
            case "fog" :
                Item.setImage(R.drawable.atmosphere);
                break;
            case "sand" :
                Item.setImage(R.drawable.atmosphere);
                break;
            case "dust" :
                Item.setImage(R.drawable.atmosphere);
                break;
            case "volcanic ash" :
                Item.setImage(R.drawable.atmosphere);
                break;
            case "squalls" :
                Item.setImage(R.drawable.atmosphere);
                break;
            case "tornado" :
                Item.setImage(R.drawable.atmosphere);
                break;
            case "clear sky" :
                Item.setImage(R.drawable.clear);
                break;
            case "few clouds" :
                Item.setImage(R.drawable.few);
                break;
            case "scattered clouds" :
                Item.setImage(R.drawable.scattered);
                break;
            case "broken clouds" :
                Item.setImage(R.drawable.broken);
                break;
            case "overcast clouds" :
                Item.setImage(R.drawable.broken);
                break;
            case "Clouds" :
                Item.setImage(R.drawable.broken);
                break;
            default:
                Item.setImage(R.drawable.clear);
                break;
        }
        list.add(Item);
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

