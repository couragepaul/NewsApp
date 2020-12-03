package com.example.newsapp.utils;

import android.content.Context;
import android.util.Log;
import com.example.newsapp.BuildConfig;

import java.text.DecimalFormat;

public class Utils {

    public static void log(String tag, String msg) {
//        if (BuildConfig.DEBUG) {
            Log.e(tag, msg);
//        }
    }

    public static void log(String tag, String msg, int type) {
        if (BuildConfig.DEBUG) {
            switch (type) {
                case Log.ASSERT:
                    break;
                case Log.DEBUG:
                    Log.d(tag, msg);
                    break;
                case Log.ERROR:
                    Log.e(tag, msg);
                    break;
                case Log.WARN:
                    Log.w(tag, msg);
                    break;
                case Log.INFO:
                    Log.i(tag, msg);
                    break;
                case Log.VERBOSE:
                    Log.v(tag, msg);
                    break;
            }


        }
    }
//
//    public static boolean hasPermissions(Context context, String... permissions) {
//        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && context != null && permissions != null) {
//            for (String permission : permissions) {
//                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    /**
     * get pixel value from DP
     */
    public static float dpFromPx(final Context context, final float px) {
        return px / context.getResources().getDisplayMetrics().density;
    }

    /**
     * get DP value from Pixel
     */
    public static float pxFromDp(final Context context, final float dp) {
        return dp * context.getResources().getDisplayMetrics().density;
    }


//    /**
//     * error response process
//     */
//    public static void errorResponse(int responseCode, final Context context, String json, Validation validation,
//                                     final Settings settings, final Activity activity) {
//
//        if (responseCode == 400) {
//            CustomDialog.showGeneralDialog(context, context.getResources().getString(R.string.network),
//                    context.getResources().getString(R.string.bad_request), DialogType.ERROR, null);
//        } else if (responseCode == 401) {
//
//            Utils.log("ERROR JSON ", " : " + json);
//            SuccessResponse val = validation.getGson().fromJson(json,
//                    SuccessResponse.class);
//            CustomDialog.showGeneralDialog(context, context.getResources().getString(R.string.error),
//                    val.Message, DialogType.ERROR, new DialogActionListener() {
//                        @Override
//                        public void onDialogAction(DialogAction action) {
//                            if (activity != null){
//                                settings.logoutAction(activity);
//                            }
//
//                        }
//                    });
//
//        } else if (responseCode == 404) {
////            CustomDialog.showGeneralDialog(context, context.getResources().getString(R.string.error),
////                    " Not Found", DialogType.ERROR, null);
//        } else if (responseCode == 405 || responseCode == 500) {
////            try {
////                CustomDialog.showGeneralDialog(context, context.getResources().getString(R.string.error),
////                        new JSONObject(json).getString("Message"), DialogType.ERROR, null);
////            } catch (JSONException e) {
////                e.printStackTrace();
////            }
//        }
//
//    }

    /**
     * double string formatter
     */
    public static String doubleFormat(double value) {

        DecimalFormat formatter = new DecimalFormat("#,###,###");
        return formatter.format(value);
    }


    /**
     * double currency format
     */
    public static String doubleCurrencyFormat(double value) {

        DecimalFormat formatter = new DecimalFormat("#,###,###.##");
        return formatter.format(value);
    }





}
