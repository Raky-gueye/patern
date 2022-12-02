
public class CommandA implements Command{ // la classe CommandA qui implémente l'interface Command
private RecepteurImpl1 recepteur; // commande le recepteur 1
public CommandA(RecepteurImpl1 recepteur){
	this.recepteur = recepteur; // pour creer une instance de la commandeA on specifie le recepteur
}
public void executer(){ // redéfinition de la methode
     recepteur.action1(); // pour executer l'action1
}
}

