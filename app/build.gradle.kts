plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    defaultConfig {
        applicationId = Config.Android.applicationId
        minSdkVersion(Config.Versions.minSdkVersion)
        compileSdkVersion(Config.Versions.compileSdkVersion)
        targetSdkVersion(Config.Versions.targetSdkVersion)
        versionCode = Config.Versions.versionCode
        versionName = Config.Versions.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
//    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation(kotlin("stdlib-jdk7", KotlinVersion))
//    implementation 'androidx.appcompat:appcompat:1.1.0'
//    implementation 'androidx.core:core-ktx:1.0.2'
//    testImplementation 'junit:junit:4.12'
//    androidTestImplementation 'androidx.test:runner:1.2.0'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.2.0'
}
