public class Robot {
    IBehaviour behaviour;
    String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBehaviour(IBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void move()
    {
        System.out.println("le robot :" + this.name + " execute l'lgorithme de mouvement : "  );
        int command = this.behaviour.moveCommand();// afficher un message

    }

}
