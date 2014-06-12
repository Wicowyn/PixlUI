![Logo](https://raw.github.com/neopixl/PixlUI/master/Sample/res/drawable-xhdpi/small.png ) PixlUI
======

Provide few methods for visual elements.


CheckBox:
- Custom font
- Text All caps (works on all API version)

Button:
- Custom font
- Text All caps (works on all API version)

EditText:
- Custom font
- Copy/Cut/Paste (enable/disable) (works on all API version)
- Cancel clipboard content (works on all API version)
- Text All caps (works on all API version) - (in progress)
- Focus listener
- Batch listener (replace TextWatcher, wich that you can intercept DEL touch on all API)

AutoCompleteEditText:
- Custom font
- Copy/Cut/Paste (enable/disable) (works on all API version)
- Cancel clipboard content (works on all API version)
- Text All caps (works on all API version) - (in progress)
- Focus listener
- Batch listener (replace TextWatcher, wich that you can intercept DEL touch on all API)

Image View:
- Alpha  (works on all API version)

RelativeLayout:
- Alpha  (works on all API version)


TextView:
- Contains a fix to do proper ellipsizing
- Custom font
- Text All caps (works on all API version)

Screenshot
==========
![Screen1](https://raw.github.com/neopixl/PixlUI/master/screenshot.png )


How use it ?
==========

1 . Import project

2 . Add your custom fonts in /assets/fonts/

3 . Use it in XML:

```
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:pixlui="http://schemas.android.com/apk/com.neopixl.pixlui"
    xmlns:tools="http://schemas.android.com/tools" >

    <com.neopixl.pixlui.components.textview.TextView
        android:id="@+id/textView1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/hello_world"
        pixlui:copyandpaste="false"
        pixlui:clearclipboardcontent="true"
        pixlui:typeface="GearedSlab.ttf" />
</RelativeLayout>
```

Alternatively you can use typeface in styles as well like so

```
 <style name="CustomTextView">
   <item name="typeface">GearedSlab.ttf</item>
 </style>
```

Another feature is that all textviews can be made all caps 

![Logo](https://raw.github.com/neopixl/PixlUI/master/Sample/res/drawable-xhdpi/small.png ) ChangeLog
===

**1.0.5**

- Added custom RadioButton (*Custom font, Text all caps*)

**1.0.4**

- Added RelativeLayoutAnimator (*VISIBLE/GONE/INVISIBLE transition animation*)
- Added LinearLayoutAnimator (*VISIBLE/GONE/INVISIBLE transition animation*)
- Added custom AutoCompleteEditText
- Added custom AutoResizeTextView (**in progress**)

**1.0.3**

- Added custom CheckBox (*Custom font, Text all caps*)
 
**1.0.2**

- Added method in custom EditText (*Autofocus Listener, Hide/Show Keyboard*)
 
**1.0.1**

- Added method in custom TextView (*Text all caps*) - for old api version
- Added method in custom EditText (*Text all caps*) - for old api version
- Added method in custom Button (*Text all caps*) - for old api version
- Fix NPE in Batch Listener
- Added custom RelativeLayout (*Alpha*) - for old api version

**1.0.0**

- Added custom TextView (*Custom font*)
- Added custom EditText (*Custom font, Focus Listener, Batch Listener*)
- Added custom Button (*Custom font*)
- Fix many crash

![Logo](https://raw.github.com/neopixl/PixlUI/master/Sample/res/drawable-xhdpi/small.png ) Application using PixlUI
======

![W-Zup](https://lh5.ggpht.com/HIidBBI4pgoYWy4GxYd66AhcxHkdbFPBsJSKoSL5sk2kBoULUYFOTYdTCrcNxtfDWMg=w100 )      ![FLASHiZ](https://lh3.ggpht.com/KwnWyILbe4O2Ein2GoBnUjT0wfXHoZ4siTLkRCwNbAYZ-0X_5yPYTxAvCR79EvlXVQhE=w100)
![MeeTincS](https://lh5.ggpht.com/WQcf8Msp7dFfpyAQNvYV_WNaA9GdR9G7-gLRrFwMgPuDTwKaU72YdTMwXXSxNkdvjA=w100)
![Wort.lu](https://lh4.ggpht.com/8d3m3aWSKpP6bqZefw5oF256Sgk9X_vxxh4VQ9LXqgvCz6HuyOYsQu4VmAXuDF4deZQ=w100)

[W-Zup](https://play.google.com/store/apps/details?id=com.wzup.wzup)  	-       [FLASHiZ](https://play.google.com/store/apps/details?id=com.mobey.android)      -       [MeeTincS](https://play.google.com/store/apps/details?id=com.neopixl.apppixl.meetincs)      -       [Wort.lu](https://play.google.com/store/apps/details?id=lu.wort.main)



Copyright
==========


  	Copyright 2014 Neopixl - Olivier Demolliens

	Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
	
	file except in compliance with the License. You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software distributed under
	
	the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF 
	
	ANY KIND, either express or implied. See the License for the specific language governing
	
	permissions and limitations under the License.
