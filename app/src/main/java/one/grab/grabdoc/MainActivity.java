package one.grab.grabdoc;



import android.app.FragmentTransaction;
import android.os.Bundle;

import one.grab.grabdoc.fragments.DashboardFragment;
import one.grab.grabdoc.fragments.signinfragments.SigninFragment;

public class MainActivity extends ParentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*FragmentTransaction transaction = getFragmentManager().beginTransaction();
        Bundle b = new Bundle();
        DashboardFragment dashboardFragment = new DashboardFragment();
        dashboardFragment.setArguments(b);
        transaction.setCustomAnimations(R.animator.fragment_enter, R.animator.fragment_exit, R.animator.fragment_reverse_enter, R.animator.fragment_reverse_exit);
        transaction.replace(R.id.frmRoot, dashboardFragment, "DashboardFragment");
        transaction.addToBackStack("DashboardFragment");
        transaction.commit();*/

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        Bundle b = new Bundle();
        SigninFragment signinFragment = new SigninFragment();
        signinFragment.setArguments(b);
        transaction.setCustomAnimations(R.animator.fragment_enter, R.animator.fragment_exit, R.animator.fragment_reverse_enter, R.animator.fragment_reverse_exit);
        transaction.replace(R.id.frmRoot, signinFragment, "SignInFragment");
        transaction.addToBackStack("SignInFragment");
        transaction.commit();

    }
}