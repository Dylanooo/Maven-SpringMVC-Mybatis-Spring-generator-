package com.dylan.lee.controller;

import com.dylan.lee.pojo.Music;
import com.dylan.lee.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by lihaiyang on 16/1/26.
 */
@Controller
public class MusicController {
    @Autowired
    private MusicService musicService;
    @RequestMapping("/findMusic")
    public ModelAndView findMusic()throws Exception {
        List<Music> musics = musicService.findMusic();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("musics",musics);
        modelAndView.setViewName("myMusic");
        return modelAndView;
    }
}
