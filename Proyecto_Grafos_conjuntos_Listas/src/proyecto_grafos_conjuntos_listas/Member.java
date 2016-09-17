package proyecto_grafos_conjuntos_listas;

import java.io.Serializable;

public class Member  implements Serializable {
    private String name;
    boolean couple = false;
    int breakForLeader = 0;

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
    public String toString() {
        return "Name: " + this.name + " isCouple: " + this.couple;
    }
}
