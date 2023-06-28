public class NormalBehaviour implements IBehaviour {
    @Override
    public int moveCommand() {
        System.out.println("- Patrouiller sur un chemin définit ");

        return 1;
    }
}
