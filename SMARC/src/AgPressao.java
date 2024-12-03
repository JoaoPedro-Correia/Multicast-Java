public class AgPressao {
    double pressaoSistolica,pressaoDiastolcia;

    public AgPressao(double pressaoDiastolcia, double pressaoSistolica) {
        this.pressaoDiastolcia = pressaoDiastolcia;
        this.pressaoSistolica = pressaoSistolica;
    }

    public double getPressaoSistolica() {
        return pressaoSistolica;
    }

    public void setPressaoSistolica(double pressaoSistolica) {
        this.pressaoSistolica = pressaoSistolica;
    }

    public double getPressaoDiastolcia() {
        return pressaoDiastolcia;
    }

    public void setPressaoDiastolcia(double pressaoDiastolcia) {
        this.pressaoDiastolcia = pressaoDiastolcia;
    }

    //calc evidenica favoravel
    public static double calcPressaoPAS(double pressaoSistolica){
        if(pressaoSistolica > 140){
            return 1;
        }else if(pressaoSistolica < 120){
            return  0;
        }
        else{
            return (pressaoSistolica - 120)/(140-120);
        }
    }

    public static double calcPressaoPAD(double pressaoDiastolcia){
        if(pressaoDiastolcia > 90){
            return 1;
        }else if(pressaoDiastolcia < 80){
            return  0;
        }
        else{
            return (pressaoDiastolcia - 80)/(90 - 80);
        }
    }

}
