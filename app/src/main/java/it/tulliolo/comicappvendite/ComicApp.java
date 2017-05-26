package it.tulliolo.comicappvendite;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

import it.tulliolo.comicappvendite.model.DaoMaster;
import it.tulliolo.comicappvendite.model.DaoSession;

/**
 * Created by 11617047 on 26/05/2017.
 */

public class ComicApp extends Application {

    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "comics-db");
        Database db = helper.getWritableDb();
        mDaoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }
}
