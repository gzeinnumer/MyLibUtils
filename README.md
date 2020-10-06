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
- [x] Convert **Time Format**. example from `yyyy-MM-dd` to `dd-MM-yyyy`.
- [x] **Current Time** with custom format. example `yyyy-MM-dd hh:mm`.
- [x] **Is Date In Range?**.
- [x] **Calculate Date**.

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
* Date with `String`
```kotlin
//please make sure your date format are the same.
//with String
val toCheck = "07/10/2020"
val startDate ="04/10/2020"
val endDate = "08/10/2020"

val isInRange = MyBaseUtilsDate.checkBetween(toCheck, startDate,endDate)

Log.d(TAG, "onCreate: "+isInRange)
```
* Date with `Date()`
```kotlin
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

---

```
Copyright 2020 M. Fadli Zein
```

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial;}

/* Style the tab */
.tab {
  overflow: hidden;
  border: 1px solid #ccc;
  background-color: #f1f1f1;
}

/* Style the buttons inside the tab */
.tab button {
  background-color: inherit;
  float: left;
  border: none;
  outline: none;
  cursor: pointer;
  padding: 14px 16px;
  transition: 0.3s;
  font-size: 17px;
}

/* Change background color of buttons on hover */
.tab button:hover {
  background-color: #ddd;
}

/* Create an active/current tablink class */
.tab button.active {
  background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
  display: none;
  padding: 6px 12px;
  border: 1px solid #ccc;
  border-top: none;
}
</style>
</head>
<body>

<h2>Tabs</h2>
<p>Click on the buttons inside the tabbed menu:</p>

<div class="tab">
  <button class="tablinks" onclick="openCity(event, 'London')">London</button>
  <button class="tablinks" onclick="openCity(event, 'Paris')">Paris</button>
  <button class="tablinks" onclick="openCity(event, 'Tokyo')">Tokyo</button>
</div>

<div id="London" class="tabcontent">
  <h3>London</h3>
  <p>London is the capital city of England.</p>
</div>

<div id="Paris" class="tabcontent">
  <h3>Paris</h3>
  <p>Paris is the capital of France.</p>
</div>

<div id="Tokyo" class="tabcontent">
  <h3>Tokyo</h3>
  <p>Tokyo is the capital of Japan.</p>
</div>

<script>
function openCity(evt, cityName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
}
</script>

</body>
</html>