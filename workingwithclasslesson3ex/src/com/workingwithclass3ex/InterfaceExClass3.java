package com.workingwithclass3ex;

public class InterfaceExClass3 implements InterfaceExLesson3 {

    private boolean askerlik;
    private boolean adli_sicil;

    public InterfaceExClass3(boolean b, boolean askerlik) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgulama() {
        if(askerlik){
            System.out.println("Askerligimi yaptım. ");

        }
            else{
            System.out.println("Askeligimi henüz yapmadım");
        }

    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalamam: " + derece;
    }

    @Override
    public void adl_sicil_sorgula() {
        if(adli_sicil){
            System.out.println("Adli sicil kaydim bulunuyor.");

        }   else{
            System.out.println("Herhangi bir adli sicil kaydım bulunmuyor");

        }

        
    }

    @Override
    public void is_tecrübesi(String[] array) {
        System.out.println("Bilgisayar Mühendisi Olarak Şu Şirketlerle Çalıştım");
        
        for (int i = 0 ; 1 <array.length;i++){
            System.out.println(array[i]);
        }

    }
}
