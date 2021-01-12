package com.forrestpatwalker.DFSApp.player;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    public List<Player> getPlayers(){
        return List.of(
                new Player(
                        1L,
                        "Cooper Kupp",
                        "Seattle Seahawks",
                        "WR",
                        1257,
                        12,
                        16
                )
        );
    }
}
