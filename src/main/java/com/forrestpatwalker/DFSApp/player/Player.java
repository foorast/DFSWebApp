package com.forrestpatwalker.DFSApp.player;

public class Player {
    private Long id;
    private String name;
    private String team;
    private String position;
    private Integer receivingYards;
    private Integer receivingTouchdowns;
    private Integer gamesPlayed;

    public Player() {
    }

    public Player(Long id, String name, String team, String position, Integer receivingYards, Integer receivingTouchdowns, Integer gamesPlayed) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.position = position;
        this.receivingYards = receivingYards;
        this.receivingTouchdowns = receivingTouchdowns;
        this.gamesPlayed = gamesPlayed;
    }

    public Player(String name, String team, String position, Integer receivingYards, Integer receivingTouchdowns, Integer gamesPlayed) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.receivingYards = receivingYards;
        this.receivingTouchdowns = receivingTouchdowns;
        this.gamesPlayed = gamesPlayed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getReceivingYards() {
        return receivingYards;
    }

    public void setReceivingYards(Integer receivingYards) {
        this.receivingYards = receivingYards;
    }

    public Integer getReceivingTouchdowns() {
        return receivingTouchdowns;
    }

    public void setReceivingTouchdowns(Integer receivingTouchdowns) {
        this.receivingTouchdowns = receivingTouchdowns;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }
}
