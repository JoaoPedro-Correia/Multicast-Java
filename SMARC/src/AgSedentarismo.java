public class AgSedentarismo {
    int quantExercioSemana;

    public AgSedentarismo(int quantExercioSemana) {
        this.quantExercioSemana = quantExercioSemana;
    }

    public int getQuantExercioSemana() {
        return quantExercioSemana;
    }

    public void setQuantExercioSemana(int quantExercioSemana) {
        this.quantExercioSemana = quantExercioSemana;
    }


    public double grauDeEvidenica(int dias){
        switch (dias){
            case(3):
                return 0.25;
            case(2):
                return  0.50;
            case(1):
                return 0.75;
            case(0):
                return 1;
            default:
                return 0;
        }
    }
}
