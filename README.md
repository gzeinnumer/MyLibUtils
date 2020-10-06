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
    <p>Simple function for **Date** and **String**.</p>
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

## Feature List
- [x] Convert **Time Format**. example from `yyyy-MM-dd` to `dd-MM-yyyy`.
- [x] **Current Time** with custom format. example `yyyy-MM-dd hh:mm`.
- [x] **Is Date In Range?**.

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

### **Current Time** with custom format.
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

### **Is Date In Range?**
To check your date is in range between 2 date or not.
> **Java**
* Date with `String`
```java
//please make sure your date format are the same.
String toCheck = "07/10/2020";
String startDate ="04/10/2020";
String endDate = "08/10/2020";

boolean isInRange = MyBaseUtilsDate.checkBetween(toCheck, startDate,endDate);

Log.d(TAG, "onCreate: "+isInRange);
```
* Date with `Date()`
```java
try {
    String formatDate = "dd/MM/yyyy";
    SimpleDateFormat df = new SimpleDateFormat(formatDate);
    
    Date toCheck   = df.parse("07/10/2020");
    Date startDate = df.parse("04/10/2020");
    Date endDate   = df.parse("08/10/2020");

    boolean isInRange = MyBaseUtilsDate.checkBetween(toCheck, startDate,endDate);

    Log.d(TAG, "onCreate: "+isInRange);
} catch (ParseException e) {
    
}
```
> **Kotlin**
```kotlin
//please make sure your date format are the same.
//with String
val toCheck = "07/10/2020"
val startDate ="04/10/2020"
val endDate = "08/10/2020"

val isInRange = MyBaseUtilsDate.checkBetween(toCheck, startDate,endDate)

Log.d(TAG, "onCreate: "+isInRange)

//or `Date()`
try {
    val toCheck  = SimpleDateFormat("dd/MM/yyyy").parse("07/10/2020")
    val startDate= SimpleDateFormat("dd/MM/yyyy").parse("04/10/2020")
    val endDate  = SimpleDateFormat("dd/MM/yyyy").parse("08/10/2020")

    val isInRange = MyBaseUtilsDate.checkBetween(toCheck, startDate,endDate)

    Log.d(TAG, "onCreate: "+isInRange);
} catch (e : ParseException) {
    
}
```

---

```
Copyright 2020 M. Fadli Zein
```
