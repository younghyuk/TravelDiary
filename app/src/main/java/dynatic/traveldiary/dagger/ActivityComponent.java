package dynatic.traveldiary.dagger;

import dagger.Component;
import dynatic.traveldiary.base.BaseActivity;
import dynatic.traveldiary.dagger.scope.PerActivity;

/**
 * Created by yyhyo on 2017-08-13.
 */
@PerActivity
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(BaseActivity baseActivity);
}
