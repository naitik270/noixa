package com.practical.test.demo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.practical.test.demo.Global.ClsNameVal;
import com.practical.test.demo.R;

import java.util.ArrayList;
import java.util.List;

public class DisplayDataAdp extends RecyclerView.Adapter<DisplayDataAdp.ViewHolder> {

    private Context mContext;
    private List<ClsNameVal> lstNameVal = new ArrayList<>();

    public DisplayDataAdp(Context context) {
        this.mContext = context;
    }

    public void addItemList(List<ClsNameVal> lstNameVal) {
        this.lstNameVal = lstNameVal;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.row_display_data, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ClsNameVal currentObj = lstNameVal.get(position);
        holder.txt_label.setText(currentObj.getLabel());
        if (currentObj.getLabel() != null &&
                currentObj.getLabel().equalsIgnoreCase("Status") &&
                currentObj.getValue().equalsIgnoreCase("Active")) {
            holder.txt_value.setTextColor(mContext.getResources().getColor(R.color.green));
        } else if (currentObj.getLabel() != null &&
                currentObj.getLabel().equalsIgnoreCase("Status") &&
                currentObj.getValue().equalsIgnoreCase("DeActive")) {
            holder.txt_value.setTextColor(mContext.getResources().getColor(R.color.red));
        } else {
            holder.txt_value.setTextColor(mContext.getResources().getColor(R.color.txt_clr));
        }
        holder.txt_value.setText(currentObj.getValue());
    }

    @Override
    public int getItemCount() {
        return lstNameVal.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txt_label;
        private TextView txt_value;

        public ViewHolder(View itemView) {
            super(itemView);
            txt_label = itemView.findViewById(R.id.txt_label);
            txt_value = itemView.findViewById(R.id.txt_value);

        }


    }

}
