package Translate;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Translate {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Map<String,String> variable=fillMap();
		Path path=Paths.get("F:\\t8.shakespeareTranslate.txt");
		Stream <String> lines;
		try {
			lines=Files.lines(path,Charset.forName("UTF-8"));
			List<String>replacedline=lines.map(line -> replacestr(line,variable)).collect(Collectors.toList());
			Files.write(path, replacedline,Charset.forName("UTF-8"));
			lines.close();
			System.out.println("file is change");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
		public static Map<String,String> fillMap() throws FileNotFoundException{
			 Scanner sc1=new Scanner(new File("F:\\French.txt"));
			 String translate=sc1.nextLine();
			 Scanner sc2=new Scanner(new File("F:\\find_words.txt"));
			 String test=sc2.nextLine();		 
			 
			 Map<String, String> map=new HashMap<String,String>();
			 map.put("abide","respecter");
				map.put("about","sur");     
				map.put("above","au dessus");
				map.put("abroad","à l'étranger");
				map.put("absence","absence");
				map.put("abuse","abuser de");
				map.put("according","selon");
				map.put("account","Compte");
				map.put("accuse","accuser");
				map.put("acquainted","connaissance");
				map.put("action","action");
				map.put("advantage","avantage");
				map.put("advice","Conseil");
				map.put("affairs","affaires");
				map.put("affection","affection");
				map.put("affections","affections");
				map.put("afraid","peur");     
				map.put("after","après");
				map.put("afterwards","ensuite");
				map.put("again","encore");
				map.put("alive","vivant");
				map.put("almost","presque");
				map.put("alone","seul");
				map.put("along","le long de");
				map.put("already","déjà");
				map.put("although","bien que");
				map.put("always","toujours");
				map.put("ambition","ambition");
				map.put("ancient","ancien");
				map.put("angel","ange");
				map.put("anger","colère");
				map.put("another","un autre");
				map.put("answer","répondre");
				map.put("anything","n'importe quoi");
				map.put("apparel","vêtements");
				map.put("appear","apparaître");
				map.put("appears","apparaît");
				map.put("approach","approche");
				map.put("argument","argument");
				map.put("ariel","Ariel");
				map.put("armour","armure");
				map.put("aside","de côté");
				map.put("asleep","endormi");
				map.put("assure","assurer");
				map.put("athens","Athènes");
				map.put("attend","assister");
				map.put("attended","assisté");
				map.put("authority","autorité");
				map.put("avoid","éviter");
				map.put("awake","éveillé");
				map.put("awhile","quelque temps");
				map.put("banish","bannir");
				map.put("barren","Dénudé");
				map.put("bassianus","bassianus");
				map.put("bastard","Connard");
				map.put("battle","bataille");
				map.put("beard","barbe");
				map.put("bearing","palier");
				map.put("bears","ours");
				map.put("beast","la bête");
				map.put("beaten","battu");
				map.put("beauty","beauté");
				map.put("because","car");
				map.put("become","devenir");
				map.put("bedford","Bedford");
				map.put("before","avant");
				map.put("beggar","mendiant");
				map.put("begin","commencer");
				map.put("behalf","nom");
				map.put("behind","derrière");
				map.put("behold","voir");
				map.put("being","étant");
				map.put("believe","croyez");
				map.put("belike","être comme");
				map.put("below","au dessous de");
				map.put("benefit","avantage");
				map.put("besides","outre");
				map.put("betray","trahir");
				map.put("better","mieux");
				map.put("between","entre");
				map.put("beyond","au-delà");
				map.put("birth","naissance");
				map.put("bishop","évêque");
				map.put("bitter","amer");
				map.put("black","noir");
				map.put("blame","faire des reproches");
				map.put("bless","bénir");
				map.put("blessing","bénédiction");
				map.put("blest","heureux");
				map.put("blind","aveugle");
				map.put("blood","du sang");
				map.put("blows","coups");
				map.put("blunt","cru");
				map.put("blush","rougir");
				map.put("bodies","corps");
				map.put("bones","des os");
				map.put("borne","supporté");
				map.put("bottom","bas");
				map.put("bought","acheté");
				map.put("bound","lié");
				map.put("bounty","prime");
				map.put("brain","cerveau");
				map.put("brains","cerveaux");
				map.put("brave","courageux");
				map.put("breast","Sein");
				map.put("breath","souffle");
				map.put("breed","race");
				map.put("brief","bref");
				map.put("bright","brillant");
				map.put("bring","apporter");
				map.put("broke","cassé");
				map.put("brook","ruisseau");
				map.put("brother","frère");
				map.put("brought","apporté");
				map.put("brows","sourcils");	
				map.put("burden","fardeau");
				map.put("buried","enterré");
				map.put("burning","brûlant");
				map.put("business","Entreprise");
				map.put("cannot","ne peux pas");
				map.put("capitol","Capitole");
				map.put("captain","capitaine");     
				map.put("cardinal","cardinal");
				map.put("cares","se soucie");
				map.put("carry","porter");
				map.put("castle","Château");
				map.put("catch","capture");
				map.put("cause","cause");
				map.put("cease","cesser");
				map.put("certain","certain");
				map.put("chain","chaîne");
				map.put("chair","chaise");
				map.put("challenge","défi");
				map.put("chamber","chambre");
				map.put("chance","chance");
				map.put("change","changement");
				map.put("charge","charge");
				map.put("charity","charité");
				map.put("chaste","chaste");
				map.put("cheek","joue");
				map.put("cheer","acclamation");
				map.put("chide","gronder");
				map.put("chief","chef");
				map.put("child","enfant");
				map.put("choice","choix");
				map.put("church","église");
				map.put("cinna","cinna");
				map.put("citizen","citoyenne");
				map.put("civil","civil");
				map.put("claim","prétendre");
				map.put("clarence","clarté");
				map.put("claud","claud");
				map.put("claudio","Claudio");
				map.put("clear","clair");
				map.put("clifford","Clifford");
				map.put("close","proche");
				map.put("cloten","cailloter");
				map.put("clothes","vêtements");
				map.put("clouds","des nuages");
				map.put("clown","pitre");
				map.put("college","Université");
				map.put("colour","Couleur");
				map.put("comes","vient");
				map.put("comfort","confort");
				map.put("coming","venir");
				map.put("cominius","cominius");
				map.put("command","commander");
				map.put("commanded","commandé");
				map.put("commend","saluer");
				map.put("commercial","commercial");
				map.put("commission","commission");
				map.put("commit","commettre");
				map.put("common","commun");
				map.put("companion","un compagnon");
				map.put("company","entreprise");
				map.put("complete","Achevée");
				map.put("complexion","complexion");
				map.put("condition","état");
				map.put("conduct","conduite");
				map.put("confess","avouer");
				map.put("conscience","conscience");
				map.put("consent","consentement");
				map.put("consider","considérer");
				map.put("constable","gendarme");
				map.put("constant","constant");
				map.put("contempt","mépris");
				map.put("content","contenu");
				map.put("contrary","contraire");
				map.put("copies","copies");
				map.put("copyright","droits d'auteur");
				map.put("could","pourrait");
				map.put("council","conseil");
				map.put("counsel","Conseil");
				map.put("count","compter");
				map.put("counterfeit","contrefaire");
				map.put("countess","comtesse");
				map.put("country","pays");
				map.put("courage","courage");
				map.put("course","cours");
				map.put("court","tribunal");
				map.put("courtesy","courtoisie");
				map.put("cousin","cousin");
				map.put("coward","lâche");
				map.put("crave","demander");
				map.put("creature","créature");
				map.put("credit","crédit");
				map.put("cromwell","Cromwell");
				map.put("cross","traverser");
				map.put("crown","couronne");
				map.put("cruel","cruel");
				map.put("cunning","ruse");
				map.put("cupid","Cupidon");
				map.put("curse","malédiction");
				map.put("custom","Douane");
				map.put("dagger","dague");
				map.put("damned","damné");
				map.put("dance","Danse");
				map.put("danger","danger");
				map.put("darkness","obscurité");
				map.put("daughter","");
				map.put("deadly","mortel");
				map.put("dearest","très cher");
				map.put("dearly","chèrement");
				map.put("death","décès");
				map.put("deeds","actes");
				map.put("defend","défendre");
				map.put("degree","diplôme");
				map.put("delight","délice");
				map.put("deliver","livrer");
				map.put("demand","demande");
				map.put("denied","refusé");
				map.put("depart","partir");
				map.put("desert","désert");
				map.put("deserve","mériter");
				map.put("desire","le désir");
				map.put("despair","désespoir");
				map.put("desperate","désespéré");
				map.put("despite","malgré");
				map.put("device","dispositif");
				map.put("devil","diable");
				map.put("devise","concevoir");
				map.put("didst","didst");
				map.put("dinner","dîner");
				map.put("discourse","discours");
				map.put("discover","découvrir");
				map.put("disgrace","disgrâce");
				map.put("dishonour","déshonorer");
				map.put("dispatch","envoi");
				map.put("displeasure","mécontentement");
				map.put("disposition","disposition");
				map.put("distributed","distribué");
				map.put("divine","Divin");
				map.put("doctor","docteur");
				map.put("doing","Faire");
				map.put("dolabella","Dolabella");
				map.put("doors","des portes");
				map.put("double","double");
				map.put("doubt","doute");
				map.put("download","Télécharger");
				map.put("dramatis","dramatis");
				map.put("drawn","tiré");
				map.put("dread","crainte");
				map.put("dreadful","horrible");
				map.put("dream","rêver");
				map.put("dreams","rêves");
				map.put("drink","boisson");
				
			 return map;
		}

		private static String replacestr(String phara,Map<String,String>map)
		{
			 for(Map.Entry<String, String> entry:map.entrySet())
			 {
				 if(phara.contains(entry.getKey()))
				 {
					 phara=phara.replace(entry.getKey(), entry.getValue());
				 }
			 }
			 return phara;
		}
}
		





		 
	      

