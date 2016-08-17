# MaterialDialogWrapper
[![Release](https://jitpack.io/v/noelchew/MaterialDialogWrapper.svg)](https://jitpack.io/#noelchew/MaterialDialogWrapper)

Wrapper around [material-dialogs](https://github.com/afollestad/material-dialogs)

[com.afollestad.material-dialogs:core:0.9.0.0](https://github.com/afollestad/material-dialogs/releases/tag/0.9.0.0)

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
