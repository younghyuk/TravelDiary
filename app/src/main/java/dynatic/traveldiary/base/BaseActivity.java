package dynatic.traveldiary.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import dynatic.traveldiary.dagger.DaggerActivityComponent;

/**
 * Created by yyhyo on 2017-08-13.
 */

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerActivityComponent.create().inject(this);
    }

}
