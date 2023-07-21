package com.tofa.Villa_1412200037.Dao;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/tofa/Villa_1412200037/Dao/VillaDao;", "", "Deletevilla", "", "villa", "Lcom/tofa/Villa_1412200037/model/Villa;", "(Lcom/tofa/Villa_1412200037/model/Villa;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Insertvilla", "Updatevilla", "getAllVilla", "Lkotlinx/coroutines/flow/Flow;", "", "app_debug"})
@androidx.room.Dao
public abstract interface VillaDao {
    
    @androidx.room.Query(value = "SELECT * FROM `villa_table` ORDER BY name ASC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.tofa.Villa_1412200037.model.Villa>> getAllVilla();
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object Insertvilla(@org.jetbrains.annotations.NotNull
    com.tofa.Villa_1412200037.model.Villa villa, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object Deletevilla(@org.jetbrains.annotations.NotNull
    com.tofa.Villa_1412200037.model.Villa villa, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object Updatevilla(@org.jetbrains.annotations.NotNull
    com.tofa.Villa_1412200037.model.Villa villa, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}