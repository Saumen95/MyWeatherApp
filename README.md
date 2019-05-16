# WeatherApp for android

## Libraries Used

**Butterknife:**(https://github.com/JakeWharton/butterknife)
Field and method binding for Android views which uses annotation processing to generate boilerplate code for you.
To install butterknife,add this lines to app.gradle:
dependencies {
  implementation 'com.jakewharton:butterknife:10.1.0'
  annotationProcessor 'com.jakewharton:butterknife-compiler:10.1.0'
}

**Retrofit2:**(https://github.com/square/retrofit)
Type-safe HTTP client for Android and Java by Square. Retrofit turns your HTTP API into a Java interface.
To use retrofit in this app,include it in app.gradle:
dependencies{
    implementation 'com.squareup.retrofit2:retrofit:2.5.0'
}

Retrofit should use a parser to parse data files(e.g: json)
Most commonly,we use gson library.To include it in app gradle:
dependencies {
  implementation 'com.google.code.gson:gson:2.8.5'
}
For more about Gson:(https://github.com/google/gson)

**Android Cardview:**
The CardView widget is part of the v7 Support Libraries. To use it in your project, add the following dependency to your app module's build.gradle file:
dependencies {
    implementation 'com.android.support:cardview-v7:28.0.0'
}

**Picasso:**(http://square.github.io/picasso/)
Images add much-needed context and visual flair to Android applications. Picasso allows for hassle-free image loading in your application—often in one line of code!
To add it to app gradle:
dependencies {
  implementation 'com.squareup.picasso:picasso:2.71828'
}



### API:
We have used this:(https://openweathermap.org/api)
 You can find API key fom your account dashboard.

