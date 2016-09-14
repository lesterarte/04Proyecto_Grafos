
package proyecto_grafos_conjuntos_listas;


public class Group {

    private int cantCouples;
    private TDA_Set Member; 
    
    public Group(int cantCouples, TDA_Set Member) {
        this.cantCouples = cantCouples;
        this.Member = Member;
    }

    public Group() {
    }

    public int getCantCouples() {
        return cantCouples;
    }

    public void setCantCouples(int cantCouples) {
        this.cantCouples = cantCouples;
    }

    public TDA_Set getMember() {
        return Member;
    }

    public void setMember(TDA_Set Member) {
        this.Member = Member;
    }
    
    public boolean hasCouple(){
        
        return true;    
    }  
    
    public int cantidadMiembros(){
        return 0;
    }
    
    public void addMember(Member newMember){
        
    }  
    
}
