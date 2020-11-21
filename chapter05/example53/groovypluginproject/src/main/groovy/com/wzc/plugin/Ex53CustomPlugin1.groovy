package com.wzc.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
// 生成 jar 的方法，点击右侧 Gradle 的 build -> jar 即可。
class Ex53CustomPlugin1 implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('ex53CustomTask1') {
            doLast {
                println "这是一个通过自定义插件方式创建的任务..."
            }
        }
    }
}