package commonutils.danish.com.commonandroidutils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by Danish on 5/30/2018.
 */

public class CommonUtils
{
    //region genericIntentMethod
    public static void genericIntent(Context context, Class<?> className, Bundle dataPassingBundle, boolean isFinish) {
        if (context != null) {
            Intent intent = new Intent();
            intent.setClass(context, className);
            if (dataPassingBundle != null) intent.putExtras(dataPassingBundle);
            context.startActivity(intent);
            if (isFinish)
                ((Activity) context).finish();
        }

    }
    //endregion

    //region checkIsNetworkAvailable
    public static boolean checkIsNetworkAvailable(Context context) {
        final ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = null;
        if (connMgr != null) {
            activeNetwork = connMgr.getActiveNetworkInfo();
        }
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }
    //endregion


    //region showToast
    public static void showLongToast(Context mContext, String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
    }

    public static void showShortToast(Context mContext, String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }
    //endregion


    //region Helper method to check the language
    public static void checkLanguage(Context context,String lang)
    {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        context.getResources().updateConfiguration(config,context.getResources().getDisplayMetrics());
    }
    //endregion

    //region Helper method to hide the keyboard
    public static void hideKeyboard(Context mContext, View view) {
        InputMethodManager imm = (InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
    //endregion

}
