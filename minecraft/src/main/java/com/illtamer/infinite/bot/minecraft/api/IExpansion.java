package com.illtamer.infinite.bot.minecraft.api;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import java.io.File;
import java.io.InputStream;

/**
 * Infinite Bot 附属接口
 * */
public interface IExpansion {

    /**
     * 附属启用时调用
     * */
    void onEnable();

    /**
     * 附属卸载时调用
     * */
    void onDisable();

    /**
     * 附属是否被加载
     * */
    boolean isEnabled();

    /**
     * 获取附属名称
     * @apiNote 名称为任意不包含 '-' 的一串字符
     * */
    String getExpansionName();

    /**
     * 获取附属版本
     * @apiNote 语义化版本
     * */
    String getVersion();

    /**
     * 获取附属作者
     * @apiNote 任意字符
     * */
    String getAuthor();

    /**
     * 获取当前附属logger
     * */
    Logger getLogger();

    /**
     * 获取当前附属配置文件夹
     * */
    File getDataFolder();

    /**
     * 获取附属资源文件
     * */
    InputStream getResource(String name);

    /**
     * 储存附属jar中的资源文件到附属文件夹
     * */
    void saveResource(String path, boolean replace);

    @Override
    @NotNull
    String toString();

}
