package in.vidhvan.countriesoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView countries_list_lv;
    String[] cs;
    int[] images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countries_list_lv = findViewById(R.id.countries_list);

        // TODO 1: Prepare the data and set it on top of the Listview
        cs = new String[]{"India", "USA", "UK", "Germany", "France", "Australia", "China", "Bangladesh",
        "Pakistan","Afghanistan","Srilanka"};

        images = new int[]{R.drawable.india, R.drawable.usa, R.drawable.uk, R.drawable.germany,
        R.drawable.france, R.drawable.australia, R.drawable.china, R.drawable.bangladesh,
        R.drawable.pakistan, R.drawable.afghanistan, R.drawable.srilanka};

        LVAdapter adapter = new LVAdapter();
        /*ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, cs);*/

        countries_list_lv.setAdapter(adapter);

        countries_list_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String n = cs[position];
                Toast.makeText(MainActivity.this, n, Toast.LENGTH_SHORT).show();
            }
        });
    }

    class LVAdapter extends BaseAdapter{

        // It indicates how many views are there in total
        @Override
        public int getCount() {
            return cs.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null){
                convertView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.custom_layout_for_lv,parent,false);
            }

            TextView tv = convertView.findViewById(R.id.textView);
            ImageView iv = convertView.findViewById(R.id.imageView);
            tv.setText(cs[position]);
            iv.setImageResource(images[position]);

            return convertView;
        }
    }
}