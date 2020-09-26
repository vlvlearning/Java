package Java_8_9;
import javax.script.*;

public class _js_ {
	public static void main(String[] args) throws Exception {
		// Creating script engine
		ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
		// Evaluating Nashorn code
		ee.eval("print('Hi Java');");
	}
}
