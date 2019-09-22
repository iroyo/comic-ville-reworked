/**
 * Created by iroyo on 2019-09-08.
 * Mail: iroyoraso@gmail.com
 */

object AppData {
    const val id = "com.iroyoraso.comicville"
    const val compileSdk = 28
    const val targetSdk = 28
    const val minSdk = 19
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Versions {
    // Application
    const val kotlin = "1.3.50"
    const val gradle = "3.5.0"

    // Core
    const val material = "1.0.0"
    const val androidX = "1.1.0"
    const val androidXAnnotation = "1.1.0"
    const val lifecycle = "2.1.0"
    const val paging = "2.1.0"
    const val coroutines = "1.1.1"
    const val okHttp = "3.12.0"
    const val retrofit = "2.6.0"
    const val serialization = "0.12.0"
    const val serializationConverter = "0.4.0"
    const val room = "2.1.0"

    // UI
    const val constraintLayout = "1.1.3"
    const val googleAndroidMaterial = "1.0.0"
}

object Libraries {

    // Core
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"

    const val coreKTX = "androidx.core:core-ktx:${Versions.androidX}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.androidX}"
    const val androidxAnnotation = "androidx.annotation:annotation:${Versions.androidXAnnotation}"

    const val material = "com.google.android.material:material:${Versions.material}"

    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val pagingRuntime = "androidx.paging:paging-runtime-ktx:${Versions.paging}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    const val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okhttp3Interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val kotlinSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.serialization}"
    const val kotlinSerializationConverter = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.serializationConverter}"

    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKTX = "androidx.room:room-ktx:${Versions.room}"

    // UI
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val googleAndroidMaterial = "com.google.android.material:material:${Versions.googleAndroidMaterial}"


}