package it.tulliolo.comicappvendite;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;

/**
 * Created by 11617047 on 26/05/2017.
 */

public class ComicAppFragmentFactory {
    public static Fragment newFragment(@IdRes int id) {
        Fragment fragment = null;
        switch (id) {
            case R.id.menu_item_catalogue:
                fragment = CatalogueFragment.newInstance();
                break;
            case R.id.menu_item_sales:
                fragment = SalesFragment.newInstance();
                break;
            case R.id.menu_item_reports:
                fragment = ReportsFragment.newInstance();
                break;
        }
        return fragment;
    }
}
