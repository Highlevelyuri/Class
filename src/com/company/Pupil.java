package com.company;

public class Pupil {
    protected  String puple1;
    protected  String puple2;
    protected  String puple3;
    protected  String puple4;

    public Pupil(String puple1, String puple2, String puple3, String puple4) {
        this.puple1 = puple1;
        this.puple2 = puple2;
        this.puple3 = puple3;
        this.puple4 = puple4;
    }

    void  Study (){
        System.out.println(" В обучении");
        Goodpiple goodpiple = new Goodpiple();
        goodpiple.st();
        Exelentpuple exelentpuple = new Exelentpuple();
        exelentpuple.st();
        Bedpuple bedpuple = new Bedpuple();
        bedpuple.st();





    }
    void Read(){
        System.out.println(" В чтении");
        Goodpiple goodpiple = new Goodpiple();
        goodpiple.rd();
        Exelentpuple exelentpuple = new Exelentpuple();
        exelentpuple.rd();
        Bedpuple bedpuple = new Bedpuple();
        bedpuple.rd();

    }
    void Write(){
        System.out.println(" В письме");
        Goodpiple goodpiple = new Goodpiple();
        goodpiple.wr();
        Exelentpuple exelentpuple = new Exelentpuple();
        exelentpuple.wr();
        Bedpuple bedpuple = new Bedpuple();
        bedpuple.wr();
    }
    void Relax(){
        System.out.println(" В отдыхе");
        Goodpiple goodpiple = new Goodpiple();
        goodpiple.rx();
        Exelentpuple exelentpuple = new Exelentpuple();
        exelentpuple.rx();
        Bedpuple bedpuple = new Bedpuple();
        bedpuple.rx();
    }

}
