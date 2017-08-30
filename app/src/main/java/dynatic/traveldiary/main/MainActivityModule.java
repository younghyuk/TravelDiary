package dynatic.traveldiary.main;

import dagger.Module;
import dagger.Provides;
import dynatic.traveldiary.dagger.scope.PerActivity;

/**
 * Created by yyhyo on 2017-08-13.
 */
@Module
public class MainActivityModule {

    private MainActivityContract.View mView;
    private MainActivityContract.Presenter mPresenter;


    @Provides
    @PerActivity
    MainActivityContract.View providesView() {
        return mView;
    }
}
