package AIODemo;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Created by hzdmm on 2017/10/18.
 */
public class Calculator {
    private final static ScriptEngine jse =  new ScriptEngineManager().getEngineByName("JavaScript");

    public static Object cal(String expression) throws Exception{
        return jse.eval(expression);
    }
}
