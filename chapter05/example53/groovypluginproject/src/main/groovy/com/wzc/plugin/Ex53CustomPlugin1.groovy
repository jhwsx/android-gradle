package com.wzc.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

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