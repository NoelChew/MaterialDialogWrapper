# MaterialDialogWrapper
[![Release](https://jitpack.io/v/noelchew/MaterialDialogWrapper.svg)](https://jitpack.io/#noelchew/MaterialDialogWrapper)

Wrapper around [material-dialogs](https://github.com/afollestad/material-dialogs) [(core:0.9.0.0)](https://github.com/afollestad/material-dialogs/releases/tag/0.9.0.0)

## Some of the Predefined Methods
- showAlertDialogWithOK(Context context, int title, int message)
- showAlertDialog(Context context, int title, int message)
- showAlertDialogWithSelections(Context context, int title, ArrayList<String> selectionArrayList, MaterialDialog.ListCallback listCallback)
- showAlertDialogWithSelections(Context context, int title, MaterialDialog.ListCallback listCallback, String... selections)

## Integration
This library is hosted by jitpack.io.

Root level gradle:
```
allprojects {
 repositories {
    jcenter()
    maven { url "https://jitpack.io" }
 }
}
```

Application level gradle:
```
dependencies {
    compile 'com.github.noelchew:MaterialDialogWrapper:0.1.6'
}
```
Note: do not add the jitpack.io repository under buildscript
