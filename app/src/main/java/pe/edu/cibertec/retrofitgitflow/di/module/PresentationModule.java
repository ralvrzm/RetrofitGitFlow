package pe.edu.cibertec.retrofitgitflow.di.module;

import dagger.Module;
import dagger.Provides;
import pe.edu.cibertec.retrofitgitflow.domain.main_interactor.IMainInteractor;
import pe.edu.cibertec.retrofitgitflow.domain.main_interactor.MainInteractorImpl;
import pe.edu.cibertec.retrofitgitflow.presentation.main.presenter.MainPresenter;

@Module
public class PresentationModule {
    /* -- Se puede eliminar porque se ha hecho la inyección en el MainPresenter
    @Provides
    MainPresenter provideMainPresenter(IMainInteractor mainInteractor){
        return new MainPresenter(mainInteractor);
    }
    */
    @Provides
    IMainInteractor providerMainInteractor(){
        return new MainInteractorImpl();
    }

}
