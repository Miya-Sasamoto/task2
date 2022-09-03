package check;

import constants.Constants;

public class Check {
	
	private static final String firstName = "美也";
	private static final String lastName = "笹本";
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String  printName = lastName + firstName;
		
		System.out.println("privateNameメソッド⇨ "+ printName);
		
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
		
		
		
		
		
	}

}
