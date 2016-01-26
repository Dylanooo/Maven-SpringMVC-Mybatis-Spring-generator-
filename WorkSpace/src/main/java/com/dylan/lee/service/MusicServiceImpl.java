package com.dylan.lee.service;

import com.dylan.lee.mapper.MusicMapper;
import com.dylan.lee.pojo.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lihaiyang on 16/1/26.
 */
@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicMapper musicMapper;
    public List<Music> findMusic() throws Exception {
        List<Music> musics = musicMapper.selectByExample(null);
        return musics;
    }
}
