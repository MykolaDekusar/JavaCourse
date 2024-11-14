package package2;
import package1.*;//importiamo tutte le classi dal package 1

public class C {
	       static String messaggioDefault= "Sono un messaggio di default"; //visibile solo alla classe corrente e al pacchetto di cui ne fa parte
	public static String messaggioPublic="Sono un messaggio public"; //visibile a tutto il progetto
	protected static String messaggioProtected="Sono un messaggio protected"; //visibile alla classe corrente, al pacchetto corrente e alla sottoclasse (la classe che extends)
	private static String messaggioPrivate="Sono un messaggio private"; //visibile solo alla classe corrente
}
