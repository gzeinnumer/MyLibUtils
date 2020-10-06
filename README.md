<h1 align="center">
    MyLibUtils
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-0.0.9-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/Koltin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <p>Simple function for what?</p>
</p>

---

## Download
**Step 1.** add maven jitpack.io in build.gradle (Project) :
```gradle
// build.gradle project
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

// build.gradle app/module
dependencies {
  implementation 'com.github.gzeinnumer:MyLibUtils:version'
}
```

## Featur List
- [x] Convert **Time Format**. example from `yyyy-MM-dd` to `dd-MM-yyyy`.
- [x] Current Time with custom format.

## Tech stack and 3rd library
- SimpleDateFormat ([docs](https://developer.android.com/reference/java/text/SimpleDateFormat))

--- 

## Use

### Convert **Time Format**.
> **Java**
```java
String value ="30-08-2020";

String oldFormat = "dd-MM-yyyy";
String newFormat = "yyyy-MM-dd";

String reformatOneString = MyBaseUtilsDate.reformatDate(value,oldFormat,newFormat, Locale.getDefault());

Log.d(TAG, "onCreate: "+reformatOneString);
```
> **Kotlin**
```kotlin
var value = "30-08-2020"
Log.d(TAG, "onCreate: before : $value")

val oldFormat = "dd-MM-yyyy"
val newFormat = "yyyy-MM-dd"

value = value.reformatDate(oldFormat,newFormat, Locale.getDefault())

Log.d(TAG, "onCreate: after : $value")
```

### Current Time with custom format.
> **Java**
```java
String currentTime = MyBaseUtilsDate.getCurrentTime("yyyy-MM-dd", Locale.getDefault());
Log.d(TAG, "onCreate: "+currentTime);
```
> **Kotlin**
```kotlin
val currentTime = MyBaseUtilsDate.getCurrentTime("yyyy-MM-dd", Locale.getDefault())
Log.d(TAG, "onCreate: currentTime : $currentTime")
```

---

```
Copyright 2020 M. Fadli Zein
```
