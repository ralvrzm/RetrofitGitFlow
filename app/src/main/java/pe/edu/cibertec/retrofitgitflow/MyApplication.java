package pe.edu.cibertec.retrofitgitflow;

import android.app.Application;

import pe.edu.cibertec.retrofitgitflow.di.component.DaggerPresentationComponent;
import pe.edu.cibertec.retrofitgitflow.di.component.PresentationComponent;
import pe.edu.cibertec.retrofitgitflow.di.module.PostDetailModule;
import pe.edu.cibertec.retrofitgitflow.di.module.PresentationModule;

public class MyApplication extends Application {
    private PresentationComponent appComponent;

    @Override
    public void onCreate(){
        super.onCreate();
        inicializarComponent();
    }

    void inicializarComponent() {
        appComponent = DaggerPresentationComponent.builder()
        .presentationModule(new PresentationModule())
        .postDetailModule(new PostDetailModule())
        .build();
    }

    public PresentationComponent getAppComponent(){
        return appComponent;
    }
}
