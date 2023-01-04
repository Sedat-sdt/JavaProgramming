package day44_Abstraction_Interface.carTask;

public interface AutoPilot extends AutoPark {
    boolean hasAutoPilot=true;

    void selfDrive();



    /*
     Create a child interface of AutoPark named AutoPilot
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();
     */
}
