package a;

/*
    Clean code -  o carte scrisa de un anume Uncle Bob -> Robert C. Martin
    pachetele :sunt substantive: service,controller, entity, model, mapper; si se scriu cu litera mica
    clasele :sunt substantive si incep cu litera mare apoi camelCase
    constructorii: sunt substantive cu toate ca ele sunt niste metode speciale, constructorii au aceeasi nume cu clasa:
                daca ai o calsa Test , constructorul va fi si el Test(){}
    interfetele: sunt adverbe: Flyable, Readable
    metodele : descriu o actiune: ele sunt verbe si se scriu cu litera mica: doSomething(), compute(), sum(), getName(), setName()
        -cat de lung poate fi numele unei metode? R: nu ne intereseaza nici mai scurt nici mai lung, numele trebuie sa fie suficient
        de mare incat sa descrie ce face acea metoda
            contraexemplu: public static int m(int a, int b)  { return a+b;}  -numele este scris prost
            exemplu : public static int sumOfInterestAndPrincipalWhenComputingCreditRate(int interest, int principal){return interest+principal}
        -cate linii de cod trebuie sa contina o metoda? R: cate sunt necesare, incat metoda SA FACA UN SINGUR LUCRU
            -cartea sustine acest principiu al unui singur lucru
            contraexemplu: cate lucruri face metoda de mai jos? face doua lucruri
            public static int sumOfInterestAndPrincipalWhenComputingCreditRate(int interest, int principal){
                                int nrClienti=17;
                                int nrContracteSemnate=10;
                                int nrClientiPierduti = nrClienti - nrContracteSemnate;
                                sendMailToManager(nrClientiPierduti);
                                return interest+principal}

            REFACTOR:
            public static int sumOfInterestAndPrincipalWhenComputingCreditRate(int interest, int principal){
                                return interest+principal}
            public static int notifyManagerAboutNumberOfContracts(){
                                int nrClienti=17;
                                int nrContracteSemnate=10;
                                int nrClientiPierduti = nrClienti - nrContracteSemnate;
                                sendMailToManager(nrClientiPierduti);
 */

public class Ex4CleanCode {
}
