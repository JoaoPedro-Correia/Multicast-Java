public class AgObseidade {
    private double peso;
    private double altura;
    ///////////////////////////////////////
    public AgObseidade(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }


    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
///////////////////////////////////////

    //faz o calculo do IMC(peso/altura²)
    public static double calcIMC(double peso, double altura){
        return peso/(Math.pow(altura,2));
    }

    //calc evidenica favoravel
    public static double grauEvidenciaFavoravel(double pacienteIMC){
        if(pacienteIMC > 40){
            return 1;
        }else if(pacienteIMC < 25){
            return  0;
        }
        else{
            return (pacienteIMC - 25)/(40-25);
        }
    }


    public void avaliacao(){
        double x = grauEvidenciaFavoravel(calcIMC(peso,altura));

        if(x > 1){

        }
    }
}
