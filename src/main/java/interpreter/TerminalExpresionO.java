package interpreter;

public class TerminalExpresionO extends AbstractExpresion{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("O")){
            // la interpretacion de la letra/simbolo y lo agregamos al output
            context.output= context.output+"4";
            // el borrado de la letra/simbolo ya interpretado en el input
            context.input=context.input.substring(1);
        }
    }
}
