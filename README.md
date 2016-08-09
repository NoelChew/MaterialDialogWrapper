# MaterialDialogWrapper
Wrapper around [material-dialogs](https://github.com/afollestad/material-dialogs)

[com.afollestad.material-dialogs:core:0.8.5.9](https://github.com/afollestad/material-dialogs/releases/tag/0.8.5.9)

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
    compile 'com.github.noelchew:MaterialDialogWrapper:0.1.0'
}
```
Note: do not add the jitpack.io repository under buildscript
