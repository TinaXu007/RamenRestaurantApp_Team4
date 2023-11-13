// Generated by Dagger (https://google.github.io/dagger).
package com.alpharamen.customer.data.local.room;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MusicDbHelper_Factory implements Factory<MusicDbHelper> {
  private final Provider<Context> contextProvider;

  public MusicDbHelper_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MusicDbHelper get() {
    return provideInstance(contextProvider);
  }

  public static MusicDbHelper provideInstance(Provider<Context> contextProvider) {
    return new MusicDbHelper(contextProvider.get());
  }

  public static MusicDbHelper_Factory create(Provider<Context> contextProvider) {
    return new MusicDbHelper_Factory(contextProvider);
  }

  public static MusicDbHelper newMusicDbHelper(Context context) {
    return new MusicDbHelper(context);
  }
}