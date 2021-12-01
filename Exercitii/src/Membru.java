public abstract class Membru {
    private String nume;
    private int varsta;
    private int salariu;
    protected int xp;

    public int getExp() {
        return xp;
    }

    public boolean equals(Object obj){
        if(obj instanceof Membru)
            return (((Membru)obj).nume == nume);
        else return false;
    }

    public String toString(){
        return nume;
    }

    public abstract double getCost();
}

class Lider extends Membru{

    public double getCost() {
        return (double)250*(2500 + xp*250);
    }
}

class MSimplu extends Membru{

    public double getCost() {
        if(xp >= 2 && xp <= 5)
            return (double)1500 + (double)25/100*1500;
        else if(xp > 5)
            return (double)1500 + (double)50/100*1500;
        return 1500.0;
    }
}

