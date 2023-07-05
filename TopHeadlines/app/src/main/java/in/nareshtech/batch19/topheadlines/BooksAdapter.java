package in.nareshtech.batch19.topheadlines;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.squareup.picasso.Picasso;

import java.util.List;

import in.nareshtech.batch19.topheadlines.ModelClasses.Item;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.BooksViewHolder> {

    private Context context;
    private List<Item> items;

    public BooksAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public BooksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BooksViewHolder(LayoutInflater.from(context).inflate(R.layout.one_item_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull BooksViewHolder holder, int position) {
        holder.title.setText(items.get(position).getVolumeInfo().getTitle());
        if(items.get(position).getVolumeInfo().getAuthors().size()>1){
            for(String a:items.get(position).getVolumeInfo().getAuthors()){
                holder.author.append(a+" ");
            }
        }else{
            holder.author.setText(items.get(position).getVolumeInfo().getAuthors().get(0));
        }
        Glide.with(context)
                .load(items.get(position).getVolumeInfo().getImageLinks().getSmallThumbnail())
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        e.printStackTrace();
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        return false;
                    }
                })
                .into(holder.imageView);


        Log.v("MAIN",items.get(position).getVolumeInfo().getImageLinks().getSmallThumbnail());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class BooksViewHolder extends RecyclerView.ViewHolder {

        private TextView title,author;
        private ImageView imageView;
        public BooksViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView2);
            author = itemView.findViewById(R.id.textView3);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
