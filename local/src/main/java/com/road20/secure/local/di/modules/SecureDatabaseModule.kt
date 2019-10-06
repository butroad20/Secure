package com.road20.secure.local.di.modules

import android.content.Context
import com.road20.secure.local.room.SecureDatabase
import com.road20.secure.local.utils.database
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SecureDatabaseModule {

    @Provides
    @Singleton
    fun provideSecureDatabase(context: Context): SecureDatabase = database(context){
        allowMainThreadQueries()
        fallbackToDestructiveMigration()
        fallbackToDestructiveMigrationOnDowngrade()
    }
}