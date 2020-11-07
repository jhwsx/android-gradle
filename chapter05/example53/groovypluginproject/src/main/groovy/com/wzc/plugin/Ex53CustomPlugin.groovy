package com.wzc.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class Ex53CustomPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        target.task('ex53CustomTask1') {
            doLast {
                println "这是一个通过自定义插件方式创建的任务..."
            }
        }
    }
}