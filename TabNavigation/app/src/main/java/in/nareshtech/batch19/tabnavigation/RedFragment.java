package in.nareshtech.batch19.tabnavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RedFragment extends Fragment implements View.OnClickListener {

    private Button add, substract, multiply, divide;
    private EditText num1, num2;
    private TextView tv;

    public RedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_red, container, false);
        // Logic for getting the fragment into action
        intializeTheViews(v);
        add.setOnClickListener(this);
        substract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);

        return v;
    }

    private void intializeTheViews(View v) {
        add = v.findViewById(R.id.add);
        substract = v.findViewById(R.id.substract);
        multiply = v.findViewById(R.id.multiply);
        divide = v.findViewById(R.id.divide);
        num1 = v.findViewById(R.id.number_1);
        num2 = v.findViewById(R.id.number_2);
        tv = v.findViewById(R.id.result);
    }

    @Override
    public void onClick(View v) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int n3 = 0;

        if(v.getId() == R.id.add)
            n3 = n1+n2;
        if(v.getId() == R.id.substract)
            n3 = n1-n2;
        if(v.getId() == R.id.multiply)
            n3 = n1 * n2;
        if(v.getId() == R.id.divide)
            n3 = n1/n2;

        tv.setText(String.valueOf(n3));
    }
}