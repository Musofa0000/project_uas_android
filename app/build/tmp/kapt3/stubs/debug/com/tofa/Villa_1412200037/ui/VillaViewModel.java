package com.tofa.Villa_1412200037.ui;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/tofa/Villa_1412200037/ui/VillaViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/tofa/Villa_1412200037/repository/VillaRepository;", "(Lcom/tofa/Villa_1412200037/repository/VillaRepository;)V", "AllVillas", "Landroidx/lifecycle/LiveData;", "", "Lcom/tofa/Villa_1412200037/model/Villa;", "getAllVillas", "()Landroidx/lifecycle/LiveData;", "delete", "Lkotlinx/coroutines/Job;", "villa", "insert", "update", "app_debug"})
public final class VillaViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.tofa.Villa_1412200037.repository.VillaRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.tofa.Villa_1412200037.model.Villa>> AllVillas = null;
    
    public VillaViewModel(@org.jetbrains.annotations.NotNull
    com.tofa.Villa_1412200037.repository.VillaRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.tofa.Villa_1412200037.model.Villa>> getAllVillas() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull
    com.tofa.Villa_1412200037.model.Villa villa) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull
    com.tofa.Villa_1412200037.model.Villa villa) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job update(@org.jetbrains.annotations.NotNull
    com.tofa.Villa_1412200037.model.Villa villa) {
        return null;
    }
}