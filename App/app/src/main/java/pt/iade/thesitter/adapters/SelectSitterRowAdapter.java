package pt.iade.thesitter.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import pt.iade.thesitter.R;
import pt.iade.thesitter.models.User;

public class SelectSitterRowAdapter extends RecyclerView.Adapter<SelectSitterRowAdapter.ViewHolder> {
    ArrayList<User> items;
    Context context;
    ItemClickListener clickListener;

    public SelectSitterRowAdapter(ArrayList<User> items, Context context) {
        this.items = items;
        this.context = context;
        clickListener = null;
    }

    @NonNull
    @Override
    public SelectSitterRowAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_parent_select_sitter, parent, false);

        return new ViewHolder(view);
    }

    public void setOnClickListener(ItemClickListener listener){
        clickListener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull SelectSitterRowAdapter.ViewHolder holder, int position) {
        User user = items.get(position);

        holder.selectedButton.setChecked(false);
        holder.sitterImage.setImageResource(R.drawable.sitter);
        holder.selectSitters_Name.setText(user.getUserName());
        holder.selectSitters_Email.setText(user.getUserEmail());
        holder.selectSitters_Mobile.setText(user.getUserMobile());
        holder.selectSitters_Gender.setText(user.getUserGender());
        holder.sitterImage.setImageResource(R.drawable.drake);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        RadioButton selectedButton;
        ImageView sitterImage;
        TextView selectSitters_Name, selectSitters_Email,
                selectSitters_Gender, selectSitters_Mobile;
        View rowDivider;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            selectedButton = itemView.findViewById(R.id.select_sitter_selected);
            sitterImage = itemView.findViewById(R.id.select_imageView);
            selectSitters_Name = itemView.findViewById(R.id.select_name_textView);
            selectSitters_Email = itemView.findViewById(R.id.select_email_textView);
            selectSitters_Gender = itemView.findViewById(R.id.select_gender_textView);
            selectSitters_Mobile = itemView.findViewById(R.id.select_mobile_textView);

            itemView.setOnClickListener(this);

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