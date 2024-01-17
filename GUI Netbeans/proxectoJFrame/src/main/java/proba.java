
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author a22dianart
 */
public class proba {

    public static void main(String[] args) {
        Color color = Color.BLUE;
        System.out.println(color.toString());
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(color.getRed());
        sb.append(",");
        sb.append(color.getGreen());
        sb.append(",");
        sb.append(color.getBlue());
        sb.append("]");
        String texto = sb.toString();
        System.out.println(sb.toString());
        System.out.println("---------------");
        int index1 = texto.indexOf(",");
        int index2 = texto.lastIndexOf(",");
        System.out.println("primeiro: ");
        System.out.println(index1);
        System.out.println("segundo: ");
        System.out.println(index2);
        System.out.println(texto.substring(1, index1));

    }

}
