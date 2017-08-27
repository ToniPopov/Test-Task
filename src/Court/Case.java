package Court;

import java.util.TreeSet;

public class Case implements Comparable<Case> {

	static int caseNumber = 1000;
	int caseID;
	CaseEnum type;
	Judge judge;
	TreeSet<Juror> juryMan = new TreeSet<Juror>();
	Accused accused;
	IBlame accuser;
	Eyewitness witness;

	Case(Eyewitness witness, Accused accused, IBlame accuser, Judge judge, CaseEnum type) {
		Case.caseNumber++;
		caseID = Case.caseNumber;
		if (type.equals(CaseEnum.CITIZEN)) {
			this.type = type;
			for (int i = 1; i <= 3; i++) {
				juryMan.add(new Juror(("Juror " + i), (10 + i), (10 + i)));
			}
		} else if (type.equals(CaseEnum.CRIMINAL)) {
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

	@Override
	public int compareTo(Case o) {
		return this.caseID - o.caseID;
	}

	public String toString() {
		String name;
		if (accuser instanceof Accuser) {
			name ="\nAccuser: "+ ((Accuser) this.accuser).name;
		} else {
			name = "\nProsecutor: "+ ((Prosecutor) this.accuser).name;
		}
		return "\nCase id: " + this.caseID + "\nType of case: " + this.type + "\nJudge: " + this.judge.name
				+ "\nAccesed: " + this.accused.name +  name + "\nWitness: " + this.witness.name;
	}
}
