<h1 align="center">
    MyLibUtils
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-0.2.0-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/Koltin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <p>Simple function for <b>Date</b> and <b>String</b>.</p>
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
- [x] **Convert Time Format**. example from `2020-10-14` to `14-10-2020`. ([DOCS](https://github.com/gzeinnumer/MyLibUtils#convert-time-format))
- [x] **Current Time** with custom format. example `2020-10-14 16:50`.([DOCS](https://github.com/gzeinnumer/MyLibUtils#current-time-with-custom-format))
- [x] **Is Date In Range?**.([DOCS](https://github.com/gzeinnumer/MyLibUtils#is-date-in-range))
- [x] **Calculate Date**.([DOCS](https://github.com/gzeinnumer/MyLibUtils#calculate-date))
- [x] **Manipulation String**.([DOCS](https://github.com/gzeinnumer/MyLibUtils#manipulation-string))

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
```java
//please make sure your date format are the same.

//with String
String toCheck = "07/10/2020";
String startDate ="04/10/2020";
String endDate = "08/10/2020";

boolean isInRange = MyBaseUtilsDate.checkBetween(toCheck, startDate,endDate);

Log.d(TAG, "onCreate: "+isInRange);

//or `Date()`
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
    val formatDate = "dd/MM/yyyy"
    val df = SimpleDateFormat(formatDate)
    val toCheck  = df.parse("07/10/2020")
    val startDate= df.parse("04/10/2020")
    val endDate  = df.parse("08/10/2020")

    val isInRange = MyBaseUtilsDate.checkBetween(toCheck, startDate,endDate)

    Log.d(TAG, "onCreate: "+isInRange);
} catch (e : ParseException) {
    
}
```

### **Calculate Date**
Add date with simple way.
> **Java**
```java
//please make sure time and pattern has same format
String time = "2014-01-11 10:10";
String pattern = "yyyy-MM-dd HH:mm";

CalculateDate calculateDate = new CalculateDate(time, pattern).addYear(2).addMonth(2).addDay(2);
calculateDate.addWeek(1);
calculateDate.addHour(2);
calculateDate.addMinutes(2);

String result = calculateDate.getResult();
Log.d(TAG, "onCreate: "+result);
```
> **Kotlin**
```kotlin
//please make sure time and pattern has same format
val time = "2014-01-11 10:10"
val pattern = "yyyy-MM-dd HH:mm"

val calculateDate = CalculateDate(time, pattern).addYear(2).addMonth(2).addDay(2)
calculateDate.addWeek(1)
calculateDate.addHour(2)
calculateDate.addMinutes(2)

val result = calculateDate.getResult()
Log.d(TAG, "onCreate: "+result);
```

### **Manipulation String**
Make some modification to your `String` value to get value that you need.
> **Java**
```java
String str = "!!??!@Hello Zein";

String result_1 = MyBaseUtilsString.removeLastChar(str);
Log.d(TAG, "onCreate_1: "+ result_1); //   !!??!@Hello Zei

String result_2 = MyBaseUtilsString.removeLastCharCustomLength(str,3);
Log.d(TAG, "onCreate_2: "+ result_2); //   !!??!@Hello Z

String result_3 = MyBaseUtilsString.removeAllSimbol(str,"");
Log.d(TAG, "onCreate_3: "+ result_3); //   HelloZein

String result_4 = MyBaseUtilsString.removeSpesificSimbol(str,"","!","?","@");
Log.d(TAG, "onCreate_4: "+ result_4); //   Hello Zein

String result_5 = MyBaseUtilsString.removeFirstChar(str);
Log.d(TAG, "onCreate_5: "+ result_5); //   !??!@Hello Zein

String result_6 = MyBaseUtilsString.removeFirstCharCustomLength(str,3);
Log.d(TAG, "onCreate_6: "+ result_6); //   ?!@Hello Zein

String url = "https://asset-a.grid.id/crop/0x0:0x0/360x240/photo/2020/04/09/663219154.png";
String result_7 = MyBaseUtilsString.getNameFromUrl(url);
Log.d(TAG, "onCreate_7: "+ result_7); //   663219154.png

String result_8 = MyBaseUtilsString.removeExtension(result_7);
Log.d(TAG, "onCreate_8: "+ result_8); //   663219154
```
> **Kotlin**
```kotlin
val str = "!!??!@Hello Zein";

val result_1 = MyBaseUtilsString.removeLastChar(str);
Log.d(TAG, "onCreate_1: "+ result_1); //   !!??!@Hello Zei

val result_2 = MyBaseUtilsString.removeLastCharCustomLength(str,3);
Log.d(TAG, "onCreate_2: "+ result_2); //   !!??!@Hello Z

val result_3 = MyBaseUtilsString.removeAllSimbol(str,"");
Log.d(TAG, "onCreate_3: "+ result_3); //   HelloZein

val result_4 = MyBaseUtilsString.removeSpesificSimbol(str,"","!","?","@");
Log.d(TAG, "onCreate_4: "+ result_4); //   Hello Zein

val result_5 = MyBaseUtilsString.removeFirstChar(str);
Log.d(TAG, "onCreate_5: "+ result_5); //   !??!@Hello Zein

val result_6 = MyBaseUtilsString.removeFirstCharCustomLength(str,3);
Log.d(TAG, "onCreate_6: "+ result_6); //   @Hello Zein

val url = "https://asset-a.grid.id/crop/0x0:0x0/360x240/photo/2020/04/09/663219154.png";
val result_7 = MyBaseUtilsString.getNameFromUrl(url);
Log.d(TAG, "onCreate_7: "+ result_7); //   663219154.png

val result_8 = MyBaseUtilsString.removeExtension(result_7);
Log.d(TAG, "onCreate_8: "+ result_8); //   663219154
```

---

```
Copyright 2020 M. Fadli Zein
```