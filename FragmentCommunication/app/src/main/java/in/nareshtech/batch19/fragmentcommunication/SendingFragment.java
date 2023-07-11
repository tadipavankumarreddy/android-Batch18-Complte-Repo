package in.nareshtech.batch19.fragmentcommunication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SendingFragment extends Fragment {

    private SendingFragmentListener listener;
    private Button b;
    private EditText e;
    
    public interface SendingFragmentListener{
        void sendDatatoRecevingFragment(String data);
    }
    
    public SendingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sending, container, false);
        e = v.findViewById(R.id.editText1);
        b = v.findViewById(R.id.senddata);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.sendDatatoRecevingFragment(e.getText().toString());
            }
        });
        return v;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof SendingFragmentListener){
            listener = (SendingFragmentListener) context;
        }else{
            Toast.makeText(context, "Listener is initialized", Toast.LENGTH_SHORT).show();
        }
    }
}