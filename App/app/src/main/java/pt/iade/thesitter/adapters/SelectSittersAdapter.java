package pt.iade.thesitter.adapters;

import android.content.ClipData;
import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pt.iade.thesitter.MyViewHolder;

public class SelectSittersAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
