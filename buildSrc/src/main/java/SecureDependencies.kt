import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.project

const val KotlinVersion = "1.3.41"

object Config {
    object Versions {
        const val minSdkVersion = 21
        const val compileSdkVersion = 29
        const val targetSdkVersion = 29
        const val versionName = "1.0.0"
        const val versionCode = 1
        const val navigation = "2.2.0-alpha01"
        const val gradle = "3.5.0"
    }
    object Android {
        const val applicationId = "com.butroad20.secure"
    }
    object Classpaths {
        const val navigation = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
        const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KotlinVersion"
    }
}

object Dependencies {
    object AndroidX {
        object Versions {
            const val coreKtx = "1.1.0"
            const val fragmentKtx = "1.2.0-alpha02"
            const val appCompat = "1.1.0-rc01"
            const val constraintLayout = "2.0.0-beta1"
            const val lifecycle = "2.0.0"
            const val workManager = "2.2.0"
            const val navigation = "2.2.0-alpha01"
            const val multidex = "2.0.1"
        }

        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val androidFragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        const val legacySupport = ""
        const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
        const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val multidex = "androidx.multidex:multidex:${Versions.multidex}"
        const val workManager = "androidx.work:work-runtime-ktx:${Versions.workManager}"
        const val workManagerRx = "androidx.work:work-rxjava2:${Versions.workManager}"
    }

    object Network {
        object Versions {
            const val okhttp = "3.12.0"
            const val retrofit = "2.4.0"
            const val scarlet = "0.2.4"
            const val stetho = "1.5.1"
        }
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val rxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"

        const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"

        const val scarlet = "com.github.tinder.scarlet:scarlet:${Versions.scarlet}"
        const val scarletRxJava = "com.github.tinder.scarlet:scarlet-stream-adapter-rxjava2:${Versions.scarlet}"
        const val scarletGson = "com.github.tinder.scarlet:scarlet-message-adapter-gson:${Versions.scarlet}"
        const val scarletWebSocket = "com.github.tinder.scarlet:scarlet-protocol-websocket-okhttp:${Versions.scarlet}"
        const val scarletLifecycle = "com.github.tinder.scarlet:scarlet-lifecycle-android:${Versions.scarlet}"
    }

    object DependencyInjection {
        object Versions {
            const val javaxAnnotation = "1.0"
            const val javaxInject = "1"
            const val dagger = "2.24"
        }
        const val javax = "javax.inject:javax.inject:${Versions.javaxInject}"
        const val javaxAnnotation = "javax.annotation:jsr250-api:${Versions.javaxAnnotation}"
        const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
        const val daggerProcessor = "com.google.dagger:dagger-compiler:${Versions.dagger}"
        const val daggerAndroid = "com.google.dagger:dagger-android-support:${Versions.dagger}"
        const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    }

    object Persistence {
        object Versions {
            const val roomVersion = "2.2.0-rc01"
        }

        const val room = "androidx.room:room-runtime:${Versions.roomVersion}"
        const val roomRxJava = "androidx.room:room-rxjava2:${Versions.roomVersion}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
    }

    object View {
        object Versions {
            const val materialComponent = "1.1.0-alpha09"
            const val rxAnimation = "0.0.6"
            const val shimmerLayout = "0.4.0"
            const val fresco = "2.0.0"
            const val groupie = "2.3.0"
        }

        const val materialComponent = "com.google.android.material:material:${Versions.materialComponent}"
        const val rxAnimation = "com.mikhaellopez:rxanimation:${Versions.rxAnimation}"
        const val shimmerLayout = "com.facebook.shimmer:shimmer:${Versions.shimmerLayout}"
        const val fresco = "com.facebook.fresco:fresco:${Versions.fresco}"
        const val groupie = "com.xwray:groupie:${Versions.groupie}"
        const val groupieDatabinding = "com.xwray:groupie-databinding:${Versions.groupie}"
        const val groupieExtensions = "com.xwray:groupie-kotlin-android-extensions:${Versions.groupie}"
    }

    object Utilities {
        object Versions {
            const val recyclerAnimator = "3.0.0"
            const val gson = "2.8.5"
            const val timber = "4.7.1"
            const val overscrollDecor = "1.0.4"
        }

