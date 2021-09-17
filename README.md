# SplashScreen
Splash screen demo made in right way(for Android)

# ScreenShots

![ScreenShot1](screenshots/splash_screen1.jpg) ![ScreenShot1](screenshots/splash_screen2.jpg)

# Usual mistake
Most of the answers for SplashScreen are by using Timer to delay!
But it isn't a good way to show SplashScreen! We should not make the users to wait for loading nothing. As app loads with white or black screen and the users wait until the timer finishes.
So I made this demo on how to show real SplashScreen on Android.

# Note
If you are using Vector Drawables then place those drawables in mipmap folder (Works only in api 21 and up).

# For Androidx (theme)
<resources
    xmlns:tools="http://schemas.android.com/tools">

    <!--Common App theme-->
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
        <item name="colorControlNormal">@color/colorControlNormal</item>
        <item name="colorControlHighlight">@color/colorControlHighlight</item>
	</style>

    <!--Splash Theme-->
    <style name="SplashTheme" parent="Theme.AppCompat.Light.NoActionBar">
        <item name="colorPrimaryDark">@color/colorSplashBackground</item>
        <item name="android:windowBackground">@drawable/splash_background</item>
        <item name="android:navigationBarColor">@color/colorSplashBackground</item>
	</style>

</resources>

# Icons
Launcher Icon from [Flaticon](https://flaticon.com) - Freepik
