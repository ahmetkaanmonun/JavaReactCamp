package com.company.Business;

import com.company.Business.PersonManager;
import com.company.Entities.Player;
import com.company.Entities.Team;

public class PlayerManager extends PersonManager {


    public void transfer(Player player, Team team) {


        System.out.println(player.getFirstName() + " transferred to :" + team.getTeamName());
        System.out.println("Transfer Fee :" + player.getTransferFee());
    }


}
