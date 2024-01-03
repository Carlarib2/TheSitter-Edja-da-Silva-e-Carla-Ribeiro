package pt.iade.thesitter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public ImageView selectSitters_image;
    public TextView selectSitters_Name,selectSitters_Gender, selectSitters_Mobile;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        selectSitters_image= itemView.findViewById(R.id.selectSitters_image);
        selectSitters_Name= itemView.findViewById(R.id.selectSitters_Name);
        selectSitters_Gender= itemView.findViewById(R.id.selectSitters_Gender);
        selectSitters_Mobile=itemView.findViewById(R.id.selectSitters_Mobile);


    }
}
