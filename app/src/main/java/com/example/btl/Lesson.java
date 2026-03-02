package com.example.btl;

public class Lesson {
    public String title;
    public String desc;
    public String xpText;
    public int progress; // 0..100

    public Lesson(String title, String desc, String xpText, int progress) {
        this.title = title;
        this.desc = desc;
        this.xpText = xpText;
        this.progress = progress;
    }
}
