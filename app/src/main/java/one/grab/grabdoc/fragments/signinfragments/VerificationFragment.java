package one.grab.grabdoc.fragments.signinfragments;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import one.grab.grabdoc.R;


public class VerificationFragment extends Fragment {


    Activity thisActivity;
    Fragment thisFragment;
    Resources res;
    View v;
    Unbinder unbinder;
    @BindView(R.id.et_first_no) EditText et_first_no;
    @BindView(R.id.et_second_no) EditText et_second_no;
    @BindView(R.id.et_third_no) EditText et_third_no;
    @BindView(R.id.et_four_no) EditText et_four_no;
    @BindView(R.id.btn_verify_proceed) Button btn_verify_proceed;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        thisActivity = getActivity();
        thisFragment = this;
        res = thisActivity.getResources();

        if (v == null) {
            v =  inflater.inflate(R.layout.fragment_verification, container, false);
        }

        unbinder = ButterKnife.bind(this,v);
        init(v);

        return  v ;

    }

    void init(View v) {
        btn_verify_proceed.setOnClickListener(new OnClick());
    }

    class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_verify_proceed:
                    break;
            }
        }
    }
}