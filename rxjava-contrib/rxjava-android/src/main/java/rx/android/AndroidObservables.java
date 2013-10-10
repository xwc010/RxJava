package rx.android;

import rx.Observable;
import rx.operators.OperationObserveFromAndroidComponent;

import android.app.Activity;
import android.app.Fragment;

public class AndroidObservables {

    public static <T> Observable<T> fromActivity(Activity activity, Observable<T> sourceObservable) {
        return OperationObserveFromAndroidComponent.observeFromAndroidComponent(sourceObservable, activity);
    }

    public static <T> Observable<T> fromFragment(Fragment fragment, Observable<T> sourceObservable) {
        return OperationObserveFromAndroidComponent.observeFromAndroidComponent(sourceObservable, fragment);
    }

    public static <T> Observable<T> fromFragment(android.support.v4.app.Fragment fragment, Observable<T> sourceObservable) {
        return OperationObserveFromAndroidComponent.observeFromAndroidComponent(sourceObservable, fragment);
    }

}
