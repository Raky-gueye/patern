
import java.util.HashMap;
import java.util.Map;
public class Invoqueur{
private  Map<String, Command > commandes = new HashMap< String, Command>();// chadue commande a un nom et représente un objet de type commande 
public void addNewCommand(String ref, Command cmd){// pour ajouter une  commande 
commandes.put(ref,cmd);
 }
public void invoquer(String ref ){
	Command cmd=commandes.get(ref); // recupére la commande 
	if (cmd!=null) {
		cmd.executer();
		
	}

}

}
