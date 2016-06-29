#!/bin/sh
export ProjectPath=$(cd "../$(dirname "$1")"; pwd)
export TargetClassName="com.qiyi.tp.cinema.MainActivity"

export SourceFile="${ProjectPath}/app/src/main/java"
export TargetPath="${ProjectPath}/fantasy/src/main/jni"

cd "${SourceFile}"
javah -d ${TargetPath} -classpath "${SourceFile}" "${TargetClassName}"
echo "generate header file to ${TargetPath}"