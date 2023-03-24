package ru.skryabin.springcourse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("rapMusic")
    private List<Music>musicList = new ArrayList<>();
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(){}


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    public String playMusicList(){
        for(Music music:musicList){
            return "Playing "+ music.getSong();
        }
        return null;
    }
}
