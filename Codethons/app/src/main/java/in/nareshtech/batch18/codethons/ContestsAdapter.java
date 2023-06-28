package in.nareshtech.batch18.codethons;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
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
        holder.contest_start.setText(formatDateTime(contestsList.get(position).getStart()));
        holder.contest_end.setText(formatDateTime(contestsList.get(position).getEnd()));
        holder.contest_site.setText(contestsList.get(position).getSiteName());
    }

    public String formatDateTime(String time){
        String date = time.substring(0,10);
        String t[] = time.substring(11,16).split(":");
        if(Integer.parseInt(t[0]) == 0){
            return date+", 12"+":"+t[1]+" AM";
        }

        if(Integer.parseInt(t[0]) > 12){
            t[0] = String.valueOf(Integer.parseInt(t[0]) - 12);
            return date+", "+t[0]+":"+t[1]+" PM";
        }

        return date+", "+t[0]+":"+t[1]+" AM";
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

            contest_url.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    String url = contestsList.get(position).getContestURL();
                    CustomTabsIntent intent = new CustomTabsIntent.Builder()
                            .setDefaultColorSchemeParams(new CustomTabColorSchemeParams.Builder()
                                    .setToolbarColor(Color.RED)
                                    .build())
                            // set the alternative dark color scheme
                            .setColorSchemeParams(CustomTabsIntent.COLOR_SCHEME_DARK, new CustomTabColorSchemeParams.Builder()
                                    .setToolbarColor(Color.BLACK)
                                    .build())
                            .setStartAnimations(context, android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                            .setExitAnimations(context, android.R.anim.fade_out, android.R.anim.slide_out_right)
                            .build();
                    intent.launchUrl(context, Uri.parse(url));
                }
            });
        }
    }
}
