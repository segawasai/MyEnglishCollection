package com.example.macos.myenglishcollection.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.macos.myenglishcollection.R;
import com.example.macos.myenglishcollection.models.StudyMenu;

import java.util.ArrayList;

/**
 * Created by macos on 3/21/18.
 */

public class ItemMenuAdapter extends RecyclerView.Adapter<ItemMenuAdapter.ViewHolder>{
    private Context mContext;
    private ArrayList<StudyMenu> mList;
    private int mLayout;

    public ItemMenuAdapter(Context context, ArrayList<StudyMenu> list, int layout){
        mContext = context;
        mLayout = layout;
        mList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(mLayout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String title = mList.get(position).getTitle();
        String description = mList.get(position).getDescription();
        int imageId = mList.get(position).getImageURL();
        holder.tvTitle.setText(title);
        holder.tvDescription.setText(description);
        holder.ivIcon.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvTitle, tvDescription;
        public ImageView ivIcon;

        public ViewHolder(View itemView){
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitleCardView);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            ivIcon = itemView.findViewById(R.id.ivIcon);
        }
    }
}