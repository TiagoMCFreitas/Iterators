package com.iterator.models;

public class Motorista {
    private int id;
    private String name;
    private String country;
    private String teamNumber;
    private String firstTeam;
    private String currentTeam;

    public Motorista(int id, String name, String country, String teamNumber, String firstTeam, String currentTeam) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.teamNumber = teamNumber;
        this.firstTeam = firstTeam;
        this.currentTeam = currentTeam;
    }

    public Motorista(String linha){
        String[] vet = linha.split(";");
        this.id = Integer.parseInt(vet[0]);
        this.name = vet[1];
        this.country = vet[2];
        this.teamNumber = vet[3];
        this.firstTeam = vet[4];
        this.currentTeam = vet[5];
        
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return String return the teamNumber
     */
    public String getTeamNumber() {
        return teamNumber;
    }

    /**
     * @param teamNumber the teamNumber to set
     */
    public void setTeamNumber(String teamNumber) {
        this.teamNumber = teamNumber;
    }

    /**
     * @return String return the firstTeam
     */
    public String getFirstTeam() {
        return firstTeam;
    }

    /**
     * @param firstTeam the firstTeam to set
     */
    public void setFirstTeam(String firstTeam) {
        this.firstTeam = firstTeam;
    }

    /**
     * @return String return the currentTeam
     */
    public String getCurrentTeam() {
        return currentTeam;
    }

    /**
     * @param currentTeam the currentTeam to set
     */
    public void setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;
    }

}
