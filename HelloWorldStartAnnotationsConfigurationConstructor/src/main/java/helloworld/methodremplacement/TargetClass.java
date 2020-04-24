package helloworld.methodremplacement;

public class TargetClass {


		public String formatMessage(String msg) {
			return "<h1>" + msg + "</h1>";
		}

		public String formatMessage(Object msg) {
			return "<h2>" + msg + "</h2>";
		}
}
