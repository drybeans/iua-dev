```
ndk {
                moduleName "MyModuleName"
                ldLibs "log"
                cFlags "-std=c++11 -fexceptions"
                stl "gnustl_static"
                toolchain "clang"
                toolchainVersion = "3.6" 
}
```

###Android Studio: v2.1.2
####add javah command to AS->Tools->External Tools:
- File->Settings->External Tools
- 点击“添加”按钮
- Name：javah，Group：External Tools，Description：generate jni header file
- Options全选，Show in全选
- Tool settings
	- Program：C:\Program Files\Java\jdk1.8.0_91\bin\javah.exe
	- Parameters：-v -jni -d $ModuleFileDir$\src\main\jni $FileClass$
	- Working directory：$SourcepathEntry$

####add ndk-build command to AS->Tools->External Tools:
- File->Settings->External Tools
- 点击“添加”按钮
- Name：ndk-build，Group：External Tools，Description：ndk build
- Options全选，Show in全选
- Tool settings
	- Program：C:\Android\android-ndk-r11c\ndk-build.cmd
	- Parameters：NDK_PROJECT_PATH=$ModuleFileDir$/build/intermediates/ndk NDK_LIBS_OUT=$ModuleFileDir$/src/main/libs NDK_APPLICATION_MK=$ModuleFileDir$/src/main/jni/Application.mk APP_BUILD_SCRIPT=$ModuleFileDir$/src/main/jni/Android.mk V=1
	- Working directory：$SourcepathEntry$
