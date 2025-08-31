package lambdaTest;

public class CalcResult {
	
	private int sumResult;
	private double divResult;
	private double mulResult;
	private int subResult;
	
	public CalcResult() {
	}

	public CalcResult(int sumResult, double divResult, double mulResult, int subResult) {
		this.sumResult = sumResult;
		this.divResult = divResult;
		this.mulResult = mulResult;
		this.subResult = subResult;
	}

	public int getSumResult() {
		return sumResult;
	}

	public void setSumResult(int sumResult) {
		this.sumResult = sumResult;
	}

	public double getDivResult() {
		return divResult;
	}

	public void setDivResult(double divResult) {
		this.divResult = divResult;
	}

	public double getMulResult() {
		return mulResult;
	}

	public void setMulResult(double mulResult) {
		this.mulResult = mulResult;
	}

	public int getSubResult() {
		return subResult;
	}

	public void setSubResult(int subResult) {
		this.subResult = subResult;
	}
	
	
	
}
