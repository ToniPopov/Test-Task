package Court;

import java.util.Map.Entry;

public class DemoCourt {
	public static void main(String[] args) {

		// Case(Eyewitness witness, Accused accused, Accuser accuser, Judge
		// judge, CaseEnum type)
		Eyewitness witness = new Eyewitness("gosho svidetelq", "Sofia", 25);
		Lawyer advokat = new Lawyer("Rusi advokata ", 15, 20);
		Accused accused = new Accused("Pesho obvinqemiq", "Tundra", 20, advokat);
		Accuser accuser = new Accuser("Mitko obvinitelq", "ginci", 21);
		Judge judge = new Judge("Spravedliveca", 15, 15);
		Prosecutor prosec = new Prosecutor("Mitko obvinitelq", 15, 21);
		Case delo = new Case(witness, accused, accuser, judge, CaseEnum.CITIZEN);
		// delo.printJuror();
		Case delo2 = new Case(witness, accused, prosec, judge, CaseEnum.CRIMINAL);
		Court vTurnovo = new Court("Veliko Turnovo", "do carevec");

		vTurnovo.addCase(delo);
		vTurnovo.addCase(delo2);
		
		vTurnovo.allCases.first().caseInProces();
		
//		System.out.println(vTurnovo);
//		vTurnovo.printAllCases();
//		vTurnovo.allCases.first().judge.makeConviction(vTurnovo.allCases.first().jurorDecision(),
//				vTurnovo.allCases.first().accused);
		// if(vTurnovo.allCases.first().jurorDecision()){
		// System.out.println("Gilty");
		// }else {
		// System.out.println("Not gilty");
		// }

	}
}
