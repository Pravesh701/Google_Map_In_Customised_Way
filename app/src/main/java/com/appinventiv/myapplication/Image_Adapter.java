package com.appinventiv.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Image_Adapter extends RecyclerView.Adapter<Image_Adapter.ViewHolderProgrammingImage> {
    public static int digit = 1;

    private Context context;
    private ArrayList<ImageData> arrayList;
    public static final String TAG = "Inbox_Adapter";

    public Image_Adapter(Context context, ArrayList<ImageData> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolderProgrammingImage onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler_view_items, parent, false);
        return new ViewHolderProgrammingImage(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderProgrammingImage holder, int position) {

        ImageData imageData = arrayList.get(position);

        holder.img_profile_photo.setImageResource(imageData.imageId);
    }

    @Override
    public int getItemCount() {
        return 10;
    }


    public static class ViewHolderProgrammingImage extends RecyclerView.ViewHolder {
        public ImageView img_profile_photo;

        public ViewHolderProgrammingImage(@NonNull View itemView) {
            super(itemView);
            img_profile_photo = (ImageView) itemView.findViewById(R.id.img_image_adapter_contactImage);
        }
    }
}
