package pt.iade.thesitter.adapters;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pt.iade.thesitter.MyViewHolder;
import pt.iade.thesitter.R;

public class SelectSittersAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;


   @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.selectview, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.selectSitters_Name.setText(items.get(position).getName());
        holder.selectSitters_Gender.setText(items.get(position).getGender());
        holder.selectSitters_Mobile.setText(items.get(position).getMobile());
        holder.selectSitters_image.setImageResource(items.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}


