package first;

import java.util.*;

public class Faculty extends Person {

	private int YearIOfExp;
	private String Sme;

	public Faculty(String fname, String lname, int YearIOfExp, String Sme) {
		super(fname, lname);
		this.YearIOfExp = YearIOfExp;
		this.Sme = Sme;
	}

	public int getYearIOfExp() {
		return YearIOfExp;
	}

	public void setYearIOfExp(int yearIOfExp) {
		YearIOfExp = yearIOfExp;
	}

	public String getSme() {
		return Sme;
	}

	public void setSme(String sme) {
		Sme = sme;
	}

	@Override
	public String toString() {
		return "Faculty [YearIOfExp=" + YearIOfExp + ", Sme=" + Sme + ", toString()=" + super.toString() + "]";
	}

}
