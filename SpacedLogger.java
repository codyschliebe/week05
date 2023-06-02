package week05;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
		// TODO Auto-generated method stub
		System.out.println(log.replace("", " ").trim());
	}

	@Override
	public void Error(String error) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: " + error.replace("", " ").trim());
	}

}