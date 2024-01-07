package pt.iade.thesitter.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

import pt.iade.thesitter.R;
import pt.iade.thesitter.models.FamilyMember;

public class MyFamilyAdapter extends RecyclerView.Adapter<MyFamilyAdapter.ViewHolder> {
    ArrayList<FamilyMember> items;
    Context context;
    MyFamilyAdapter.ItemClickListener clickListener;

    public MyFamilyAdapter(ArrayList<FamilyMember> items, Context context) {
        this.items = items;
        this.context = context;
        clickListener = null;
    }

    @NonNull
    @Override
    public MyFamilyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_family_view, parent, false);
        return new MyFamilyAdapter.ViewHolder(view);
    }

    public void setOnClickListener(MyFamilyAdapter.ItemClickListener listener){
        clickListener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FamilyMember user = items.get(position);

        holder.my_Family_Name.setText(user.getFaName());
       // holder.my_Family_Bdate.setLocalDate(user.getFaBdate());// to be fixed!!
        holder.my_Family_Image.setImageResource(R.drawable.drake);
        holder.my_Family_Button.setImageResource(R.drawable.edit_pen_icon);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView my_Family_Image;
        EditText my_Family_Name, my_Family_Bdate;
        ImageButton my_Family_Button;
        View rowDivider;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            my_Family_Image = itemView.findViewById(R.id.my_Family_image);
            my_Family_Name = itemView.findViewById(R.id.my_Family_name);
            my_Family_Bdate = itemView.findViewById(R.id.my_Family_Bdate);
            my_Family_Button = itemView.findViewById(R.id.my_Family_button);


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

