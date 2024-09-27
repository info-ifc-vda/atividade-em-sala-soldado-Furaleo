
package batalhao;
import java.util.Scanner;

class Soldado{

    //atributos
    Scanner teclado = new Scanner(System.in);
    private String nome;
    private int posicao;
    private String arma;
    public static int quant = 0;
    //pensar sobre o controle no numero de instancias

    //construtor
    public Soldado(String nome){
        this.nome = nome;
        this.posicao = 0;
        this.arma = arma;
        this.quant++;
    }

    public void reconhecimento(){
        System.out.println("Nome do Soldado: ");
        nome = teclado.nextLine();
        System.out.println("Nome da arma do soldado: ");
        arma = teclado.nextLine();
        System.out.println("metros que ele deve percorrer por padrão: ");
        posicao = teclado.nextInt();
    }
    public void movimentar(){
        System.out.println("metros que ele deve percorrer: ");
        posicao = teclado.nextInt();
        System.out.println("o soldado se movimentou x metros ");
        posicao = teclado.nextInt();

    }
    //pensar na sobrecarga
    
    public void atacar(){
        if (quant < 10) {
            System.out.println("O soldado não vai atacar, esperando até alcançar 10 soldados.");
            
        }else{
            System.out.println("Os soldados irão atacar.");
            System.out.println("o soldado(x) atacou com a arma(x)"); 
        }
    }
    //pensar na sobrecarga
    //gets e sets

    public static void main(String[] args) {
        Soldado individuo = new Soldado();

        // Usando os métodos da classe
        individuo.reconhecimento();
        individuo.movimentar();
        individuo.atacar();

    }

}