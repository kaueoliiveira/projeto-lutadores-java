import java.util.Random;

public class Luta {
    Random random = new Random();

//atributos

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
//Getters e Setters

    public void setDesafiado(Lutador l1){
        this.desafiado = l1;
    }
    public Lutador getDesafiado(){
        return this.desafiado;
    }
    public void setDesafiante(Lutador l2){
        this.desafiante = l2;
    }
    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    // Métodos
    public void marcarLuta(Lutador l1,Lutador l2){
        if (l1 != l2 && l1.getCategoria().equals(l2.getCategoria())){
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }
        else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }

    public void lutar(){
        if (isAprovada()){
            System.out.println("---DESAFIADO---");
            getDesafiado().apresentar();
            System.out.println("---DESAFIANTE---");
            getDesafiante().apresentar();
            int vencedor = random.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println(getDesafiado() + "Ganhou!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;

                case 2:
                    System.out.println(getDesafiante() + "Ganhou!");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                default:
                    System.out.println("Erro!");
            }
            }
        else{
            System.out.println("Luta não aprovada!");
        }
        }



    }

