package Court;

import java.util.Random;
import java.util.TreeSet;

public class Case implements Comparable<Case> {

	static int caseNumber = 1000;
	int caseID;
	CaseEnum type;
	Judge judge;
	TreeSet<Juror> juryMan = new TreeSet<Juror>();
	Accused accused;
	IBlame accuser;
	Prosecutor prosec;
	Accuser acuser;
	Eyewitness witness;

	void caseInProces(){
		judge.broiDela++;
		for (Juror juror : juryMan) {
			juror.broiDela++;
		}
		accused.lawyer.broiDela++;
		if(type.equals(CaseEnum.CRIMINAL)){
			prosec.broiDela++;
		}
		
		if(type.equals(CaseEnum.CITIZEN)){
			accused.lawyer.askQuestion();
		}else if(type.equals(CaseEnum.CRIMINAL)){
			prosec.askQuestion();
		}
		judge.makeConviction(this.jurorDecision(), accused);
		
	}
	
	Case(Eyewitness witness, Accused accused, IBlame accuser, Judge judge, CaseEnum type) {
		Case.caseNumber++;
		caseID = Case.caseNumber;
		if (type.equals(CaseEnum.CITIZEN)) {
			this.acuser = (Accuser)accuser;
			this.type = type;
			for (int i = 1; i <= 3; i++) {
				juryMan.add(new Juror(("Juror " + i), (10 + i), (10 + i)));
			}
		} else if (type.equals(CaseEnum.CRIMINAL)) {
			this.prosec = (Prosecutor)accuser;
			this.type = type;
			for (int i = 1; i <= 13; i++) {
				juryMan.add(new Juror(("Juror " + i), (10 + i), (10 + i)));
			}
		}
		if (accused != null) {
			this.accused = accused;
		}
		if (witness != null) {
			this.witness = witness;
		}
		if (accuser != null) {
			this.accuser = accuser;
		}
		if (judge != null) {
			this.judge = judge;
		}
	}

	public void printJuror() {
		for (Juror juror : juryMan) {
			System.out.println(juror);
		}
	}

	public boolean jurorDecision() {
		int trueCount = 0;
		int falseCount = 0;
		Random rand = new Random();
		for (Juror juror : juryMan) {
			if (rand.nextInt(juryMan.size()) % 2 == 0) {
				trueCount++;
			} else if (rand.nextInt(juryMan.size()) % 2 == 0) {
				falseCount++;
			}
		}
		return trueCount > falseCount ? true : false;
	}

	@Override
	public int compareTo(Case o) {
		return this.caseID - o.caseID;
	}

	public String toString() {
		String name;
		if (accuser instanceof Accuser) {
			name = "\nAccuser: " + ((Accuser) this.accuser).name;
		} else {
			name = "\nProsecutor: " + ((Prosecutor) this.accuser).name;
		}
		return "\nCase id: " + this.caseID + "\nType of case: " + this.type + "\nJudge: " + this.judge.name
				+ "\nAccesed: " + this.accused.name + name + "\nWitness: " + this.witness.name;
	}
}
