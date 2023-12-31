package com.tofa.Villa_1412200037.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/tofa/Villa_1412200037/repository/VillaRepository;", "", "villaDao", "Lcom/tofa/Villa_1412200037/Dao/VillaDao;", "(Lcom/tofa/Villa_1412200037/Dao/VillaDao;)V", "allVillas", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/tofa/Villa_1412200037/model/Villa;", "getAllVillas", "()Lkotlinx/coroutines/flow/Flow;", "deletevilla", "", "villa", "(Lcom/tofa/Villa_1412200037/model/Villa;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertvilla", "updatevilla", "app_debug"})
public final class VillaRepository {
    @org.jetbrains.annotations.NotNull
    private final com.tofa.Villa_1412200037.Dao.VillaDao villaDao = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.tofa.Villa_1412200037.model.Villa>> allVillas = null;
    
    public VillaRepository(@org.jetbrains.annotations.NotNull
    com.tofa.Villa_1412200037.Dao.VillaDao villaDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.tofa.Villa_1412200037.model.Villa>> getAllVillas() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertvilla(@org.jetbrains.annotations.NotNull
    com.tofa.Villa_1412200037.model.Villa villa, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deletevilla(@org.jetbrains.annotations.NotNull
    com.tofa.Villa_1412200037.model.Villa villa, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updatevilla(@org.jetbrains.annotations.NotNull
    com.tofa.Villa_1412200037.model.Villa villa, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}