public class PassiveBehavior implements IBehaviour{
    @Override
    public int moveCommand() {
        System.out.println("Stand-by");
        return 0;
    }
}
