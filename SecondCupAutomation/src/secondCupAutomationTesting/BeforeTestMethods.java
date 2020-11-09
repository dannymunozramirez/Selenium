package secondCupAutomationTesting;

import java.util.HashMap;
import java.util.Map;

import methodsForAutomationSC.UseMethods;
import staticsForAutomationSC.StaticsSC;

public class BeforeTestMethods {

	public static void main(String[] args) {

		// Instance to Generic-methods
		UseMethods sc = new UseMethods();
		StaticsSC st = new StaticsSC();

		String firstName = "Test";
		String lastName = "Test";
		String email = "Test";
		String password = "Test";

		Map<String, String> form = new HashMap<String, String>();
		form.put("FirstName", firstName);
		form.put("lastName", lastName);
		form.put("email", email);
		form.put("password", password);

		for (Map.Entry<String, String> entry : form.entrySet()) {
			if (entry.getKey().equals("FirstName")) {
				st.setName(form.get(entry.getValue()));
				System.out.println("First");
			}
			if (entry.getKey().equals("lastName")) {
				st.setLast(form.get(entry.getValue().toString()));
				System.out.println("second");
			}
			if (entry.getKey().equals("email")) {
				st.setEmail(form.get(entry.getValue().toString()));
				System.out.println("third");
			}
			if (entry.getKey().equals("password")) {
				st.setPassWord(form.get(entry.getValue().toString()));
				System.out.println("fourth");
			}

		}

		for (Map.Entry<String, String> entry : form.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

	}
}
