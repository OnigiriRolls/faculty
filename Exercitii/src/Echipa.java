import java.util.ArrayList;

public abstract class Echipa {
    protected Membru lider;
    protected ArrayList<Membru> membri = new ArrayList<Membru>();
    private String nume;
    private int MAX;
    private int nr;

    public Echipa(String n, int m) {
        nume = n;
        MAX = m;
    }

    public boolean addMember(Membru member) {
        if (nr >= MAX)
            return false;

        membri.add(member);
        return true;
    }

    public boolean setLeader(Membru liderNou) {
        if (liderNou.getExp() < 5)
            return false;

        lider = liderNou;
        return true;
    }

    public Membru removeMember(Membru member) {
        if (membri.remove(member))
            return member;
        return null;
    }

    public String toString() {
        String aux = "";

        for (Membru m : membri) {
            aux = aux + " " + m.toString();
        }
        return "Lider echipa: " + lider.toString() + ", Membri: " + aux;
    }

    public void setMax(int m) {
        if (this.equals(lider)) {
            MAX = m;
        } else {
            System.out.println("Doar liderul are voie sa schimbe nr max de membri!");
        }
    }

    public void setName(String n) {
        if (this.equals(lider)) {
            nume = n;
        } else {
            System.out.println("Doar liderul are voie sa schimbe numele echipei!");
        }
    }

    public abstract double getCost();
}

class DevTeam extends Echipa {
    public DevTeam(String n, int m) {
        super(n, m);
    }

    private double getCostM(Membru m){
        int exp = m.getExp();
        if(m.equals(lider))
            return (double) 250 * (2500 + exp * 250);
        if (exp >= 2 && exp <= 5)
            return (double) 1500 + (double) 25 / 100 * 1500;
        else if (exp > 5)
            return (double) 1500 + (double) 50 / 100 * 1500;
        return 1500.0;
    }

    public double getCost() {
        double s = 0.0;
        for (Membru m : membri) {
            s = s + getCostM(m);
        }
        return s;
    }
}

class HR extends Echipa {
    public HR(String n, int m) {
        super(n, m);
    }

    private double getCostM(Membru m) {
        int exp = m.getExp();

        if(m.equals(lider))
            return (double) 1350 + exp * 300;
        if (exp >= 2 && exp <= 5)
            return (double) 1000 + (double) 25 / 100 * 1000;
        else if (exp > 5)
            return (double) 1000 + (double) 50 / 100 * 1000;
        return 1000.0;
    }

    public double getCost() {
        double s = 0.0;
        for (Membru m : membri) {
            s = s + getCostM(m);
        }
        return s;
    }
}
