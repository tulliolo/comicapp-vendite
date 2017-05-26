package it.tulliolo.comicappvendite;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class ReportsDetailsFragment extends Fragment {

    public static ReportsDetailsFragment newInstance() {
        return new ReportsDetailsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_reports_details, container, false);
    }
}
