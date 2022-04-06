package com.example.weatherapilatihan1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.weatherapilatihan1.R;
import com.example.weatherapilatihan1.model.Main;
import com.example.weatherapilatihan1.model.Weather;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherHolder>{

    private Context context;
    private Weather weather;

    public WeatherAdapter(Context context, Weather weather) {
        this.context = context;
        this.weather = weather;
    }

    @NonNull
    @Override
    public WeatherHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.weather_layout,parent,false);
        return new WeatherAdapter().WeatherHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherHolder holder, int position) {
        holder.txtMainWeather.setText(weather.getMain());
        holder.textDescriptionWeather.setText(weather.getDt());
        holder.txtTempWeather.setText(weather.getMain().getTemp());
        holder.txtHumidityWeather.setText(weather.getMain().getHumidity());
        //oke baru sampe sini aja, HUHU // Glide.with(context).load(weather.);




    }


    @Override
    public int getItemCount() {
        return weather;
    }

    public class WeatherHolder extends RecyclerView.ViewHolder{
        ImageView imageWeather;
        TextView txtMainWeather,textDescriptionWeather,txtTempWeather,txtHumidityWeather;
        CardView cardButtonWeather;

        public WeatherHolder(@NonNull View itemView) {
            super(itemView);
            imageWeather = itemView.findViewById(R.id.imageWeather);
            cardButtonWeather = itemView.findViewById(R.id.cardButtonWeather);
            txtMainWeather = itemView.findViewById(R.id.txtMainWeather);
            textDescriptionWeather = itemView.findViewById(R.id.txtDescriptionWeather);
            txtTempWeather = itemView.findViewById(R.id.txtTempWeather);
            txtHumidityWeather = itemView.findViewById(R.id.txtHumidityWeather);
        }
    }
}
