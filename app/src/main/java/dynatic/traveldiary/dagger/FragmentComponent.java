package dynatic.traveldiary.dagger;

import android.app.Fragment;

import dagger.Component;
import dynatic.traveldiary.dagger.scope.PerFragment;

/**
 * Created by yyhyo on 2017-08-13.
 */
@PerFragment
@Component(modules = {FragmentModule.class})
public interface FragmentComponent {
    void inject(Fragment fragment);
}
