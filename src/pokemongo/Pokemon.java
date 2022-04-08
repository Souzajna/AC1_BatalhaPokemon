package pokemongo;

public class Pokemon {

    public Pokemon(String nome, String tipo, int level) { // construtor
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
    }

    public int getForca() { // GET e SET
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String[] getAtaques() {
        return ataques;
    }

    public void setAtaques(String[] ataques) {
        this.ataques = ataques;
    }

    public void impressaoAtaques() {
        System.out.println("Tipos de Ataques: ");
        
        for (int pos = 0; pos < ataques.length; pos++) {
            System.out.println(ataques[pos]);
        }
    }
    
    
    public int posAtaque(String n) {
        int r = 1;
        for (int pos = 0; pos < ataques.length; pos++) {
            if (n == ataques[pos]) {
                r = pos;
            }
        }

        return r;
    }

    public void nomeAtaques(int p) {
        System.out.println("------------------------");
        System.out.println("Nome do Pokemon: " + nome);
        System.out.println("Tipo do Pokemon: " + tipo);
        System.out.println("Nome do Ataque: " + ataques[p]);
    }

    public String nome;
    public String tipo;
    public int level;
    private int forca;
    private String ataques[] = new String[5];

}
