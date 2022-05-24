public class Player extends Thread{
    public String nome;

    public Player(String nome){
        this.nome=nome;
        
    }
    public String getPlayer(){
        return this.nome;
    }
    public void setPlayer(String nome){
        this.nome=nome;
    }
   
   @Override
   public void start(){
       int numero=(int)(Math.random()*7);
       int numero2=(int)(Math.random()*7);
       if(numero == 0 || numero2 ==0){
            numero=(int)(Math.random()*7);
            numero2=(int)(Math.random()*7);
       }
       int somma=numero+numero2;
       System.out.println("al giocatore "+nome+" è uscito il numero "+numero +" e il numero "+numero2);
       System.out.println("il giocatore "+nome+" ha ottenuto un punteggio di:" +somma);
       if(numero == numero2){
        int numero3=(int)(Math.random()*7);
            if(numero3==0){
                numero3=(int)(Math.random()*7);
            }
           System.out.println("lancio bonus: "+numero3);
           int somma2=somma+numero3;
           System.out.println("il giocatore "+nome+" ha ottenuto un punteggio di:" +somma2);
       }
   }
}
