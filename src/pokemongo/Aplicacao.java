package pokemongo;

public class Aplicacao {

    public static void main(String[] args) {
       Pokemon poke = new Pokemon("Pikachu", "Elétrico", 18); 
               
        poke.setForca(78);

        String a[] = new String[5];
        a[0] = "Cabeçada com raio.";
        a[1] = "Chute eletrizante.";
        a[2] = "Descarga elétrica.";
        a[3] = "Choque do Trovão.";
        a[4] = "Raio MegaFlash.";

        poke.setAtaques(a);

        poke.impressaoAtaques();

        System.out.println("Posição do ataque:" + poke.posAtaque("Chute"));
        poke.nomeAtaques(2); // retorna a posição do ataque
        }
}

