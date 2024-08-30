import java.util.Random;                    //Importa classe que gera números aleatoriamente

public class BaralhoCartas {

    public static void main(String[] args) {

    String[] faces = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] nipes = {"Espadas", "Copas", "Paus", "Ouros"};

    //Instancia a classe Random com o nome "aleatorio" para dentro do método main
    Random aleatorio = new Random();       
    
    //GERA UMA FACE ALEATORIA:
    int indiceFace = aleatorio.nextInt(faces.length);   
    //Vincula a classe Random(aleatorio) para sortear um número dentro da array "faces", e armazena em "indiceFace"    
    String face = faces[indiceFace];  
    //Array "faces" passa a receber o valor sorteado em "indiceFace" e armazena o resultado em "face"

    //GERA UM NIPE ALEATORIO:
    int indiceNipe = aleatorio.nextInt(nipes.length);   
    //Vincula a classe Random(aleatorio) para sortear um número dentro da array "nipes", e armazena em "indiceNipe"    
    String nipe = nipes[indiceNipe];  
    //Array "nipes" passa a receber o valor sorteado em "indiceNipes" e armazena o resultado em "nipe"
    

    String carta = ((face) + " de " + (nipe));
    System.out.println(carta);


    }

}
