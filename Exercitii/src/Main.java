public class Main {
    public static void main(String[] args){
        DevTeam dv = new DevTeam("Naruto", 5);
        HR hr = new HR("Sasuke", 6);

        Membru ninja1 = new Membru("Sakura", 31, 100, 10 );
        Membru ninja2 = new Membru("Boruto", 13, 200, 1 );
        Membru ninja3 = new Membru("Sarada", 13, 300, 1 );
        Membru ninja4 = new Membru("Mitsuki", 12, 400, 2 );
        Membru ninja5 = new Membru("Himawari", 10, 500, 0 );
        Membru ninja6 = new Membru("Hinata", 32, 600, 11 );
        Membru ninja7 = new Membru("Sakura1", 31, 700, 10 );
        Membru ninja8 = new Membru("Boruto1", 13, 800, 1 );
        Membru ninja9 = new Membru("Sarada1", 13, 900, 1 );
        Membru ninja10 = new Membru("Mitsuki1", 12, 1000, 2 );
        Membru ninja11 = new Membru("Himawari1", 10, 1100, 0 );
        Membru ninja12 = new Membru("Hinata1", 33, 1200, 6);

        System.out.println(dv.setLeader(ninja2));
        System.out.println(dv.setLeader(ninja6));
        dv.addMember(ninja2);
        dv.addMember(ninja5);
        dv.addMember(ninja8);
        dv.addMember(ninja11);
        dv.addMember(ninja4);

        hr.setLeader(ninja1);
        hr.addMember(ninja3);
        hr.addMember(ninja12);
        hr.addMember(ninja7);
        hr.addMember(ninja9);
        hr.addMember(ninja10);

        System.out.println(dv.getCost());
        System.out.println(hr.getCost());

        System.out.println(dv.toString());
        System.out.println(hr.toString());

        System.out.println(dv.removeMember(ninja4));
        System.out.println(dv.toString());
        System.out.println(dv.getCost());
    }
}
