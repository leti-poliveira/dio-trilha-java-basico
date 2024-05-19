package edu.leticia.metodos;

public class SmartTv {
    boolean ligada=false; //smartTv em 3 características a nível da classe
    int canal=1;
    int volume=25;

public void aumentarCanal(){
    canal++;
}


public void diminuirCanal(){
    canal--;
}

public void mudarCanal (int novoCanal){ //esta linha fica como um parâmetro "qual o canal?"
    canal = novoCanal;
}



    public void aumentarVolume(){
        volume++;  //ou volume = volume + 1;  - valores unários.
        System.out.println("Aumentando o Volume para " + volume);
        
    }
        public void diminuirVolume(){
            volume--;
           System.out.println("Diminuindoo volume para " + volume);
    }




public void ligar(){
    ligada=true;
}

public void desligar(){
    ligada=false;






}




}
