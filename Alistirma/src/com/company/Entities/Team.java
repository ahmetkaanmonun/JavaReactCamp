package com.company.Entities;

public class Team {

    private int id;
    private String teamName;
    private int foundationYear;
    private String leagueName;
    private String city;
    private String clubColors;

    public Team(String teamName){
        this.teamName = teamName;

    }
    public Team(int id, String teamName, int foundationYear, String leagueName, String city, String clubColors) {
        this.id = id;
        this.teamName = teamName;
        this.foundationYear = foundationYear;
        this.leagueName = leagueName;
        this.city = city;
        this.clubColors = clubColors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getClubColors() {
        return clubColors;
    }

    public void setClubColors(String clubColors) {
        this.clubColors = clubColors;
    }
}
