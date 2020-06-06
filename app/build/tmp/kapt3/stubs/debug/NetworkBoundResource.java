
import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007\b\u0001\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H%J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H%J\b\u0010\u0014\u001a\u00020\u0012H%J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00028\u0001H%\u00a2\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00028\u0001H\u0003\u00a2\u0006\u0002\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00018\u0000H%\u00a2\u0006\u0002\u0010\u001dR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"LNetworkBoundResource;", "ResultType", "RequestType", "", "()V", "asLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/hs/weatherforecast/utils/domain/Resource;", "getAsLiveData$app_debug", "()Landroidx/lifecycle/LiveData;", "dbSource", "mDisposable", "Lio/reactivex/disposables/Disposable;", "result", "Landroidx/lifecycle/MediatorLiveData;", "createCall", "Lio/reactivex/Single;", "fetchFromNetwork", "", "loadFromDb", "onFetchFailed", "saveCallResult", "item", "(Ljava/lang/Object;)V", "saveResultAndReInit", "response", "shouldFetch", "", "data", "(Ljava/lang/Object;)Z", "app_debug"})
public abstract class NetworkBoundResource<ResultType extends java.lang.Object, RequestType extends java.lang.Object> {
    private final androidx.lifecycle.MediatorLiveData<com.hs.weatherforecast.utils.domain.Resource<ResultType>> result = null;
    private io.reactivex.disposables.Disposable mDisposable;
    private androidx.lifecycle.LiveData<ResultType> dbSource;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hs.weatherforecast.utils.domain.Resource<ResultType>> getAsLiveData$app_debug() {
        return null;
    }
    
    private final void fetchFromNetwork(androidx.lifecycle.LiveData<ResultType> dbSource) {
    }
    
    @androidx.annotation.MainThread()
    private final void saveResultAndReInit(RequestType response) {
    }
    
    @androidx.annotation.WorkerThread()
    protected abstract void saveCallResult(RequestType item);
    
    @androidx.annotation.MainThread()
    protected abstract boolean shouldFetch(@org.jetbrains.annotations.Nullable()
    ResultType data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract androidx.lifecycle.LiveData<ResultType> loadFromDb();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract io.reactivex.Single<RequestType> createCall();
    
    @androidx.annotation.MainThread()
    protected abstract void onFetchFailed();
    
    @androidx.annotation.MainThread()
    public NetworkBoundResource() {
        super();
    }
}