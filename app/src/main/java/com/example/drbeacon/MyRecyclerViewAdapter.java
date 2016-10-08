package com.example.drbeacon;

/**
 * Created by bogdanbuduroiu on 08/10/2016.
 */

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import drbeacon.models.Appointment;

public class MyRecyclerViewAdapter extends RecyclerView
        .Adapter<MyRecyclerViewAdapter
        .DataObjectHolder> {
    private static String LOG_TAG = "MyRecyclerViewAdapter";
    private ArrayList<Appointment> mDataset;
    private static MyClickListener myClickListener;

    public static class DataObjectHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView apptType;
        TextView apptDate;
        TextView apptTime;
        TextView apptLocation;

        public DataObjectHolder(View itemView) {
            super(itemView);
            apptType = (TextView) itemView.findViewById(R.id.apptType);
            apptDate = (TextView) itemView.findViewById(R.id.apptDate);
            apptTime = (TextView) itemView.findViewById(R.id.apptTime);
            apptLocation = (TextView) itemView.findViewById(R.id.apptLocation);
            Log.i(LOG_TAG, "Adding Listener");
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            myClickListener.onItemClick(1, v);
        }
    }

    public void setOnItemClickListener(MyClickListener myClickListener) {
        this.myClickListener = myClickListener;
    }

    public MyRecyclerViewAdapter(ArrayList<Appointment> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_card_view_row, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
        Appointment current = mDataset.get(position);
        if (current.isHasAppointment()){

        }

        holder.apptType.setText(R.string.has_appt);
        holder.apptTime.setText(Appointment.getReadableDate(current.getTime()));
        String spacedLocation = current.getLocation().concat(" ");
        String fullLocation = spacedLocation.concat(current.getClinic());
        holder.apptLocation.setText(fullLocation);
    }

    public void addItem(Appointment dataObj, int index) {
        mDataset.add(index, dataObj);
        notifyItemInserted(index);
    }

    public void deleteItem(int index) {
        mDataset.remove(index);
        notifyItemRemoved(index);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public interface MyClickListener {
        public void onItemClick(int position, View v);
    }
}

