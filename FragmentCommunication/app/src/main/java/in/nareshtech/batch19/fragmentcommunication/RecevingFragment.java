package in.nareshtech.batch19.fragmentcommunication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class RecevingFragment extends Fragment {

    private TextView result;
    public RecevingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_receving, container, false);
        result = v.findViewById(R.id.textview);
        return v;
    }

    public void updateData(String data){
        result.setText(data);
    }
}