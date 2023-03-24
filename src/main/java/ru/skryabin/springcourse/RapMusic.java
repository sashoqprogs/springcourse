package ru.skryabin.springcourse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "MoonWork";
    }
}
