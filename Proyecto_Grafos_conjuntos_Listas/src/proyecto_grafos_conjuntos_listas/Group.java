
package proyecto_grafos_conjuntos_listas;

import java.io.Serializable;


public class Group implements Serializable{

    private int cantCouples = 0;
    private TDA_Set Members;
    private String Leader;
    
    public Group(int cantCouples, TDA_Set Members) {
        this.cantCouples = cantCouples;
        this.Members = Members;
    }

    public Group() {
        Members = new TDA_Set();
    }

    public Member getLeader() {
        return (Member)Members.get(Leader);
    }

    public void setLeader(String Leader) {
        this.Leader = Leader;
    }
    
    public int getCantCouples() {
        return cantCouples;
    }

    public void setCantCouples(int cantCouples) {
        this.cantCouples = cantCouples;
    }

    public TDA_Set getMembers() {
        return Members;
    }

    public void setMembers(TDA_Set Members) {
        this.Members = Members;
    }
    
    public boolean hasCouple(){
        return cantCouples > 0;    
    }  
    
    public int getCantMembers(){
        return this.Members.getCountKies() + this.cantCouples;
    }
    
    public void addMember(Member newMember, Grafo friendlyGraph, int breakXLeader){
        if (Leader == null && newMember.getBreakForLeader() == 0) {
            newMember.setBreakForLeader(breakXLeader);
            Leader = newMember.getName();
        } else {
            if (Leader != null && newMember.getName() != null) {
                System.out.println(friendlyGraph.getEdge(newMember.getName() + "->" + Leader) + "EDGE");
                try {
                    if (friendlyGraph.getEdge(newMember.getName() + "->" + Leader) == null) {
                        friendlyGraph.addEdge(newMember.getName() + "->" + Leader, newMember.getName(), Leader);
                    }
                } catch (Exception e) {
                }
            }
            newMember.setVisitedHouses(Leader);
        }
        this.Members.put(newMember.getName(), newMember);
        if (newMember.isCouple()) {
            this.cantCouples++;
        }
        if (newMember.getBreakForLeader() > 0) {
            newMember.setBreakForLeader(newMember.getBreakForLeader() - 1);
        }
    }
    

    @Override
    public String toString() {
        return "Group{" + "cantCouples=" + cantCouples + ", Members=" + Members.toString() + ", Leader=" + Leader + '}';
    }
}
