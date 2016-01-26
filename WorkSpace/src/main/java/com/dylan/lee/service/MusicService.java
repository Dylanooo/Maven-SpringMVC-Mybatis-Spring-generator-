package com.dylan.lee.service;

import com.dylan.lee.pojo.Music;

import java.util.List;

/**
 * Created by lihaiyang on 16/1/26.
 */
public interface MusicService {
    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<Music> findMusic()throws  Exception;
}
