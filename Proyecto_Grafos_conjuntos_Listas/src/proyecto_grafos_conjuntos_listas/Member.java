package proyecto_grafos_conjuntos_listas;
public class Member {
    private String name;
    boolean isCouple = false;
    int breakForLeader;

    public Member(String name) {
        this.name = name;
    }
    public Member(String name, boolean isCouple) {
        this.name = name;
        this.isCouple = isCouple;
    }

    public Member(String name, int breakForLeader) {
        this.name = name;
        this.breakForLeader = breakForLeader;
    }
    public boolean isCouple() {
        return this.isCouple;
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
    
}
