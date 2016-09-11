package proyecto_grafos_conjuntos_listas;
public class Member {
    private String name, coupleName;
    int breakForLeader;

    public Member(String name) {
        this.name = name;
    }

    public Member(String name, String coupleName) {
        this.name = name;
        this.coupleName = coupleName;
    }

    public Member(String name, String coupleName, int breakForLeader) {
        this.name = name;
        this.coupleName = coupleName;
        this.breakForLeader = breakForLeader;
    }

    public Member(String name, int breakForLeader) {
        this.name = name;
        this.breakForLeader = breakForLeader;
    }
    public String getCouple() {
        return coupleName;
    }
    public boolean hasCouple() {
        return !coupleName.equals("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoupleName() {
        return coupleName;
    }

    public void setCoupleName(String coupleName) {
        this.coupleName = coupleName;
    }

    public int getBreakForLeader() {
        return breakForLeader;
    }

    public void setBreakForLeader(int breakForLeader) {
        this.breakForLeader = breakForLeader;
    }
    
}
