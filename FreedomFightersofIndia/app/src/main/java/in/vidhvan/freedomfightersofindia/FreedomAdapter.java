package in.vidhvan.freedomfightersofindia;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FreedomAdapter extends RecyclerView.Adapter<FreedomAdapter.FreedomVH> {

    Context context;
    List<FreedomFighters> fighters;

    public FreedomAdapter(Context context, List<FreedomFighters> fighters) {
        this.context = context;
        this.fighters = fighters;
    }

    /**this is responsible
     * to attach the `one_item_design.xml` to the adapter*/
    @NonNull
    @Override
    public FreedomVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.one_item_design,parent,false);
        return new FreedomVH(v);
    }

    /**
     * This method is responsible to load the data on the attached layout in the adapter*/
    @Override
    public void onBindViewHolder(@NonNull FreedomVH holder, int position) {
        holder.photo.setImageResource(fighters.get(position).getPhoto());
        holder.name.setText(fighters.get(position).getName());
        holder.lived.setText(fighters.get(position).getActiveYears());
    }

    // This tells the recyclerview about how many items it has to handle
    @Override
    public int getItemCount() {
        return fighters.size();
    }

    public class FreedomVH extends RecyclerView.ViewHolder {
        ImageView photo;
        TextView name, lived;

        public FreedomVH(@NonNull View itemView) {
            super(itemView);

            photo = itemView.findViewById(R.id.imageView2);
            name = itemView.findViewById(R.id.fighter_name);
            lived = itemView.findViewById(R.id.life_tv);
        }
    }
}
