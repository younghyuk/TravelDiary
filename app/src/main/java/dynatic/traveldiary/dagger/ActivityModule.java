package dynatic.traveldiary.dagger;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import dynatic.traveldiary.dagger.scope.PerActivity;

/**
 * Created by yyhyo on 2017-08-13.
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @PerActivity
    public Activity provideActivity() {
        return mActivity;
    }
}
