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

public class ParentRequestsAdapter extends RecyclerView.Adapter<ParentRequestsAdapter.ViewHolder> {
    ArrayList<User> items;
    Context context;
    ParentRequestsAdapter.ItemClickListener clickListener;

    public ParentRequestsAdapter(ArrayList<User> items, Context context) {
        this.items = items;
        this.context = context;
        clickListener = null;
    }

    @NonNull
    @Override
    public ParentRequestsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_parent_requests, parent, false);
        return new ParentRequestsAdapter.ViewHolder(view);
    }

    public void setOnClickListener(ParentRequestsAdapter.ItemClickListener listener){
        clickListener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull ParentRequestsAdapter.ViewHolder holder, int position) {
        User user = items.get(position);

        holder.parent_requests_name.setText(user.getUserName());
        holder.parent_requests_mobile.setText(user.getUserMobile());
        holder.parent_requests_gender.setText(user.getUserGender());
        holder.parent_requests_image.setImageResource(R.drawable.drake);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView parent_requests_image;
        EditText parent_requests_name, parent_requests_gender, parent_requests_mobile;
        View rowDivider;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            parent_requests_image = itemView.findViewById(R.id.parent_requests_image);
            parent_requests_name = itemView.findViewById(R.id.parent_requests_name);
            parent_requests_gender = itemView.findViewById(R.id.parent_requests_email);
            parent_requests_mobile = itemView.findViewById(R.id.parent_requests_status);


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

