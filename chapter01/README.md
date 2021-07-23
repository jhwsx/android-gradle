### Windows 下配置 GRADLE_HOME

配置环境变量

![](D:\Android\Workspace\android-gradle\chapter01\gradlehome.png)

在命令行窗口中，使用 `gradle -v` 命令查看

![](D:\Android\Workspace\android-gradle\chapter01\gradel_v.png)

### gradle wrapper 命令生成的目录结构说明

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
