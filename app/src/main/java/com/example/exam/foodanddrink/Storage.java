package com.example.exam.foodanddrink;

import android.content.Context;
import android.content.SharedPreferences;

public class Storage {
    private static String MY_DATA_KEY = "MyData";
    private static String EMAIL_KEY = "email";
    private static String PASSWORD_KEY = "password";
    private static String EMAIL = "";
    private static String PASSWORD = "";
    private Context mContext;

    public Storage(Context context) {
        this.mContext = context;
        saveEmail("mahdi@gmail.com");
        savePassword("123456");
    }

    private SharedPreferences.Editor getPreferencesEditor() {
        return getSharedPreferences().edit();
    }

    private SharedPreferences getSharedPreferences() {
        return mContext.getSharedPreferences(MY_DATA_KEY, Context.MODE_PRIVATE);
    }

    public void saveEmail(String username) {
        getPreferencesEditor().putString(EMAIL_KEY, username).commit();
    }

    public String getEmail() {
        return getSharedPreferences().getString(EMAIL_KEY, EMAIL);
    }

    public void savePassword(String username) {
        getPreferencesEditor().putString(PASSWORD_KEY, username).commit();
    }

    public String getPassword() {
        return getSharedPreferences().getString(PASSWORD_KEY, PASSWORD);
    }


}
