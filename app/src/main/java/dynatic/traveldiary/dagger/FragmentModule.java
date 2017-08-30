package dynatic.traveldiary.dagger;

import android.app.Fragment;

import dagger.Module;
import dagger.Provides;
import dynatic.traveldiary.dagger.scope.PerFragment;

/**
 * Created by yyhyo on 2017-08-13.
 */
@Module
public class FragmentModule {
    private Fragment mFragment;

    public FragmentModule(Fragment fragment) {
        mFragment = fragment;
    }

    @Provides
    @PerFragment
    public Fragment provideFragment() {
        return mFragment;
    }
}
