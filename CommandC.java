

public class CommandC implements Command{ // la classe CommandA qui implémente l'interface Command
private RecepteurImpl2 recepteur; // commande le recepteur 2
public CommandC(RecepteurImpl2 recepteur){
	this.recepteur = recepteur; // pour creer une instance de la commandeA on specifie le recepteur
}
public void executer(){ // redéfinition de la methode
     recepteur.action3(); // pour executer l'action1
}
}
