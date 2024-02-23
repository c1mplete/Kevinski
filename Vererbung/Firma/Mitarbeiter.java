package Vererbung.Firma;

public class Mitarbeiter implements Comparable<Mitarbeiter> {

        static int idincr = 0;
        private String name;
        private int id;

        public Mitarbeiter(String name){
            this.name = name;
            this.id = ++idincr;
        }

        public int getID(){
            return id;
        }

        public String getName(){
            return name;
        }
        public int compareTo(Mitarbeiter m) {
            return this.name.compareTo(m.name);
        }
        @Override
        public String toString(){
            return "ID: " + id + " Name: " + name;
        }


}
