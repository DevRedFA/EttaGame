package gameLogic;


import gui.AddPlayer;
import gui.GameMenu;
import gui.MainMenu;
import gui.ShowWinner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author SedykhIvan
 */
public class Game {
    private static final Logger logger = LoggerFactory.getLogger(Game.class);
    private TreeSet<String> namesInGame = new TreeSet<>();
    private MainMenu mainMenu1 = new MainMenu(this);
    private AddPlayer addPlayer = new AddPlayer(this);
    private GameMenu gameMenu1;
    private ShowWinner showWinner1;
    private HashMap<String, Player> players_base = new HashMap<>();
    private String[] namesArray;
    private int current_player_N = 0;
    private String winner = "";

    @SuppressWarnings("unchecked")
    private void openBase() {
        try {
            logger.info("Reading players base");
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dataBaseSerialize.dat"));
            players_base = (HashMap<String, Player>) oin.readObject();
        } catch (Exception e) {
            logger.error("Error while reading file dataBaseSerialize.dat",e);
        }
    }


//    Add in future button to GUI
    private void saveBaseToTxt() {
        try {
            BufferedWriter Buffer = new BufferedWriter(new FileWriter("PlayerBase.txt"));
            Buffer.write(String.valueOf(players_base.size()));
            Buffer.newLine();
            for (String s : players_base.keySet()) {
                Buffer.write(players_base.get(s).toBase());
                Buffer.newLine();
            }
            Buffer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void closeBase() {
        try {
            logger.info("Writing players base");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dataBaseSerialize.dat"));
            oos.writeObject(players_base);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            logger.error("Error while writing file dataBaseSerialize.dat",e);
        }
    }

    Game() {
        logger.info("Creating Main");
        mainMenu1.setLableMessage("    ");
        this.openBase();
        mainMenu1.updateBaseList(players_base.keySet().toArray(new String[players_base.size()]));
        mainMenu1.setVisible(true);
    }

    private String[] sortByAge(TreeSet<String> namesInGame) {
        TreeSet<Player> set = new TreeSet<>(Comparator.comparingInt(Player::getAge));
        for (String name : namesInGame) {
            set.add(players_base.get(name));
        }
        String[] names = new String[set.size()];
        int size = set.size();
        for (int i = 0; i < size; i++) {
            names[i] = set.pollFirst().getName();
        }
        return names;
    }

    public class AddPlayerActivity implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            mainMenu1.setLableMessage("    ");
            try {
                if (!namesInGame.add(mainMenu1.getBaseSelectedName())) {
                    mainMenu1.setLableMessage("Игрок уже добавлен");
                }
                mainMenu1.updateGameList(namesInGame);
            } catch (NullPointerException aq) {
                mainMenu1.setLableMessage("Выберете игрока");
            }
        }
    }

    public class DelPlayerActivity implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                namesInGame.remove(mainMenu1.getGameSelectedName());
                mainMenu1.updateGameList(namesInGame);
            } catch (NullPointerException aq) {
                mainMenu1.setLableMessage("Выберете игрока");
            }
        }
    }

    public class StartCreatingPlayerActivity implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            addPlayer.setVisible(true);
            addPlayer.clear();
        }
    }

    public class CreatePlayerActivity implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                players_base.put(addPlayer.getNewName(), new Player(addPlayer.getNewName(), addPlayer.getAge(), 0, 0, 0, 0));
                addPlayer.setVisible(false);
                addPlayer.clear();
                mainMenu1.updateBaseList(players_base.keySet().toArray(new String[players_base.size()]));
            } catch (Exception er) {
                addPlayer.error();
            }
        }
    }

    public class DelBasePlayerActivity implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            players_base.remove(mainMenu1.getBaseSelectedName());
            mainMenu1.updateBaseList(players_base.keySet().toArray(new String[players_base.size()]));
        }
    }

    public class StartGameActivity implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            namesArray = sortByAge(namesInGame);
            if (namesArray.length < 2) {
                mainMenu1.setLableMessage("Выберете хотя бы двух игроков");
            } else {
                gameMenu1 = new GameMenu(Game.this);

                for (int i = 0; i < namesArray.length; i++) {
                    gameMenu1.setTableValueAt(namesArray[i], 0, i);
                    gameMenu1.setTableValueAt(0, 1, i);
                    gameMenu1.setTableValueAt(0, 2, i);
                }
                gameMenu1.setCurrentPlayer(namesArray[0]);
                mainMenu1.setVisible(false);
                gameMenu1.setVisible(true);
                current_player_N = 0;
            }
        }
    }

    public class EndTurnActivity implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            players_base.get(namesArray[current_player_N]).setRoundPoints(gameMenu1.getPlayerPoins());
            gameMenu1.setTableValueAt(players_base.get(namesArray[current_player_N]).getGamePoints(), 1, current_player_N);


            int max = 0;
            if (players_base.get(namesArray[current_player_N]).getGamePoints() > max) {
                winner = namesArray[current_player_N];


            }
            gameMenu1.setTableValueAt(players_base.get(namesArray[current_player_N]).getRoundMaxPoints(), 2, current_player_N++);
            gameMenu1.setLeader(winner);


            if (current_player_N == namesArray.length) {
                current_player_N = 0;


            }
            gameMenu1.setCurrentPlayer((namesArray[current_player_N]));


        }
    }

    public class EndGameActivity implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            for (String aNamesArray : namesArray) {
                if (aNamesArray.equals(winner)) {
                    players_base.get(aNamesArray).endGame(true);
                } else {
                    players_base.get(aNamesArray).endGame(false);
                }
            }
            gameMenu1.setVisible(false);
            showWinner1 = new ShowWinner(Game.this);
            showWinner1.setWinnerName(winner);
            Game.this.closeBase();
            showWinner1.setVisible(true);

        }
    }

    public class CreateNewGameActivity implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            showWinner1.setVisible(false);
            Game.this.openBase();
            players_base.keySet();
            mainMenu1.updateBaseList(players_base.keySet().toArray(new String[players_base.size()]));
            mainMenu1.setVisible(true);

        }
    }
}
