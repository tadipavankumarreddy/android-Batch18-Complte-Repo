package in.nareshtech.batch18.codethons;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContestsAdapter extends RecyclerView.Adapter<ContestsAdapter.ContestsViewHolder> {

    private Context context;
    private List<Contests> contestsList;

    public ContestsAdapter(Context context, List<Contests> contestsList) {
        this.context = context;
        this.contestsList = contestsList;
    }

    @NonNull
    @Override
    public ContestsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContestsViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.one_item_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContestsViewHolder holder, int position) {
        holder.contest_name.setText(contestsList.get(position).getName());
        holder.contest_start.setText(contestsList.get(position).getStart());
        holder.contest_end.setText(contestsList.get(position).getEnd());
        holder.contest_site.setText(contestsList.get(position).getSiteName());
    }

    @Override
    public int getItemCount() {
        return contestsList.size();
    }

    public class ContestsViewHolder extends RecyclerView.ViewHolder {
        TextView contest_name, contest_start, contest_end, contest_site;
        Button contest_url;
        public ContestsViewHolder(@NonNull View itemView) {
            super(itemView);

            contest_name = itemView.findViewById(R.id.contest_name_tv);
            contest_start = itemView.findViewById(R.id.start_time_tv);
            contest_end = itemView.findViewById(R.id.end_time_tv);
            contest_site = itemView.findViewById(R.id.site_name_tv);
            contest_url = itemView.findViewById(R.id.contest_url_btn);
        }
    }
}
