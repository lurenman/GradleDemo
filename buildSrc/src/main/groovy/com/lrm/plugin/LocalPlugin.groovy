package com.lrm.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 本项目插件
 * 参考https://blog.csdn.net/u014040795/article/details/81079919
 * 对于moudle 包名buildSrc或BuildSrc都行，但是我这边还是指定了properties
 * 因为只有这样我才能引用到插件
 */
public class LocalPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println("----hello LocalPlugin-----")
    }
}