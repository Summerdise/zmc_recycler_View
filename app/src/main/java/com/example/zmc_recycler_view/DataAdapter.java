package com.example.zmc_recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private List<Data> mDataList;

    class ViewHolder extends RecyclerView.ViewHolder {
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

    class headerViewHolder extends RecyclerView.ViewHolder {
        TextView headerTitle;

        public headerViewHolder(View view) {
            super(view);
            headerTitle = view.findViewById(R.id.header_title);
        }
    }

    public DataAdapter(List<Data> dataList) {
        mDataList = dataList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Data data = mDataList.get(position);
        holder.dataTitle.setText(data.getTitle());
        holder.dataNumber.setText(String.valueOf(data.getNumber()));
        holder.dataDescription.setText(data.getDescription());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}
