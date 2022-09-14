import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        CalculadoraGrafico grafico = new CalculadoraGrafico();
        grafico.setVisible(true);

        //Cuando se cierra la ventana se termina la ejecucion del programa
        grafico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
