// Generated by Dagger (https://dagger.dev).
package com.hs.weatherforecast.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final NetModule module;

  public NetModule_ProvideOkHttpClientFactory(NetModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(module);
  }

  public static NetModule_ProvideOkHttpClientFactory create(NetModule module) {
    return new NetModule_ProvideOkHttpClientFactory(module);
  }

  public static OkHttpClient provideOkHttpClient(NetModule instance) {
    return Preconditions.checkNotNull(instance.provideOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
