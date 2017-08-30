package dynatic.traveldiary.dagger;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yyhyo on 2017-08-13.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(Application application);
}
