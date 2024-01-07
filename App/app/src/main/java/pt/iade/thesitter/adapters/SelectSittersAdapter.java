package pt.iade.thesitter.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import pt.iade.thesitter.R;
import pt.iade.thesitter.models.User;

public class SelectSittersAdapter extends RecyclerView.Adapter<SelectSittersAdapter.ViewHolder> {
    ArrayList<User> items;
    Context context;
    ItemClickListener clickListener;

    public SelectSittersAdapter(ArrayList<User> items, Context context) {
        this.items = items;
        this.context = context;
        clickListener = null;
    }

    @NonNull
    @Override
    public SelectSittersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.selectview, parent, false);
        return new ViewHolder(view);
    }

    public void setOnClickListener(ItemClickListener listener){
        clickListener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull SelectSittersAdapter.ViewHolder holder, int position) {
        User user = items.get(position);

        holder.selectSitters_Name.setText(user.getUserName());
        holder.selectSitters_Mobile.setText(user.getUserMobile());
        holder.selectSitters_Gender.setText(user.getUserGender());
        holder.sitterImage.setImageResource(R.drawable.drake);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView sitterImage;
        EditText selectSitters_Name, selectSitters_Gender, selectSitters_Mobile;
        View rowDivider;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            sitterImage = itemView.findViewById(R.id.select_image);
            selectSitters_Name = itemView.findViewById(R.id.select_Name);
            selectSitters_Gender = itemView.findViewById(R.id.select_Gender);
            selectSitters_Mobile = itemView.findViewById(R.id.select_Mobile);


        }

        @Override
        public void onClick(View v) {
            if (clickListener != null){
                clickListener.onItemClick(v, getAdapterPosition());
            }
        }
    }

    public interface ItemClickListener{
        public void onItemClick(View view, int position);
    }
}