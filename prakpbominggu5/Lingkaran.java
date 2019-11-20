class Lingkaran {
    public double jari;
    public void isijari(double jari){
        this.jari=jari;
    }
    public double getLuas() {
        return 3.14*(jari*jari);
    }
    public double getKeliling() {
        return 3.14*(2*jari);
    }
    public void getHasil() {
        System.out.println("Jadi luasnya "+this.getLuas()+"sedangkan kelilingnya "+this.getKeliling());
    }
            
}
class Test {
    public static void main(String args[]){
        Lingkaran l = new Lingkaran();
        l.isijari(10.0);
        l.getHasil();
    }
}

