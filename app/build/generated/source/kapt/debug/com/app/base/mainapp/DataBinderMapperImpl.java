package com.app.base.mainapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.app.base.mainapp.databinding.ActivityBaseBindingImpl;
import com.app.base.mainapp.databinding.FragmentHomeBindingImpl;
import com.app.base.mainapp.databinding.FragmentLoginBindingImpl;
import com.app.base.mainapp.databinding.ItemTodoBindingImpl;
import com.app.base.mainapp.databinding.ViewRegistrationHeaderBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBASE = 1;

  private static final int LAYOUT_FRAGMENTHOME = 2;

  private static final int LAYOUT_FRAGMENTLOGIN = 3;

  private static final int LAYOUT_ITEMTODO = 4;

  private static final int LAYOUT_VIEWREGISTRATIONHEADER = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.item_todo, LAYOUT_ITEMTODO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.view_registration_header, LAYOUT_VIEWREGISTRATIONHEADER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYBASE: {
          if ("layout/activity_base_0".equals(tag)) {
            return new ActivityBaseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_base is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTODO: {
          if ("layout/item_todo_0".equals(tag)) {
            return new ItemTodoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_todo is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWREGISTRATIONHEADER: {
          if ("layout/view_registration_header_0".equals(tag)) {
            return new ViewRegistrationHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_registration_header is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "todo");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_base_0", com.app.base.mainapp.R.layout.activity_base);
      sKeys.put("layout/fragment_home_0", com.app.base.mainapp.R.layout.fragment_home);
      sKeys.put("layout/fragment_login_0", com.app.base.mainapp.R.layout.fragment_login);
      sKeys.put("layout/item_todo_0", com.app.base.mainapp.R.layout.item_todo);
      sKeys.put("layout/view_registration_header_0", com.app.base.mainapp.R.layout.view_registration_header);
    }
  }
}
