package dynatic.traveldiary.main;

/**
 * Created by yyhyo on 2017-08-13.
 */

public interface MainActivityContract {
    interface View {
        void showToast(String text);
    }

    interface Presenter {
        void onToastClick();
    }
}
