package pt.iade.thesitter.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import pt.iade.thesitter.R;
import pt.iade.thesitter.models.Booking;

public class ParentRequestsAdapter extends RecyclerView.Adapter<ParentRequestsAdapter.ViewHolder> {
    ArrayList<Booking> items;
    Context context;
    ParentRequestsAdapter.ItemClickListener clickListener;

    public ParentRequestsAdapter(ArrayList<Booking> items, Context context) {
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
        Booking booking = items.get(position);

        holder.sitter_requests_name.setText(booking.getSitter().getUser().getUserName());
        holder.sitter_requests_email.setText(booking.getSitter().getUser().getUserEmail());
        holder.sitter_requests_status.setText(booking.getBooStatus().toString());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView sitter_requests_name, sitter_requests_email, sitter_requests_status;
        View rowDivider;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //parent_requests_image = itemView.findViewById(R.id.parent_requests_image);
            sitter_requests_name = itemView.findViewById(R.id.sitter_requests_name);
            sitter_requests_email = itemView.findViewById(R.id.sitter_requests_email);
            sitter_requests_status = itemView.findViewById(R.id.sitter_requests_status);


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

