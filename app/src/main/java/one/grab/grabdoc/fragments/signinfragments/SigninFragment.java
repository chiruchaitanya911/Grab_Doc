package one.grab.grabdoc.fragments.signinfragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import one.grab.grabdoc.R;


public class SigninFragment extends Fragment {

    Activity thisActivity;
    Fragment thisFragment;
    Resources res;
    View v;
    Unbinder unbinder;
    @BindView(R.id.et_mobile_no)
    EditText et_mobile_no;
    @BindView(R.id.btn_verification)
    Button btn_verification;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        thisActivity = getActivity();
        thisFragment = this;
        res = thisActivity.getResources();

        if (v == null) {
            v = inflater.inflate(R.layout.fragment_signin, container, false);
        }
        unbinder = ButterKnife.bind(this, v);
        init(v);
        return v;
    }

    void init(View v) {

        btn_verification.setOnClickListener(new OnClick());
        et_mobile_no.setOnClickListener(new OnClick());

    }

    class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.btn_verification:

                    FragmentTransaction transactionVerification = getFragmentManager().beginTransaction();
                    VerificationFragment verificationFragment = new VerificationFragment();
                    transactionVerification.setCustomAnimations(R.animator.fragment_enter, R.animator.fragment_exit, R.animator.fragment_reverse_enter, R.animator.fragment_reverse_exit);
                    transactionVerification.replace(R.id.frmRoot, verificationFragment, "VerificationFragment");
                    transactionVerification.addToBackStack("VerificationFragment");
                    transactionVerification.commit();

                    break;
                case R.id.et_mobile_no:
                    break;

            }
        }
    }
}