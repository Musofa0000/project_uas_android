package com.tofa.Villa_1412200037.ui;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/tofa/Villa_1412200037/ui/VillaListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/tofa/Villa_1412200037/model/Villa;", "Lcom/tofa/Villa_1412200037/ui/VillaListAdapter$VillaViewHolder;", "onItemClickListener", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "VillaViewHolder", "app_debug"})
public final class VillaListAdapter extends androidx.recyclerview.widget.ListAdapter<com.tofa.Villa_1412200037.model.Villa, com.tofa.Villa_1412200037.ui.VillaListAdapter.VillaViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.tofa.Villa_1412200037.model.Villa, kotlin.Unit> onItemClickListener = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.tofa.Villa_1412200037.model.Villa> WORDS_COMPARATOR = null;
    @org.jetbrains.annotations.NotNull
    public static final com.tofa.Villa_1412200037.ui.VillaListAdapter.Companion Companion = null;
    
    public VillaListAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.tofa.Villa_1412200037.model.Villa, kotlin.Unit> onItemClickListener) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.tofa.Villa_1412200037.ui.VillaListAdapter.VillaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.tofa.Villa_1412200037.ui.VillaListAdapter.VillaViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/tofa/Villa_1412200037/ui/VillaListAdapter$Companion;", "", "()V", "WORDS_COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/tofa/Villa_1412200037/model/Villa;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/tofa/Villa_1412200037/ui/VillaListAdapter$VillaViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "addressTextView", "Landroid/widget/TextView;", "capacityTextView", "nameTextView", "bind", "", "villa", "Lcom/tofa/Villa_1412200037/model/Villa;", "Companion", "app_debug"})
    public static final class VillaViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView nameTextView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView addressTextView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView capacityTextView = null;
        @org.jetbrains.annotations.NotNull
        public static final com.tofa.Villa_1412200037.ui.VillaListAdapter.VillaViewHolder.Companion Companion = null;
        
        public VillaViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.Nullable
        com.tofa.Villa_1412200037.model.Villa villa) {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tofa/Villa_1412200037/ui/VillaListAdapter$VillaViewHolder$Companion;", "", "()V", "create", "Lcom/tofa/Villa_1412200037/ui/VillaListAdapter$VillaViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.tofa.Villa_1412200037.ui.VillaListAdapter.VillaViewHolder create(@org.jetbrains.annotations.NotNull
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
}