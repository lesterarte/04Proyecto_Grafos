
package proyecto_grafos_conjuntos_listas;


public class Group {

    private int cantCouples = 0;
    private TDA_Set Members;
    private Member Leader;
    
    public Group(int cantCouples, TDA_Set Members) {
        this.cantCouples = cantCouples;
        this.Members = Members;
    }

    public Group() {
        Members = new TDA_Set();
    }

    public Member getLeader() {
        return Leader;
    }

    public void setLeader(Member Leader) {
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
    
    public void addMember(Member newMember){
        this.Members.put(newMember.getName(), newMember);
        if (newMember.isCouple()) {
            this.cantCouples++;
        }
    } 

    @Override
    public String toString() {
        return "Group{" + "cantCouples=" + cantCouples + ", Members=" + Members.toString() + ", Leader=" + Leader + '}';
    }
    
    
}
