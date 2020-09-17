package com.example.bus.Contactbus;

public class Contactbus {
    private String pick;
    private String dest;
    private String date;
    private String time;
    private String type;
    public Contactbus(String pick, String dest, String date, String time,String type) {
        this.pick= pick;
        this.dest = dest;
        this.date= date;
        this.time = time;
        this.type= type;
    }

    public String getPick() {
        return pick;
    }

    public String getDest() {
        return dest;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    public void setPick(String pick) {
        this.pick = pick;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setType(String type) {
        this.type = type;
    }
}
