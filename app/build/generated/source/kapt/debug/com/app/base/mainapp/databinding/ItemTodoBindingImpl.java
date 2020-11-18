package com.app.base.mainapp.databinding;
import com.app.base.mainapp.R;
import com.app.base.mainapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTodoBindingImpl extends ItemTodoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTodoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemTodoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (com.app.base.mainapp.utils.custom_views.CustomTextView) bindings[3]
            , (com.app.base.mainapp.utils.custom_views.CustomTextView) bindings[2]
            , (com.app.base.mainapp.utils.custom_views.CustomTextView) bindings[1]
            );
        this.cvTodo.setTag(null);
        this.tvCompleted.setTag(null);
        this.tvTitle.setTag(null);
        this.tvUserId.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.todo == variableId) {
            setTodo((com.app.base.mainapp.data.source.remote.model.response.TodoItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTodo(@Nullable com.app.base.mainapp.data.source.remote.model.response.TodoItem Todo) {
        this.mTodo = Todo;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.todo);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int todoCompletedBooleanTrueTvCompletedAndroidColorRedTvCompletedAndroidColorAppCardGreen = 0;
        java.lang.String tvUserIdAndroidStringUserIdCharTodoId = null;
        boolean todoCompleted = false;
        java.lang.String todoTitle = null;
        java.lang.String tvCompletedAndroidStringTodoCompletedCharTodoCompleted = null;
        com.app.base.mainapp.data.source.remote.model.response.TodoItem todo = mTodo;
        boolean todoCompletedBooleanTrue = false;
        int todoId = 0;
        java.lang.String tvTitleAndroidStringTodoTitleCharTodoTitle = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (todo != null) {
                    // read todo.completed
                    todoCompleted = todo.getCompleted();
                    // read todo.title
                    todoTitle = todo.getTitle();
                    // read todo.id
                    todoId = todo.getId();
                }


                // read ((@android:string/todo_completed) + (' ')) + (todo.completed)
                tvCompletedAndroidStringTodoCompletedCharTodoCompleted = ((tvCompleted.getResources().getString(R.string.todo_completed)) + (' ')) + (todoCompleted);
                // read todo.completed != true
                todoCompletedBooleanTrue = (todoCompleted) != (true);
                // read ((@android:string/todo_title) + (' ')) + (todo.title)
                tvTitleAndroidStringTodoTitleCharTodoTitle = ((tvTitle.getResources().getString(R.string.todo_title)) + (' ')) + (todoTitle);
                // read ((@android:string/user_id) + (' ')) + (todo.id)
                tvUserIdAndroidStringUserIdCharTodoId = ((tvUserId.getResources().getString(R.string.user_id)) + (' ')) + (todoId);
            if((dirtyFlags & 0x3L) != 0) {
                if(todoCompletedBooleanTrue) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read todo.completed != true ? @android:color/red : @android:color/app_card_green
                todoCompletedBooleanTrueTvCompletedAndroidColorRedTvCompletedAndroidColorAppCardGreen = ((todoCompletedBooleanTrue) ? (getColorFromResource(tvCompleted, R.color.red)) : (getColorFromResource(tvCompleted, R.color.app_card_green)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.tvCompleted.setTextColor(todoCompletedBooleanTrueTvCompletedAndroidColorRedTvCompletedAndroidColorAppCardGreen);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCompleted, tvCompletedAndroidStringTodoCompletedCharTodoCompleted);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, tvTitleAndroidStringTodoTitleCharTodoTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserId, tvUserIdAndroidStringUserIdCharTodoId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): todo
        flag 1 (0x2L): null
        flag 2 (0x3L): todo.completed != true ? @android:color/red : @android:color/app_card_green
        flag 3 (0x4L): todo.completed != true ? @android:color/red : @android:color/app_card_green
    flag mapping end*/
    //end
}