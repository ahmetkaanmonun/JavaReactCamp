package com.company.Business;

import com.company.Entities.Coach;
import com.company.Entities.Team;

public class CoachManager extends PersonManager {

    public void transfer(Coach coach, Team team) {

        System.out.println(coach.getFirstName() + " transferred to :" + team.getTeamName());
        System.out.println("Transfer Fee :" + coach.getTransferFee());
    }


}
