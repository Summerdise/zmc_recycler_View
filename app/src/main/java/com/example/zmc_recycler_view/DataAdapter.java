package com.example.zmc_recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private List<Data> mDataList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView dataTitle;
        TextView dataNumber;
        TextView dataDescription;

        public ViewHolder(View view) {
            super(view);
            dataTitle = (TextView) view.findViewById(R.id.recycle_title);
            dataNumber = (TextView) view.findViewById(R.id.recycle_number);
            dataDescription = (TextView) view.findViewById(R.id.recycle_description);
        }

    }

    public DataAdapter(List<Data> dataList) {
        mDataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Data data = mDataList.get(position);
        holder.dataTitle.setText(data.getTitle());
        holder.dataNumber.setText(data.getNumber());
        holder.dataDescription.setText(data.getDescription());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}
