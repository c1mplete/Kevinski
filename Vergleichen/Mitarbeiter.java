package Vergleichen;

public class Mitarbeiter implements Comparable<Mitarbeiter> {

    private int id;
    private String name;
    private int alter;

    public Mitarbeiter(int id, String name, int alter) {
        this.id = id;
        this.name = name;
        this.alter = alter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        return this.name + " " + this.alter;
    }

//    @Override
//    public int compareTo(Mitarbeiter m) {
//        if (this.alter < m.alter) {
//            return -1;
//        } else if (this.alter == m.alter) {
//            return 0;
//        } else {
//            return 1;
//        }
//    }

//    @Override
//    public int compareTo(Mitarbeiter m){
//        return this.name.compareTo(m.name);
//    }

//    @Override
//    public int compareTo(Mitarbeiter m){
//        int vergleich = this.name.compareTo(m.getName());
//        if(vergleich != 0) {
//            return vergleich;
//        }else{
//            return vergleich;
//        }
//
//
//    }

    @Override
    public int compareTo(Mitarbeiter m) {
        int vergleich = this.name.compareTo(m.getName());
        if (vergleich != 0) {
            return vergleich;
        }
        if (vergleich == 0) {
            vergleich = Integer.compare(this.alter, m.getAlter());
        }
        if (vergleich != 0) {
            return vergleich;
        }
        else {
            return vergleich;
        }
    }

}
