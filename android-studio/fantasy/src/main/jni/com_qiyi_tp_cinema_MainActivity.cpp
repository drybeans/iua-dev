//
// Created by chenjiansheng on 2016/6/28.
//
#include "com_qiyi_tp_cinema_MainActivity.h"

JNIEXPORT jstring JNICALL Java_com_qiyi_tp_cinema_MainActivity_hellofantasy
  (JNIEnv *env, jobject obj)
{
    return env->NewStringUTF("Hello from JNI! Compiled with ABI.");
}