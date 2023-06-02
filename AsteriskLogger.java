package week05;

public class  AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
	}

	@Override
	public void Error(String error) {
		// TODO Auto-generated method stub
		String additionalAsterisks = "*";
			for (int i = 0; i < error.length() - 1; i++) {
				additionalAsterisks = additionalAsterisks + "*";
			}
		
		System.out.println("*************" + additionalAsterisks);
		System.out.println("***Error: " + error + "***");
		System.out.println("*************" + additionalAsterisks);
	}

}