        const val recyclerAnimator = "jp.wasabeef:recyclerview-animators:${Versions.recyclerAnimator}"
        const val gson = "com.google.code.gson:gson:${Versions.gson}"
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
        const val overscrollDecor = "me.everything:overscroll-decor-android:${Versions.overscrollDecor}"
    }

    object Async {
        object Versions {
            const val rxAndroid = "2.1.1"
            const val rxJava = "2.2.6"
        }

        const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
        const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    }

    object Test {
        object JUnit {

        }

        object Android {

        }
    }
}

fun DependencyHandler.inject() {
    add("implementation", Dependencies.DependencyInjection.javax)
    add("kapt", Dependencies.DependencyInjection.javaxAnnotation)
}

fun DependencyHandler.implementDI() {
    add("implementation", Dependencies.DependencyInjection.dagger)
    add("kapt", Dependencies.DependencyInjection.daggerProcessor)
    add("implementation", Dependencies.DependencyInjection.daggerAndroid)
    add("kapt", Dependencies.DependencyInjection.daggerAndroidProcessor)
}

fun DependencyHandler.implementRoom() {
    add("implementation", Dependencies.Persistence.room)
    add("implementation", Dependencies.Persistence.roomRxJava)
    add("kapt", Dependencies.Persistence.roomCompiler)
}

fun DependencyHandler.implementRetrofit() {
    add("implementation", Dependencies.Network.retrofit)
    add("implementation", Dependencies.Network.okhttp)
    add("implementation", Dependencies.Network.loggingInterceptor)
    add("implementation", Dependencies.Network.rxJavaAdapter)
    add("implementation", Dependencies.Network.gsonConverter)
    add("implementation", Dependencies.Network.stetho)
}

fun DependencyHandler.implementAsync() {
    add("implementation", Dependencies.Async.rxJava)
    add("implementation", Dependencies.Async.rxAndroid)
}

fun DependencyHandler.implementLocal() {
    implementDI()
    implementRoom()
    add("implementation", kotlin("stdlib-jdk7", KotlinVersion))
    add("implementation", project(":repository"))
}

fun DependencyHandler.implementRemote() {
    implementDI()
    implementRetrofit()
    add("implementation", Dependencies.Utilities.timber)
    add("implementation", kotlin("stdlib-jdk7", KotlinVersion))
    add("implementation", project(":repository"))
}

fun DependencyHandler.implementAndroidX() {
    add("implementation", Dependencies.AndroidX.coreKtx)
    add("implementation", Dependencies.AndroidX.constraintLayout)
    add("implementation", Dependencies.View.materialComponent)
    add("implementation", Dependencies.AndroidX.lifecycle)
    add("kapt", Dependencies.AndroidX.lifecycleCompiler)
    add("implementation", Dependencies.AndroidX.navigationUiKtx)
    add("implementation", Dependencies.AndroidX.navigationFragmentKtx)
}

fun DependencyHandler.implementRepository() {
    add("implementation", kotlin("stdlib-jdk7", KotlinVersion))
    add("implementation", project(":domain"))
    implementAsync()
    inject()
}

fun DependencyHandler.implementDomain() {
    add("implementation", kotlin("stdlib-jdk7", KotlinVersion))
    implementAsync()
    inject()
}

fun DependencyHandler.implementCore() {
    add("implementation", kotlin("stdlib-jdk7", KotlinVersion))
    implementAndroidX()
    implementDI()
    implementAsync()
    add("api", project(":local"))
    add("api", project(":remote"))
    add("api", project(":repository"))
    add("api", project(":domain"))
}

fun DependencyHandler.implementApp() {
    add("implementation", kotlin("stdlib-jdk7", KotlinVersion))
    add("implementation", project(":core"))
    implementAndroidX()
    implementAsync()
    implementDI()
}

fun DependencyHandler.implementAuthentication() {
    add("implementation", kotlin("stdlib-jdk7", KotlinVersion))
    add("implementation", project(":core"))
    implementAndroidX()
    implementAsync()
    implementDI()
}