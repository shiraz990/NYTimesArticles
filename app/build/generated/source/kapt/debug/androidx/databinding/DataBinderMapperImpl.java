package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.app.base.mainapp.DataBinderMapperImpl());
  }
}
