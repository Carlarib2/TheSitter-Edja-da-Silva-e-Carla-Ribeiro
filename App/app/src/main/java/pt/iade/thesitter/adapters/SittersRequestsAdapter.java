package pt.iade.thesitter.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import pt.iade.thesitter.R;
import pt.iade.thesitter.models.Booking;

public class SittersRequestsAdapter extends RecyclerView.Adapter<SittersRequestsAdapter.ViewHolder> {
    ArrayList<Booking> items;
    Context context;
    SittersRequestsAdapter.ItemClickListener clickListener;

    public SittersRequestsAdapter(ArrayList<Booking> items, Context context) {
        this.items = items;
        this.context = context;
        clickListener = null;
    }

    @NonNull
    @Override
    public SittersRequestsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_sitter_requests, parent, false);
        return new SittersRequestsAdapter.ViewHolder(view);
    }

    public void setOnClickListener(SittersRequestsAdapter.ItemClickListener listener){
        clickListener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull SittersRequestsAdapter.ViewHolder holder, int position) {
        Booking user = items.get(position);

        //holder.sitter_requests_name.setText(user.getBooName());
        //holder.sitter_requests_yes.set(user.get());// to be fixed!!
       // holder.sitter_requests_no.setImageResource(R.drawable.drake);
        //holder.parent_requests_image.setImageResource(R.drawable.ic_launcher_background);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView parent_requests_image;
        TextView parent_requests_name;
        CheckBox parent_requests_yes, parent_requests_no;
        View rowDivider;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //sitter_requests_image = itemView.findViewById(R.id.sitter_requests_image);
            parent_requests_name = itemView.findViewById(R.id.parent_requests_name);
            parent_requests_yes = itemView.findViewById(R.id.parent_requests_yes);
            parent_requests_no = itemView.findViewById(R.id.parent_requests_no);


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
