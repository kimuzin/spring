package test.vo;

public class TestVO {
	
	private int testNo;
	
	private String testId;
	
	private String testName;
	
	public TestVO(int testNo, String testId, String testName) {
		this.testNo = testNo;
		this.testId = testId;
		this.testName = testName;
	}

	public int getTestNo() {
		return testNo;
	}

	public void setTestNo(int testNo) {
		this.testNo = testNo;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	
	
}
