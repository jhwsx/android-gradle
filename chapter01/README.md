### Windows 下配置 GRADLE_HOME

配置环境变量

![](D:\Android\Workspace\android-gradle\chapter01\gradlehome.png)

在命令行窗口中，使用 `gradle -v` 命令查看

![](D:\Android\Workspace\android-gradle\chapter01\gradel_v.png)

### gradle wrapper 命令生成的目录结构说明

wrapper 是对 Gradle 的一层包装，便于在团队开发过程中统一 Gradle 构建的版本。这样大家可以使用统一的 Gradle 版本进行构建，避免因为 Gradle 版本不统一带来的不必要的问题。

![](D:\Android\Workspace\android-gradle\chapter01\gradle.png)

- gradlew 是 Linux 下的可执行脚本；

- gradlew.bat 是 Windows 下的可执行脚本；

- gradle-wrapper.jar 是具体业务逻辑实现的 jar 包，gradlew 最终还是使用 Java 执行这个 jar 包来执行相关的 Gradle 操作；

- gradle-wrapper.properties 是配置文件，用于配置使用哪个版本的 Gradle 等。

gradle wrapper --gradle-version 2.14.1 指定生成某个 Gradle 版本的 Wrapper；如果不指定版本，就生成当前版本的 Wrapper。

### Gradle 命令行
gradlew -? 查看帮助
gradlew -h 查看帮助
gradlew --help 查看帮助
gradlew tasks 查询所有可执行的任务
gradlew help --task tasks 显示 tasks 任务的帮助信息
gradlew help --task 任务名 显示某个任务的帮助信息
gradlew --refresh-dependencies assemble 强制刷新依赖
gradlew clean jar 先 clean 再打 jar
gradlew assembleDebug 可以协程 gradlew aD 通过任务名缩写执行

在 AndroidStudio 的 Terminal 里面使用 `gradlew xxx` 就可以；在 Windows 的命令行窗口里面要使用 `./gradlew xxx` 才可以。

### `gradle -v` 与 `gradlew -v` 的区别

`gradle -v` 获取的是在环境变量中配置的 gradle 的版本信息，可以在任何命令行窗口中使用：

```gradle
D:\Android\Workspace\ota\iov_ue>gradle -v

------------------------------------------------------------
Gradle 6.7.1
------------------------------------------------------------

Build time:   2020-11-16 17:09:24 UTC
Revision:     2972ff02f3210d2ceed2f1ea880f026acfbab5c0

Kotlin:       1.3.72
Groovy:       2.5.12
Ant:          Apache Ant(TM) version 1.10.8 compiled on May 10 2020
JVM:          1.8.0_271 (Oracle Corporation 25.271-b09)
OS:           Windows 10 10.0 amd64
```
`gradlew -v` 获取的是项目中配置的 gradle 的版本信息，只能直接包含有 `gradle wrapper` 命令生成的目录下打开的窗口中使用：

```gradle
D:\Android\Workspace\ota\iov_ue>gradlew -v

Welcome to Gradle 4.8.1!

Here are the highlights of this release:
 - Dependency locking
 - Maven Publish and Ivy Publish plugins improved and marked stable
 - Incremental annotation processing enhancements
 - APIs to configure tasks at creation time

For more details see https://docs.gradle.org/4.8.1/release-notes.html


------------------------------------------------------------
Gradle 4.8.1
------------------------------------------------------------

Build time:   2018-06-21 07:53:06 UTC
Revision:     0abdea078047b12df42e7750ccba34d69b516a22

Groovy:       2.4.12
Ant:          Apache Ant(TM) version 1.9.11 compiled on March 23 2018
JVM:          1.8.0_271 (Oracle Corporation 25.271-b09)
OS:           Windows 10 10.0 amd64

```

