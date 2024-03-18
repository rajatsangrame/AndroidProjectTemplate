plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    id("kotlin-parcelize")
}

android {
    namespace = "com.rajatsangrame.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.rajatsangrame.myapplication"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {


    val constraintLayoutVersion = "2.1.4"
    val recyclerViewVersion = "1.3.2"
    val materialVersion = "1.11.0"
    val fragmentKtx = "1.6.2"
    val navigation = "2.7.6"
    val gsonVersion = "2.10"
    val room = "2.6.1"

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")
    implementation("androidx.fragment:fragment-ktx:1.6.2")
    implementation("androidx.recyclerview:recyclerview:$recyclerViewVersion")
    implementation("com.google.android.material:material:$materialVersion")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Fragment & Navigation Ktx
    implementation("androidx.fragment:fragment-ktx:$fragmentKtx")
    implementation("androidx.navigation:navigation-fragment-ktx:$navigation")
    implementation("androidx.navigation:navigation-ui-ktx:$navigation")

    // Timber
    implementation("com.jakewharton.timber:timber:5.0.1")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.50")
    kapt("com.google.dagger:hilt-compiler:2.50")

    // Gson
    implementation("com.google.code.gson:gson:$gsonVersion")

    implementation("androidx.room:room-ktx:$room")
    kapt("androidx.room:room-compiler:$room")

}