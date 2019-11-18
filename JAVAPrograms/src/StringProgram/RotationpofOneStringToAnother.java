package StringProgram;

public class RotationpofOneStringToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "EAT";
		String s2 = "ATE";

		boolean f = IsRotation(s1, s2);
		System.out.println(f);
	}

	private static boolean IsRotation(String s1, String s2) {
		// TODO Auto-generated method stub

		if (s1 == null || s2 == null) {
			return false;
		} else if (s1.length() != s2.length()) {
			return false;
		} else {
			if ((s1 + s1).contains(s2)) {
				return true;
			}
		}
		return false;
	}

}
