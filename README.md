<h1 align="center">
    MyLibUtils
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-0.0.2-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <p>Kumpulan function sederhana yang sering dipakai dalam development program android, dokumen ini dibuat berdasarkan pengalaman saya, kasih masukan kalau ada yang kurang. terimakasih karna sudah berkunjung</p>
</p>

---

## Download

#### Gradle
**Step 1.** tambahkan maven jitpack.io ke build.gradle (Project) :
```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

**Step 2.** tambahkan depedensi ke build.gradle (Module) :
```gradle
dependencies {
  implementation 'com.github.gzeinnumer:MyLibUtils:versi'
}
```

---

### Featur List
- [x] Conversi Format waktu . contohnya dari yyyy-MM-dd ke dd-MM-yyyy
- [x] Current Time dengan format yang diinginkan

### Tech stack and 3rd library
- SimpleDateFormat ([docs](https://developer.android.com/reference/java/text/SimpleDateFormat))

--- 

##Java
**Conversi Format waktu** value yang disarankan adalah String.
```java
String value ="30-08-2020";

String reformatOneString = MyBaseUtilsDate.reformatDate(value,"dd-MM-yyyy","yyyy-MM-dd", Locale.getDefault());
Log.d(TAG, "onCreate: "+reformatOneString);
```

**Current Time dengan format yang diinginkan**
```java
String currentTime = MyBaseUtilsDate.getCurrentTime("yyyy-MM-dd", Locale.getDefault());
Log.d(TAG, "onCreate: "+currentTime);
```

##Kotlin
**Conversi Format waktu** value yang disarankan adalah String.
```kotlin
var value = "30-08-2020"
Log.d(TAG, "onCreate: before : $value")

value = value.reformatDate("dd-MM-yyyy", "yyyy-MM-dd", Locale.getDefault())
Log.d(TAG, "onCreate: after : $value")
```

**Current Time dengan format yang diinginkan**
```kotlin
val currentTime = MyBaseUtilsDate.getCurrentTime("yyyy-MM-dd", Locale.getDefault())
Log.d(TAG, "onCreate: currentTime : $currentTime")
```

---

```
Copyright 2020 M. Fadli Zein
```
