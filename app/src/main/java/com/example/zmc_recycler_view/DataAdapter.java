package com.example.zmc_recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Data> mDataList;

    public static class ItemHolder extends RecyclerView.ViewHolder {
        TextView dataTitle;
        TextView dataNumber;
        TextView dataDescription;

        public ItemHolder(View view) {
            super(view);
            dataTitle = (TextView) view.findViewById(R.id.recycle_title);
            dataNumber = (TextView) view.findViewById(R.id.recycle_number);
            dataDescription = (TextView) view.findViewById(R.id.recycle_description);
        }

    }

    public static class HeaderViewHolder extends RecyclerView.ViewHolder {
        TextView headerTitle;

        public HeaderViewHolder(View view) {
            super(view);
            headerTitle = view.findViewById(R.id.header_title);
        }
    }

    public DataAdapter(List<Data> dataList) {
        mDataList = dataList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (viewType == Data.TYPE_ITEM) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_item, parent, false);
            return new ItemHolder(view);
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_item, parent, false);
            return new HeaderViewHolder(view);
        }
    }

    @Override

    public int getItemViewType(int position) {
        if (0 == mDataList.get(position).type) {
            return Data.TYPE_ITEM;
        } else if (1 == mDataList.get(position).type) {
            return Data.TYPE_HEADER;
        } else {
            return -1;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Data data = mDataList.get(position);
        if (data.type == Data.TYPE_HEADER) {
            ((HeaderViewHolder) holder).headerTitle.setText(data.getTitle());
        } else {
            ((ItemHolder) holder).dataTitle.setText(data.getTitle());
            ((ItemHolder) holder).dataNumber.setText(String.valueOf(data.getNumber()));
            ((ItemHolder) holder).dataDescription.setText(data.getDescription());
        }
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}
