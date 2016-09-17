package proyecto_grafos_conjuntos_listas;

import java.io.Serializable;
import java.util.ArrayList;

public class Member  implements Serializable {
    private TDA_Set visitedHouses;
    private String name;
    private boolean couple = false;
    private int breakForLeader = 0;

    public Member(String name) {
        this.name = name;
    }
    public Member(String name, boolean isCouple) {
        this.name = name;
        this.couple = isCouple;
    }

    public Member(String name, int breakForLeader) {
        this.name = name;
        this.breakForLeader = breakForLeader;
    }
    public boolean isCouple() {
        return this.couple;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBreakForLeader() {
        return breakForLeader;
    }

    public void setBreakForLeader(int breakForLeader) {
        this.breakForLeader = breakForLeader;
    }

    public void setVisitedHouses(String noVisitedHouse){
        this.visitedHouses.put(noVisitedHouse, noVisitedHouse);
    }
    
    

    @Override
    public String toString() {
        return name + "(" + breakForLeader + ')';
    }
    
    
}
