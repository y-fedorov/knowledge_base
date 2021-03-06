package ru.akhitev.kb.spring.life_cycle.post_construct.group;

import ru.akhitev.kb.spring.life_cycle.post_construct.players.Player;

import javax.annotation.PostConstruct;
import java.util.List;

public class Group {
    List<Player> players;

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("-------\nReady Check:\n------");
        players.forEach(System.out::println);
    }
}
