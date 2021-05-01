package com.company.ConsoleUI;

import com.company.Business.CoachManager;
import com.company.Business.PersonManager;
import com.company.Business.PlayerManager;
import com.company.Entities.Coach;
import com.company.Entities.Person;
import com.company.Entities.Player;
import com.company.Entities.Team;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(
                1,
                "Yusuf",
                "Özel",
                23,
                "Turkish",
                100000,
                new Team("Fenerbahçe"),
                "Right",
                10000,
                10,
                65,
                175,
                "CB"


        );
        Coach coach1 = new Coach(
                1,
                "Kaan",
                "Yılmaz",
                23,
                "Turkish",
                new Team("Galatasaray"),
                100000,
                "4-1-4-1",
                5,
                15000
        );

        Person[] persons = {player1,coach1};

        PersonManager personManager = new PersonManager();

        personManager.addMultiple(persons);

        personManager.increaseSalary(player1,10);

        PlayerManager playerManager = new PlayerManager();
        playerManager.transfer(player1,new Team("Real Madrid"));

        CoachManager coachManager = new CoachManager();
        coachManager.transfer(coach1,new Team("Bayern Münih"));

    }
}
