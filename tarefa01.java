class BalancoTrimestral{
    public static void main(String[] args) {
        int gastosJaneiro;
        gastosJaneiro = 15000;

        int gastosFevereiro;
        gastosFevereiro = 23000;

        int gastosMarco;
        gastosMarco = 17000;

        int gastosTrimestre;
        gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediatrimestral; 
        mediatrimestral = gastosTrimestre / 3;

        System.out.println(gastosTrimestre);
        System.out.println(mediatrimestral);
    }
}