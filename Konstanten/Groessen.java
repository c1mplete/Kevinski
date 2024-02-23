package Konstanten;

//Enums haben COMPILE TIME SAFETY
enum Groessen {
    KLEIN, MITTEL, GROSS, EXTRAGROSS;

    // Enums können Methoden enthalten
    public String getGroessen() {
        switch (this) {
            case KLEIN -> {
                return "klein";
            }
            case MITTEL -> {
                return "mittel";
            }
            case GROSS -> {
                return "gross";
            }
            case EXTRAGROSS -> {
                return "extragross";
            }
            default -> {
                return null;
            }
        }
    }

}
