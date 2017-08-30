package dynatic.traveldiary.application;

import android.app.Application;

import dynatic.traveldiary.dagger.DaggerApplicationComponent;

/**
 * Created by yyhyo on 2017-08-13.
 */

public class AndroidApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerApplicationComponent.builder().build().inject(this);
    }
}
