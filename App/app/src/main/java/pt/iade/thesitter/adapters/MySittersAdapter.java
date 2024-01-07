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

public class MySittersAdapter extends RecyclerView.Adapter<MySittersAdapter.ViewHolder> {
    ArrayList<User> items;
    Context context;
    MySittersAdapter.ItemClickListener clickListener;

    public MySittersAdapter(ArrayList<User> items, Context context) {
        this.items = items;
        this.context = context;
        clickListener = null;
    }

    @NonNull
    @Override
    public MySittersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.selectview, parent, false);
        return new MySittersAdapter.ViewHolder(view);
    }

    public void setOnClickListener(MySittersAdapter.ItemClickListener listener){
        clickListener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull MySittersAdapter.ViewHolder holder, int position) {
        User user = items.get(position);

        holder.mySitters_Name.setText(user.getUserName());
        holder.mySitters_Mobile.setText(user.getUserMobile());
        holder.mySitters_Gender.setText(user.getUserGender());
        holder.mySitterImage.setImageResource(R.drawable.drake);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView mySitterImage;
        EditText mySitters_Name, mySitters_Gender, mySitters_Mobile;
        View rowDivider;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mySitterImage = itemView.findViewById(R.id.my_Sitters_image);
            mySitters_Name = itemView.findViewById(R.id.my_Sitters_Name);
            mySitters_Gender = itemView.findViewById(R.id.my_Sitters_Gender);
            mySitters_Mobile = itemView.findViewById(R.id.my_Sitters_Mobile);


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

