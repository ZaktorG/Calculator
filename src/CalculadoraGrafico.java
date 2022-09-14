import javax.swing.*;
import java.awt.*;

public class CalculadoraGrafico extends JFrame
{
    final static int WIDTH_FRAME = 300;
    final static int HEIGHT_FRAME = 450;
    public CalculadoraGrafico()
    {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        final Dimension tamanoPantalla = pantalla.getScreenSize();

        setSize(WIDTH_FRAME, HEIGHT_FRAME);//Tamaño de la ventana
        //Centramos el JFrame cuando aparezca
        setLocation((tamanoPantalla.width-WIDTH_FRAME)/2, (tamanoPantalla.height-HEIGHT_FRAME)/2);
        setResizable(false);
    }
}
