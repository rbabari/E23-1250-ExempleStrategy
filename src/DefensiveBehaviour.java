public class DefensiveBehaviour implements IBehaviour {
    @Override
    public int moveCommand() {
        System.out.println("- Prends la fuite");
        System.out.println("- Aller se faire réparer");
        return -1;
    }
}
