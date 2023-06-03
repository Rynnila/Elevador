import java.util.Scanner;

public class Elevador {
    public float capacidadeMaximaPeso;
    public int capacidadeMaximaPessoas;
    public String marca;
    public float velocidade;
    public String[] andares;
    public Elevador() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual a capacidade de peso máxima do elevador(kg): ");
        this.capacidadeMaximaPeso = entrada.nextFloat();

        System.out.print("Qual a capacidade máxima de pessoas do elevador: ");
        this.capacidadeMaximaPessoas = entrada.nextInt();

        System.out.print("Qual a marca do elevador: ");
        this.marca= entrada.next();

        System.out.print("Qual é a velocidade do elevador: ");
        this.velocidade= entrada.nextFloat();

    }
    public void imprimirDados() {
        System.out.println("Capacidade (kg): " + this.capacidadeMaximaPeso + " kg");
        System.out.println("Capacidade pessoas: " + this.capacidadeMaximaPessoas);
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Andares: " + this.andares);
    }


}