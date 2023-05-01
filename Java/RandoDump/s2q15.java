package pocket;

import java.util.*;

public class s2q15 {
    public static void main(String[] args) {

        ArrayList<FootballPlayer> FP = new ArrayList<FootballPlayer>();

        try (Scanner sc = new Scanner(System.in)) {

            while(true){

                System.out.println("1.Add Player\n2.Sorted numberOfGoals\n");
                int ch = sc.nextInt();
                
                switch(ch){
                    case 1:
                        String n = sc.next();
                        int g = sc.nextInt();
                        int m = sc.nextInt();
                        FootballPlayer a = new FootballPlayer(n,g,m);
                        FP.add(a);
                    break;

                    case 2:
                        Collections.sort(FP);
                        for(FootballPlayer f : FP)
                            System.out.println(f);
                    break;

                    case 3: System.exit(0);
                }
            }
        }

    }
}

class FootballPlayer implements Comparable<FootballPlayer>{
    String name;
    int numberOfGoals;
    int numberOfMatches;

    public FootballPlayer(String n,int ng,int nm){
        this.name = n;
        this.numberOfGoals = ng;
        this.numberOfMatches = nm;
    }

    public int compareTo(FootballPlayer f){
        if(numberOfGoals == f.numberOfGoals)
            return 0;
        else if(numberOfGoals > f.numberOfGoals)
            return 1;
        else 
            return -1;
    }

    public String toString(){
        return name + " " + numberOfGoals + " " + numberOfMatches + "\n";
    }
}