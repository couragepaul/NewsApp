package com.example.newsapp.activities.ui.content_package;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContentPackageViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ContentPackageViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}