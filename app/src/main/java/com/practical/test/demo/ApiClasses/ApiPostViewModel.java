package com.practical.test.demo.ApiClasses;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class ApiPostViewModel extends AndroidViewModel {

    private Repository repository;

    public ApiPostViewModel(@NonNull Application application) {
        super(application);
        this.repository = new Repository(application);
    }

    public LiveData<ClsLoginParams> callLoginAPIModel(ClsLoginParams obj) {
        return repository.callLoginAPI(obj);
    }
}
