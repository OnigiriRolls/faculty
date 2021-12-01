import java.util.ArrayList;

public abstract class Echipa {
    private Membru lider;
    private ArrayList<Membru> membri = new ArrayList<Membru>();
    private String nume;
    private int MAX;
    private int nr;

    public Echipa(String n, int m){
        nume = n;
        MAX = m;
    }

    public boolean addMember(Membru member){
        if(nr >= MAX)
            return false;

        membri.add(member);
        return true;
    }

    public boolean setLeader(Membru liderNou){
        if(liderNou.getExp() < 5)
            return false;

        lider = liderNou;
        return true;
    }

    public Membru removeMember(Membru member){
        if(membri.remove(member))
            return member;
        return null;
    }

    public String toString(){
        String aux = "";

        for (Membru m: membri) {
            aux = aux + m.toString();
        }
        return "Lider echipa: " + lider.toString() + ", Membri: " + aux;
    }

    public void setMax(int m){
        if(this.equals(lider)){
            MAX = m;
        }
        else {
            System.out.println("Doar liderul are voie sa schimbe nr max de membri!");
        }
    }

    public void setName(String n){
        if(this.equals(lider)){
            nume = n;
        }
        else {
            System.out.println("Doar liderul are voie sa schimbe numele echipei!");
        }
    }

    public abstract double getCost();
}

class DevTeam extends Echipa{
    public double getCost() {

    }
}

class HR extends Echipa{
    public double getCost() {
        return 0;
    }
}
