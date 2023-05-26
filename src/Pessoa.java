public class Pessoa extends Animal {
    //Atributo
    String sobrenome;

    //Metodos de classe
    public void falar(){
        System.out.println("falei");
    }

    public void falar(String volume){
        System.out.println("falei " + volume);
    }

    //Sobrecarga de método
    public void falar(String volume) {
        System.out.println("falei " + volume);
    }
        public String falar(String volume, String tom){
            return "falei " + volume;
        }
        //Sobrescrita do método
    public void comer() {
        System.out.println("Comer como pessoa");
    }
}
}
