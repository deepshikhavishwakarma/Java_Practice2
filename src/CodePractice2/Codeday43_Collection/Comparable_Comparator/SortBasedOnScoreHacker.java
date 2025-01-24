package CodePractice2.Codeday43_Collection.Comparable_Comparator;

import java.util.*;

// Write your Checker class here

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
class Checker implements Comparator<Player>{
    @Override
    public int compare(Player o1, Player o2) {
        if(o1.equals(o2)){

        }
        return o2.getScore()- o1.getScore();
    }
}

class SortBasedOnScoreHacker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
//amy 100
//david 100
//heraldo 50
//aakansha 75
//aleksa 150